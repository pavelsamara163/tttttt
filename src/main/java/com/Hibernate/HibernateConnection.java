package com.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.model.naming.CamelCaseToUnderscoresNamingStrategy;
import org.hibernate.cfg.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.concurrent.BlockingDeque;

public class HibernateConnection {
    public static void main(String[] args) throws SQLException {
            getGroup();
     /*   Configuration configuration = new Configuration();
        configuration.setPhysicalNamingStrategy(new CamelCaseToUnderscoresNamingStrategy());
        //configuration.addAnnotatedClass(Users.class);
        configuration.configure();
   ///Insert into в таблицу
        try (SessionFactory sessionFactory = configuration.buildSessionFactory();
             Session session = sessionFactory.openSession()) {
                session.beginTransaction();
            //Вставка в таблицу
            Users build = Users.builder()
                    .groupname("Домен : Тест")
                    .employees(44)
                    .build();
            session.save(build);
            //User.builder
            //System.out.println("Sucsessful");

            session.getTransaction().commit();
        }*/
    }
            ////Достаем обьеты из таблицы
    static void getGroup(){
        Configuration configuration = new Configuration();
        configuration.setPhysicalNamingStrategy(new CamelCaseToUnderscoresNamingStrategy());
        configuration.configure();

        try (SessionFactory sessionFactory = configuration.buildSessionFactory();
             Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.get(Users.class,1);
            System.out.println(session);
            session.getTransaction().commit();
            session.close();

        }
       /* configuration.configure();
             Session session = sessionFactory.getCurrentSession();
             session.beginTransaction();
            //Вставка в таблицу
            Users users = session.get(Users.class,1);
            System.out.println(users);

            session.getTransaction().commit();

            session.close();*/
        }
    }


