package ru.one.learning.hibernate.entity;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class SessionFactoryCreator {
    public static SessionFactory createSessionFactory(){
        SessionFactory sessionFactory =
                new MetadataSources(new StandardServiceRegistryBuilder().
                        configure("hibernate.cfg.xml").build()).
                        getMetadataBuilder().build().
                        getSessionFactoryBuilder().build();
        return sessionFactory;
    }
}
