package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.query.Query;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.exception.ConstraintViolationException;
import org.hibernate.query.NativeQuery;

import Entity.Autore;
import configuration.HibernateUtil;

public class autoreDaoImpl implements InterfacciaDao<Autore> {

    @Override
    public List<Autore> findAll() {

        List<Autore> autori = new ArrayList<>();

        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.openSession();

            // Query in linguaggio SQL

            NativeQuery<Autore> querySqlUno = session.createNativeQuery("SELECT * FROM Autore", Autore.class);
            autori = querySqlUno.getResultList();

            // Query in Linguaggio HQL
            // autori = session.find("FROM autore", , null) ...........

            session.close();

        } catch (HibernateException e) {
            e.printStackTrace();
            System.err.println("Eccezione Hibernate durante esecuzione query");

        } catch (Exception e) {
            System.err.println("Eccezione generica");

        }
        return autori;

    }

    @Override
    public Autore findbyId(Integer id) {
        Autore autore = null;

        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.openSession();
            Query<Autore> query = session.createQuery("from Autore where id = :id", Autore.class);
            query.setParameter("id", id);
            autore = query.getSingleResult();

            session.close();

        } catch (HibernateException e) {
            e.printStackTrace();
            System.err.println("Eccezione Hibernate durante esecuzione query");

        } catch (Exception e) {
            System.err.println("Eccezione generica");

        }

        return autore;

    }

    @Override
    public void insertMany(List<Autore> listaAutori) {
        Transaction transaction = null;

        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.openSession();
            transaction = session.beginTransaction();

            for (Autore autore : listaAutori) {
                session.merge(autore);
                // session.save(autore);
            }

            session.close();

        } catch (ConstraintViolationException e) {
            e.printStackTrace();
            System.err.println(" Eccezione Constraint");
            transaction.rollback();

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
