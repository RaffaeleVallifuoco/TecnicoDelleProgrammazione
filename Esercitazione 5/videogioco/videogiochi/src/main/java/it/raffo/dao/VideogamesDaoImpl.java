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

import it.raffo.model.Videogioco;

public class VideogamesDaoImpl implements DaoInterface<Videogioco> {

    // FIND ALL

    @Override
    public List<Videogioco> findAll() {

        List<Videogioco> games = new ArrayList<>();

        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.openSession();

            Query<Videogioco> queryHql = session.createQuery("FROM Videogioco", Videogioco.class);
            games = queryHql.getResultList();

            session.close();

        } catch (HibernateException e) {
            e.printStackTrace();
            System.err.println("Eccezione Hibernate durante esecuzione query");

        } catch (Exception e) {
            System.err.println("Eccezione generica");

        }
        return games;

    }

    // INSERT

    @Override
    public void insertMany(List<Videogioco> games) {

        Transaction transaction = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();

            for (Videogioco game : games) {
                session.merge(game);
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
