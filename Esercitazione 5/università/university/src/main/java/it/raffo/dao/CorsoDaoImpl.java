package it.raffo.dao;

import java.util.List;
import java.util.ArrayList;
import org.hibernate.query.Query;
import it.raffo.config.HibernateUtils;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.exception.ConstraintViolationException;

import it.raffo.model.Corso;

public class CorsoDaoImpl implements DaoInterface<Corso> {

    @Override
    public List<Corso> findAll() {
        List<Corso> corsi = new ArrayList<>();

        try {
            SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
            Session session = sessionFactory.openSession();

            Query<Corso> queryHql = session.createQuery("FROM Corso", Corso.class);
            corsi = queryHql.getResultList();

            session.close();

        } catch (HibernateException e) {
            e.printStackTrace();
            System.err.println("Eccezione Hibernate durante esecuzione query");

        } catch (Exception e) {
            System.err.println("Eccezione generica");

        }
        return corsi;
    }

    @Override
    public Corso findbyId(Integer id) {
        Corso corso = null;

        try {
            SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
            Session session = sessionFactory.openSession();

            Query<Corso> queryHql = session.createQuery("FROM Corso WHERE id = :id", Corso.class);
            queryHql.setParameter("id", id);
            corso = queryHql.uniqueResult();

            session.close();

        } catch (HibernateException e) {
            e.printStackTrace();
            System.err.println("Eccezione Hibernate durante esecuzione query");

        } catch (Exception e) {
            System.err.println("Eccezione generica");

        }
        return corso;
    }

    @Override
    public void insertMany(List<Corso> corsi) {
        Transaction transaction = null;

        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();

            for (Corso corso : corsi) {
                session.merge(corso);
            }

            transaction.commit();
        } catch (ConstraintViolationException e) {
            e.printStackTrace();
            System.err.println(" Eccezione Constraint");
            if (transaction != null)
                transaction.rollback();

        } catch (HibernateException e) {
            e.printStackTrace();
            System.err.println("Eccezione Hibernate durante esecuzione query");
            if (transaction != null)
                transaction.rollback();

        } catch (Exception e) {
            System.err.println("Eccezione generica");
            if (transaction != null)
                transaction.rollback();

        }
    }
}
