package configuration;

import com.mysql.cj.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

// gestione configurazione Hibernate
public class HibernateUtil {

    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        }
        return sessionFactory;
    }
}
