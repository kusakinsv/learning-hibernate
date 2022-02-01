package ru.one.learning.hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class MainApp {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    }
}
