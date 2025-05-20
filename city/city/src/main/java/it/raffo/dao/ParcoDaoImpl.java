package it.raffo.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.exception.ConstraintViolationException;
import org.hibernate.query.Query;

import it.raffo.configuration.HibernateUtil;
import it.raffo.model.Parco;

public class ParcoDaoImpl implements DaoInterface<Parco> {

    @Override
    public void insert(Parco istance) {

        Transaction transaction = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();

            session.merge(istance);
            transaction.commit();

        } catch (ConstraintViolationException e) {

            e.printStackTrace();

            System.err.println("Violazione di vincolo durante insertMany");

            if (transaction != null)
                transaction.rollback();

        } catch (HibernateException e) {

            e.printStackTrace();

            System.err.println("Eccezione Hibernate durante insertMany");

            if (transaction != null)
                transaction.rollback();

        } catch (Exception e) {

            System.err.println("Eccezione generica in insert");
            e.printStackTrace();

            if (transaction != null)
                transaction.rollback();

        }
    }

    @Override
    public List<Parco> findAll() {
        List<Parco> parchi = new ArrayList<>();

        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.openSession();

            Query<Parco> queryHql = session.createQuery("FROM Parco", Parco.class);
            parchi = queryHql.getResultList();

            session.close();

        } catch (HibernateException e) {
            e.printStackTrace();
            System.err.println("Eccezione Hibernate durante esecuzione query");

        } catch (Exception e) {
            System.err.println("Eccezione generica");

        }
        return parchi;

    }

    @Override
    public void remove(Integer pk) {
        Parco parco = new Parco();
        Transaction transaction = null;

        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.openSession();
            transaction = session.beginTransaction();

            // Query<Parco> queryHql = session.createQuery("FROM Citta where id = :id",
            // Parco.class);
            // queryHql.setParameter("id", pk);
            parco = session.find(Parco.class, pk);
            session.remove(parco);
            transaction.commit();
            session.close();

        } catch (HibernateException e) {
            e.printStackTrace();
            System.err.println("Eccezione Hibernate durante esecuzione query");
            transaction.rollback();

        } catch (Exception e) {
            System.err.println("Eccezione generica");
            transaction.rollback();

        }

    }

    @Override
    public void update(Integer id, String updatedValue) {
        Parco parco = new Parco();
        Transaction transaction = null;

        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.openSession();
            transaction = session.beginTransaction();

            parco = session.find(Parco.class, id);
            parco.setNome(updatedValue);
            session.merge(parco);
            transaction.commit();
            session.close();

        } catch (HibernateException e) {
            e.printStackTrace();
            System.err.println("Eccezione Hibernate durante esecuzione query");
            transaction.rollback();

        } catch (Exception e) {
            System.err.println("Eccezione generica");
            transaction.rollback();

        }
    }

}
