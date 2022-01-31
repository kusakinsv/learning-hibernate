package ru.one.learning.hibernate.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class DeveloperApplication {
    SessionFactory sessionFactory = SessionFactoryCreator.createSessionFactory();

    public static void main(String[] args) {

        DeveloperApplication developerApplication = new DeveloperApplication();
//        System.out.println("Добавляем Developers...");
//        developerApplication.addDeveloper("Sergei", "DeveloperXML", "Java DeveloperXML", 1);
        developerApplication.addDeveloper("Som1e", "DeveloperXML", "C++ DeveloperXML", 2);
        developerApplication.addDeveloper("Anton", "Semenov", "Driver", 4);
        List<DeveloperXML> dev = developerApplication.listDevelopers();
        dev.forEach(x-> System.out.println(x.toString()));
//        developerApplication.removeDeveloper(2);
//        developerApplication.updateDeveloper(1, 2);
//        dev = developerApplication.listDevelopers();
//        dev.forEach(x-> System.out.println(x.toString()));
    }

    public void addDeveloper(String firstName, String lastName, String specialty, int experience) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        transaction = session.beginTransaction();
        Developer developer = new Developer(firstName, lastName, specialty, experience);
        session.save(developer);
        transaction.commit();
        session.close();
    }

    public List listDevelopers() {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        List developers = session.createQuery("FROM Developer").list();

        transaction.commit();
        session.close();
        return developers;
    }

    public void updateDeveloper(int developerId, int experience) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        DeveloperXML developerXML = (DeveloperXML) session.get(DeveloperXML.class, developerId);
        developerXML.setExperience(experience);
        session.update(developerXML);
        transaction.commit();
        session.close();
    }

    public void removeDeveloper(int developerId) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        DeveloperXML developerXML = (DeveloperXML) session.get(DeveloperXML.class, developerId);
        session.delete(developerXML);
        transaction.commit();
        session.close();
    }



}
