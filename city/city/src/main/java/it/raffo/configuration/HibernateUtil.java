package it.raffo.configuration;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import it.raffo.model.City;
import it.raffo.model.Parco;

public class HibernateUtil {

    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            Configuration config = new Configuration();
            Properties settings = new Properties();

            settings.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
            settings.put(Environment.URL, "jdbc:mysql://localhost:3306/db_city");
            settings.put(Environment.USER, "root");
            settings.put(Environment.PASS, "DJvirtual3D");
            settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
            settings.put(Environment.SHOW_SQL, "true");
            settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
            settings.put(Environment.HBM2DDL_AUTO, "create-drop");

            // setto le proprietà in config
            config.setProperties(settings);

            // Mappo le entità
            config.addAnnotatedClass(City.class);
            config.addAnnotatedClass(Parco.class);

            // Creo il registro dei servizi
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties())
                    .build();

            // creo la sessionFactory passandogli il registro dei servizi
            sessionFactory = config.buildSessionFactory(serviceRegistry);

        }

        return sessionFactory;
    }

}
