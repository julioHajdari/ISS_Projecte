package utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.Connection;

public class Utils {

    private static SessionFactory DB_SESSION = null;

    public static SessionFactory getDbSession() {
        if (DB_SESSION == null) {
            DB_SESSION = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        }
        return DB_SESSION;
    }
}

