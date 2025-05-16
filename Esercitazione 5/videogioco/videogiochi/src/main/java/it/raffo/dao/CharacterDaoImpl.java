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
import it.raffo.model.Personaggio;

public class CharacterDaoImpl implements DaoInterface<Personaggio> {

    // FIND ALL

    @Override
    public List<Personaggio> findAll() {

        List<Personaggio> characters = new ArrayList<>();

        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.openSession();

            Query<Personaggio> queryHql = session.createQuery("FROM Personaggio", Personaggio.class);
            characters = queryHql.getResultList();

            session.close();

        } catch (HibernateException e) {
            e.printStackTrace();
            System.err.println("Eccezione Hibernate durante esecuzione query");

        } catch (Exception e) {
            System.err.println("Eccezione generica");

        }
        return characters;

    }

    // INSERT

    @Override
    public void insertMany(List<Personaggio> characters) {

        Transaction transaction = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();

            for (Personaggio character : characters) {
                session.merge(character);
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
