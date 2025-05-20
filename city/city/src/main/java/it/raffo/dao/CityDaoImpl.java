package it.raffo.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.exception.ConstraintViolationException;
import org.hibernate.query.Query;

import it.raffo.configuration.HibernateUtil;
import it.raffo.model.City;

public class CityDaoImpl implements DaoInterface<City> {

    @Override
    public void insert(City istance) {
      
    Transaction transaction = null;

    try (Session session = HibernateUtil.getSessionFactory().openSession()) {

    transaction = session.beginTransaction();


    session.merge(istance);
    transaction.commit();

} catch (ConstraintViolationException e) {

e.printStackTrace();

System.err.println("Violazione di vincolo durante insertMany");

if (transaction != null) transaction.rollback();

} catch (HibernateException e) {

e.printStackTrace();

System.err.println("Eccezione Hibernate durante insertMany");

if (transaction != null) transaction.rollback();

} catch (Exception e) {

System.err.println("Eccezione generica in insert");

if (transaction != null) transaction.rollback();

}

    @Override
    public List<City> findAll() {
        List<City> cities = new ArrayList<>();

        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.openSession();

            Query<City> queryHql = session.createQuery("FROM Citta", City.class);
            cities = queryHql.getResultList();

            session.close();

        } catch (HibernateException e) {
            e.printStackTrace();
            System.err.println("Eccezione Hibernate durante esecuzione query");

        } catch (Exception e) {
            System.err.println("Eccezione generica");

        }
        return cities;

    }

    @Override
    public void remove(Integer pk) {
        City citta = new City();
        Transaction transaction = null;

        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.openSession();
            transaction = session.beginTransaction();

            // Query<City> queryHql = session.createQuery("FROM Citta where id = :id",
            // City.class);
            // queryHql.setParameter("id", pk);
            citta = session.find(City.class, pk);
            session.remove(citta);
            transaction.commit();
            session.close();

        } catch (HibernateException e) {
            e.printStackTrace();
            System.err.println("Eccezione Hibernate durante esecuzione query");
            transaction.rollback();

        } catch (Exception e) {
            System.err.println("Eccezione generica");
            transaction.rollback();

        }

    }

    @Override
    public void update(Integer id, String updatedValue) {
        City citta = new City();
        Transaction transaction = null;

        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.openSession();
            transaction = session.beginTransaction();

            citta = session.find(City.class, id);
            citta.setNome(updatedValue);
            session.merge(citta);
            transaction.commit();
            session.close();

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
