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
import it.raffo.model.Utente;

public class UtenteDaoImpl implements DaoInterface<Utente> {

    // FIND ALL

    @Override
    public List<Utente> findAll() {

        List<Utente> utenti = new ArrayList<>();

        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.openSession();

            Query<Utente> queryHql = session.createQuery("FROM Utente", Utente.class);
            utenti = queryHql.getResultList();

            session.close();

        } catch (HibernateException e) {
            e.printStackTrace();
            System.err.println("Eccezione Hibernate durante esecuzione query");

        } catch (Exception e) {
            System.err.println("Eccezione generica");

        }
        return utenti;

    }

    // INSERT

    @Override
    public void insertMany(List<Utente> utenti) {

        Transaction transaction = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();

            for (Utente utente : utenti) {
                session.merge(utente);
            }

            transaction.commit();
            session.close();
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
            System.err.println("Eccezione generica");
            if (transaction != null)
                transaction.rollback();

        }
    }
}
