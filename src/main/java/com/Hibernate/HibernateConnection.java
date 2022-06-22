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
    private String groups;
    private int emp;
    public static void main(String[] args) throws SQLException {
        //Метод вызывающий записи из таблицы
           // getGroup();
            //Метод вставляющий записи в таблицу
           setGroup("Саdsыыылют",224 );


    /* Configuration configuration = new Configuration();
        configuration.setPhysicalNamingStrategy(new CamelCaseToUnderscoresNamingStrategy());
        //configuration.addAnnotatedClass(Users.class);
        configuration.configure();
   ///Insert into в таблицу
        try (SessionFactory sessionFactory = configuration.buildSessionFactory();
             Session session = sessionFactory.openSession()) {
                session.beginTransaction();*/
            //Вставка в таблицу
          /*  Users build = Users.builder()
                    .groupname("Домен :Привет ")
                    .employees(23)
                    .build();
            session.save(build);
            //User.builder
            System.out.println("Sucsessful");

            session.getTransaction().commit();*/

           // Users users = Users.builder().groupname("Домен : ПУ.Аварий24x7").build() ;
           // System.out.println(users);
           // session.getTransaction().commit();
           // sessionFactory.close();




    }
            ////Достаем записи из таблицы
    static void getGroup() {
        Configuration configuration = new Configuration();
        configuration.setPhysicalNamingStrategy(new CamelCaseToUnderscoresNamingStrategy());
        configuration.configure();

        try (SessionFactory sessionFactory = configuration.buildSessionFactory();
             Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            Users usersGetBD = session.get(Users.class, 1L);
            System.out.println(usersGetBD);
            session.getTransaction().commit();
            session.close();

        }
    }
        static void setGroup(String group,int emp) {
               String a =  group ;
               int b = emp;

            Configuration configuration = new Configuration();
            configuration.setPhysicalNamingStrategy(new CamelCaseToUnderscoresNamingStrategy());
            configuration.configure();


        try (SessionFactory sessionFactory = configuration.buildSessionFactory();
             Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            //Вставка в таблицу
            Users build = Users.builder()
                    .groupname(a)
                    .employees(b)
                    .build();
            session.save(build);
            //User.builder
            System.out.println("Sucsessful");

            session.getTransaction().commit();
        }
    }
}


