package dao;

import java.util.List;

import java.util.ArrayList;

import org.hibernate.query.Query;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.exception.ConstraintViolationException;
import org.hibernate.query.NativeQuery;

import Entity.Libro;
import configuration.HibernateUtil;

public class LibroDaoImpl implements InterfacciaDao<Libro> {

    @Override
    public List<Libro> findAll() {

        List<Libro> autori = new ArrayList<>();

        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.openSession();

            // Query in linguaggio SQL

            NativeQuery<Libro> querySqlUno = session.createNativeQuery("SELECT * FROM libro", Libro.class);
            autori = querySqlUno.getResultList();

            // Query in Linguaggio HQL
            // autori = session.find("FROM libro", , null) ...........

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
    public Libro findbyId(Integer id) {
        Libro libro = null;

        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.openSession();
            Query<Libro> query = session.createQuery("from<Libro where id = :id", Libro.class);
            query.setParameter("id", id);
            libro = query.getSingleResult();

            session.close();

        } catch (HibernateException e) {
            e.printStackTrace();
            System.err.println("Eccezione Hibernate durante esecuzione query");

        } catch (Exception e) {
            System.err.println("Eccezione generica");

        }

        return libro;

    }

    @Override
    public void insertMany(List<Libro> listaAutori) {
        Transaction transaction = null;

        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.openSession();
            transaction = session.beginTransaction();

            for (Libro libro : listaAutori) {
                session.save(libro);
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