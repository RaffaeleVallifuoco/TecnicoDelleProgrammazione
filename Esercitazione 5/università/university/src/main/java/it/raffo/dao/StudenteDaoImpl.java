package it.raffo.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.exception.ConstraintViolationException;
import org.hibernate.query.Query;

import it.raffo.model.Studente;
import it.raffo.config.HibernateUtils;

public class StudenteDaoImpl implements DaoInterface<Studente> {

    @Override
    public List<Studente> findAll() {

        List<Studente> students = new ArrayList<>();

        try {
            SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
            Session session = sessionFactory.openSession();

            Query<Studente> queryHql = session.createQuery("FROM Studente", Studente.class);
            students = queryHql.getResultList();

            session.close();

        } catch (HibernateException e) {
            e.printStackTrace();
            System.err.println("Eccezione Hibernate durante esecuzione query");

        } catch (Exception e) {
            System.err.println("Eccezione generica");

        }
        return students;

    }

    @Override
    public Studente findbyId(Integer id) {
        Studente student = null;

        try {
            SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
            Session session = sessionFactory.openSession();

            Query<Studente> queryHql = session.createQuery("FROM Studente WHERE id = :id", Studente.class);
            queryHql.setParameter("id", id);
            student = queryHql.uniqueResult();

            session.close();

        } catch (HibernateException e) {
            e.printStackTrace();
            System.err.println("Eccezione Hibernate durante esecuzione query");

        } catch (Exception e) {
            System.err.println("Eccezione generica");

        }
        return student;
    }

    // INSERT

    @Override
    public void insertMany(List<Studente> students) {

        Transaction transaction = null;

        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();

            for (Studente student : students) {
                session.merge(student);
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
            e.printStackTrace();
            System.err.println("Eccezione generica");
            if (transaction != null)
                transaction.rollback();

        }
    }

}
