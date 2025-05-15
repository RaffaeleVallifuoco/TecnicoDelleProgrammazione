package it.raffo.dao;

import java.util.List;

import java.util.ArrayList;

import org.hibernate.query.Query;

import it.raffo.configuration.HibernateUtil;
import it.raffo.model.Auto;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.exception.ConstraintViolationException;
import org.hibernate.query.NativeQuery;

public class AutoDaoImpl implements InterfacciaDao<Auto> {

    @Override
    public List<Auto> findAll() {

        List<Auto> cars = new ArrayList<>();

        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.openSession();

            // Query in linguaggio SQL

            NativeQuery<Auto> querySqlUno = session.createNativeQuery("SELECT * FROM auto", Auto.class);
            cars = querySqlUno.getResultList();

            // Query in Linguaggio HQL
            // autori = session.find("FROM libro", , null) ...........

            session.close();

        } catch (HibernateException e) {
            e.printStackTrace();
            System.err.println("Eccezione Hibernate durante esecuzione query");

        } catch (Exception e) {
            System.err.println("Eccezione generica");

        }
        return cars;

    }

    @Override
    public Auto findbyId(Integer id) {
        Auto car = null;

        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.openSession();
            Query<Auto> query = session.createQuery("from<Auto where id = :id", Auto.class);
            query.setParameter("id", id);
            car = query.getSingleResult();

            session.close();

        } catch (HibernateException e) {
            e.printStackTrace();
            System.err.println("Eccezione Hibernate durante esecuzione query");

        } catch (Exception e) {
            System.err.println("Eccezione generica");

        }

        return car;

    }

    @Override
    public void insertMany(List<Auto> cars) {
        Transaction transaction = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();

            for (Auto car : cars) {
                session.merge(car);
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
