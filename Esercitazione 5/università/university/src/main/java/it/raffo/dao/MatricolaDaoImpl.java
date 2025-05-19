package it.raffo.dao;

import it.raffo.model.Matricola;

import java.util.List;
import java.util.ArrayList;
import org.hibernate.query.Query;
import it.raffo.config.HibernateUtils;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.exception.ConstraintViolationException;

public class MatricolaDaoImpl implements DaoInterface<Matricola> {

    @Override
    public List<Matricola> findAll() {
        List<Matricola> matricole = new ArrayList<>();

        try {
            SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
            Session session = sessionFactory.openSession();

            Query<Matricola> queryHql = session.createQuery("FROM Matricola", Matricola.class);
            matricole = queryHql.getResultList();

            session.close();

        } catch (HibernateException e) {
            e.printStackTrace();
            System.err.println("Eccezione Hibernate durante esecuzione query");

        } catch (Exception e) {
            System.err.println("Eccezione generica");

        }
        return matricole;
    }

    @Override
    public Matricola findbyId(Integer id) {
        Matricola matricola = null;

        try {
            SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
            Session session = sessionFactory.openSession();

            Query<Matricola> queryHql = session.createQuery("FROM Matricola WHERE id = :id", Matricola.class);
            queryHql.setParameter("id", id);
            matricola = queryHql.uniqueResult();

            session.close();

        } catch (HibernateException e) {
            e.printStackTrace();
            System.err.println("Eccezione Hibernate durante esecuzione query");

        } catch (Exception e) {
            System.err.println("Eccezione generica");

        }
        return matricola;
    }

    @Override
    public void insertMany(List<Matricola> matricole) {
        Transaction transaction = null;

        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();

            for (Matricola m : matricole) {
                session.merge(m);
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
