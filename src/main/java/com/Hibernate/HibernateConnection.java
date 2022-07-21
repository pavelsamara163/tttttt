package com.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.model.naming.CamelCaseToUnderscoresNamingStrategy;
import org.hibernate.cfg.Configuration;

import java.sql.SQLException;
import java.util.*;

public class HibernateConnection {
    private String groups;
    private int emp;

    public static void main(String[] args) throws SQLException {

        //Метод вызывающий название отдела по ID записи из таблицы
        //getGroup(12);
        //Метод вставляющий запись  в таблицу Users (id,название отдела,кол-во сотрудников)
        // setGroup("Privet",4211 );
        // Метод для модификации названия отдела - поиск отдела по ID;
        //  setGroupName("Donon",12);
        // Метод для модификации   названия группы (пункт 6) из вложенного класса;
         // InnerGroup.setGroupPuName("VsegO_HoroShegO",1);
         //Метод, возвращающий массив названий всех групп;
          //  InnerGroup.getGroupPuNameAll();
        // Метод для получения кол-во сотрудников в группе по её названию;
           // InnerGroup.getGroupPuName("Domen_pelmen");
            //Метод для модификации значения кол-во сотрудников группы по её названию;
           // InnerGroup.setEmpForGroupPuName("Domen: PU24x7",71);
        //Метод, возвращающий массив кол-ва сотрудников группы;
       // InnerGroup.getGroupPuEmpAll();
        // метод добавления названия группы и ее кол-во сотрудников (путем создания нового массива групп с использованием метода Arrays.copyOf());
          //  InnerGroup.setGroupPuNameAndEmployes("Domen: PU24x7",69);
        //12)метод удаления группы с указанием названия и кол-ва сотрудников( с использованием методов System.arraycopy, Arrays.copyOf());
          //  InnerGroup.deleteGroupNameAndEmployees("Domen: PU24x7",65);
        //13)Метод для получения размера массива Групп.
       // InnerGroup.massiveGroup();



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
    static void getGroup(int id) {
        Configuration configuration = new Configuration();
        configuration.setPhysicalNamingStrategy(new CamelCaseToUnderscoresNamingStrategy());
        configuration.configure();

        try (SessionFactory sessionFactory = configuration.buildSessionFactory();
             Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            Users usersGetBD = session.get(Users.class, id);
            System.out.println(usersGetBD);
            session.getTransaction().commit();
            session.close();

        }
    }

    static void setGroup(String group, int emp) {
        String a = group;
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

    static void setGroupName(String groupName, int id) {
        Configuration configuration = new Configuration();
        configuration.setPhysicalNamingStrategy(new CamelCaseToUnderscoresNamingStrategy());
        configuration.configure();
        try (SessionFactory sessionFactory = configuration.buildSessionFactory();
             Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            //Изменение названия отдела по ID
            Users users = session.get(Users.class, id);
            System.out.println("Было - " + users);
            users.setGroupname(groupName);

            System.out.println("Стало " + users);

            session.getTransaction().commit();
            sessionFactory.close();
        }
    }
    static class InnerGroup {
        String nameInnerGroup;
        int empInnerGroup;

        public InnerGroup() {

        }

        public InnerGroup(String[] allGroup) {

        }


        static void setGroupPuName(String groupName, int id) {
            Configuration configuration = new Configuration();
            configuration.setPhysicalNamingStrategy(new CamelCaseToUnderscoresNamingStrategy());
            configuration.configure();
            try (SessionFactory sessionFactory = configuration.buildSessionFactory();
                 Session session = sessionFactory.openSession()) {
                session.beginTransaction();
                //Изменение названия отдела по ID
                GroupPU groupPU = session.get(GroupPU.class, id);
                System.out.println("Было - " + groupPU);
                groupPU.setGroupname(groupName);

                System.out.println("Стало " + groupName);

                session.getTransaction().commit();
                sessionFactory.close();
            }
        }

        static void getGroupPuNameAll() {

            Configuration configuration = new Configuration();
            configuration.setPhysicalNamingStrategy(new CamelCaseToUnderscoresNamingStrategy());
            configuration.configure();
            try (SessionFactory sessionFactory = configuration.buildSessionFactory();
                 Session session = sessionFactory.openSession()) {
                session.beginTransaction();
                //Вывод всех групп через массив
                List<GroupPU> groupPU = session.createQuery("SELECT groupname FROM GroupPU pu ", GroupPU.class).getResultList();

                System.out.println(groupPU);
                session.getTransaction().commit();
                sessionFactory.close();
            }

        }

        static void getGroupPuName(String nameInnerGroup) {

            Configuration configuration = new Configuration();
            configuration.setPhysicalNamingStrategy(new CamelCaseToUnderscoresNamingStrategy());
            configuration.configure();
            try (SessionFactory sessionFactory = configuration.buildSessionFactory();
                 Session session = sessionFactory.openSession()) {
                session.beginTransaction();
                GroupPU groupPU = session.createQuery("SELECT pu FROM GroupPU pu where pu.groupname = :groupname ", GroupPU.class)
                        .setParameter("groupname", nameInnerGroup)
                        .getSingleResult();
                System.out.println(groupPU.getEmployees());
                session.getTransaction().commit();
                session.close();

            }

        }

        static void setEmpForGroupPuName(String nameInnerGroup, int empInnerGroup) {

            Configuration configuration = new Configuration();
            configuration.setPhysicalNamingStrategy(new CamelCaseToUnderscoresNamingStrategy());
            configuration.configure();
            try (SessionFactory sessionFactory = configuration.buildSessionFactory();
                 Session session = sessionFactory.openSession()) {
                session.beginTransaction();

                GroupPU groupPU = session.createQuery("SELECT pu FROM GroupPU pu where pu.groupname = :groupname ", GroupPU.class)
                        .setParameter("groupname", nameInnerGroup)
                        .getSingleResult();
                System.out.println("Было " + groupPU);
                groupPU.setEmployees(empInnerGroup);
                System.out.println("Стало " + groupPU);
                session.getTransaction().commit();
                session.close();

            }

        }

        static void getGroupPuEmpAll() {

            Configuration configuration = new Configuration();
            configuration.setPhysicalNamingStrategy(new CamelCaseToUnderscoresNamingStrategy());
            configuration.configure();
            try (SessionFactory sessionFactory = configuration.buildSessionFactory();
                 Session session = sessionFactory.openSession()) {
                session.beginTransaction();
                //Вывод всех групп через массив
                List<GroupPU> groupPU = session.createQuery("SELECT employees FROM GroupPU pu ", GroupPU.class).getResultList();

                System.out.println(groupPU);
                session.getTransaction().commit();
                sessionFactory.close();
            }

        }

        static void setGroupPuNameAndEmployes( String nameInnerGroup,int empInnerGroup) {

            Configuration configuration = new Configuration();
            configuration.setPhysicalNamingStrategy(new CamelCaseToUnderscoresNamingStrategy());
            configuration.configure();
            try (SessionFactory sessionFactory = configuration.buildSessionFactory();
                 Session session = sessionFactory.openSession()) {
                session.beginTransaction();
                //Вывод всех групп через массив
                List<GroupPU> groupPU = session.createQuery("FROM GroupPU", GroupPU.class).getResultList();
                //Далее вставку производим уже с копией
                System.out.println("Список через коллекцию GroupPU - " + groupPU );
                List<GroupPU> copy = new ArrayList<>(groupPU);
                System.out.println("Список через копию коллекции copy  - " + copy );
                copy = Collections.singletonList(GroupPU.builder().groupname(nameInnerGroup).employees(empInnerGroup).build());
                System.out.println("Вставка через копию коллекции -  copy  - " + copy );
                session.save(copy.get(copy.size()-1));

                session.getTransaction().commit();
                sessionFactory.close();
            }

        }
        static void deleteGroupNameAndEmployees(String nameInnerGroup,int empInnerGroup){
            Configuration configuration = new Configuration();
            configuration.setPhysicalNamingStrategy(new CamelCaseToUnderscoresNamingStrategy());
            configuration.configure();
            try (SessionFactory sessionFactory = configuration.buildSessionFactory();
                 Session session = sessionFactory.openSession()) {
                session.beginTransaction();
                //Вывод всех групп через массив
                List<GroupPU> groupPU = session.createQuery("FROM GroupPU where employees= :empInnerGroup and groupname = :nameInnerGroup ", GroupPU.class)
                                .setParameter("empInnerGroup",empInnerGroup)
                        .setParameter("nameInnerGroup",nameInnerGroup)
                        .getResultList();
                //Далее вставку производим уже с копией
                System.out.println("Список через коллекцию GroupPU - " + groupPU );
                List<GroupPU> copy = new ArrayList<>(groupPU);
                System.out.println("Список через копию коллекции copy  - " + copy );
                System.out.println("Удаление через копию коллекции -  copy  - " + copy );
                session.delete(copy.get(copy.size()-1));
                //session.save(copy);


                session.getTransaction().commit();
                session.close();
                sessionFactory.close();
            }
        }
        //Метод для получения размера массива Групп.
            static void massiveGroup() {
                Configuration configuration = new Configuration();
                configuration.setPhysicalNamingStrategy(new CamelCaseToUnderscoresNamingStrategy());
                configuration.configure();
                try (SessionFactory sessionFactory = configuration.buildSessionFactory();
                     Session session = sessionFactory.openSession()) {
                    session.beginTransaction();
                    //Вывод всех групп через массив
                    List<GroupPU> groupPU = session.createQuery("FROM GroupPU ", GroupPU.class).getResultList();
                    System.out.println("В массиве групп : " + groupPU.size() );
                }
            }
    }

}


