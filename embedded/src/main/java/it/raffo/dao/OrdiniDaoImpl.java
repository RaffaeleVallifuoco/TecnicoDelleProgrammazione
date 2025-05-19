package it.raffo.dao;

import java.util.List;
import java.util.ArrayList;
import org.hibernate.query.Query;
import it.raffo.configuration.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.exception.ConstraintViolationException;

import it.raffo.model.Ordine;

public class OrdiniDaoImpl implements DaoInterface<Ordine> {

    // FIND ALL

    @Override
    public List<Ordine> findAll() {

        List<Ordine> ordini = new ArrayList<>();

        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.openSession();

            Query<Ordine> queryHql = session.createQuery("FROM Ordine", Ordine.class);
            ordini = queryHql.getResultList();

            session.close();

        } catch (HibernateException e) {
            e.printStackTrace();
            System.err.println("Eccezione Hibernate durante esecuzione query");

        } catch (Exception e) {
            System.err.println("Eccezione generica");

        }
        return ordini;

    }

    // INSERT

    @Override
    public void insertMany(List<Ordine> ordini) {

        Transaction transaction = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();

            for (Ordine ordine : ordini) {
                session.merge(ordine);
            }

            transaction.commit();
            session.close();
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
            e.printStackTrace();
            if (transaction != null)
                transaction.rollback();

        } finally {

        }
    }

}
