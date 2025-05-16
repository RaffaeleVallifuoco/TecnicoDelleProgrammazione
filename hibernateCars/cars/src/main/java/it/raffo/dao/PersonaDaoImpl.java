package it.raffo.dao;

import java.util.List;
import java.util.ArrayList;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.exception.ConstraintViolationException;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import it.raffo.configuration.HibernateUtil;
import it.raffo.model.Persona;

public class PersonaDaoImpl implements InterfacciaDao<Persona> {

    // FIND ALL

    @Override
    public List<Persona> findAll() {
        List<Persona> persone = new ArrayList<>();

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            NativeQuery<Persona> query = session.createNativeQuery("SELECT * FROM persona", Persona.class);
            persone = query.getResultList();
        } catch (HibernateException e) {
            e.printStackTrace();
            System.err.println("Eccezione Hibernate durante esecuzione query");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Eccezione generica");
        }

        return persone;
    }

    // FIND BY ID

    @Override
    public Persona findbyId(Integer id) {
        Persona persona = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query<Persona> query = session.createQuery("FROM Persona WHERE id = :id", Persona.class);
            query.setParameter("id", id);
            persona = query.getSingleResult();
        } catch (HibernateException e) {
            e.printStackTrace();
            System.err.println("Eccezione Hibernate durante esecuzione query");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Eccezione generica");
        }

        return persona;
    }

    // INSERT

    @Override
    public void insertMany(List<Persona> persone) {
        Transaction transaction = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();

            for (Persona persona : persone) {
                session.merge(persona);
            }

            transaction.commit();
        } catch (ConstraintViolationException e) {
            e.printStackTrace();
            System.err.println("Eccezione Constraint");
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
