
import com.Hibernate.HibernateConnection;
import com.Hibernate.Users;

import java.util.HashMap;
import java.util.Scanner;

public class Group_test_nx  extends HibernateConnection {
    private static String group = "Домен Продукты и Услуги";
    private static int group_emp = 10;
    private static String group1 = "Домен ПУ";
    private static int group_emp1 = 20;
    private static String group2 = "Домен ПУ.Аварий24x7";
    private static int group_emp2 = 30;
    private static int emploees = 0;





    public   Group_test_nx(String [] a) {

    }

    public static String getGroup() {
        // System.out.println(group);
        return group;
    }

    public static void setGroup(String group) {
        Group_test_nx.group = group;
        System.out.println(group);
    }

    public static String getGroup1() {
        return group1;
    }

    public static void setGroup1(String group1) {
        Group_test_nx.group1 = group1;
    }

    public static String getGroup2() {
        return group2;
    }

    public static void setGroup2(String group2) {
        Group_test_nx.group2 = group2;
    }
    private static void allGroup () {
        String[] a = new String[]{group, group1, group2};
        for (String b : a) {
            System.out.println("Группа : " + b);
        }
    }

    private static void emploeesName_Group (String a){
        HashMap<String,Integer> empAndNames = new HashMap<String, Integer>();
        empAndNames.put(group,group_emp);
        empAndNames.put(group1,group_emp1);
        empAndNames.put(group2,group_emp2);
        if (a == group){
            System.out.println(group + ". Кол-во сотрудников : "  +  empAndNames.get(group));
        } else if (a == group1) {
            System.out.println(group1 + ". Кол-во сотрудников : "  +  empAndNames.get(group1));
        }else {
            System.out.println(group2 + ". Кол-во сотрудников : "  +  empAndNames.get(group2));
        }


    }
    private static void modifEmploeesName_Group (String a,int b){
        HashMap<String,Integer> empAndNames = new HashMap<String, Integer>();
        empAndNames.put(group,group_emp);
        empAndNames.put(group1,group_emp1);
        empAndNames.put(group2,group_emp2);
        if (a == group ){
            System.out.println(group + " . "  + " Кол-во сотрудников : " + b );
        } else if (a == group1 ){
            System.out.println(group1 + " . "  + " Кол-во сотрудников : " + b );
        }else if (a == group2 ){
            System.out.println(group2 + " . "  + " Кол-во сотрудников : " + b );
        }


    }

    public static void main(String[] args) {
         HibernateConnection hibernateConnection = new HibernateConnection();
/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Домен : " + group);
        System.out.print("Введите кол-во сотрудников " ) ; emploees = Integer.parseInt(scanner.nextLine());
        System.out.println("В " + group + ". Кол-во сотрудников : "+ emploees);
        */
         //Метод вызова название группы
        
         System.out.println("1) " + getGroup());
        //Метод замены названия групп
        // setGroup("2) " + "Была группа = " + getGroup() + ",а  заменяем на " + group1);
        //Метод вызова всех групп
        // allGroup();
        //Метод для получения кол-во сотрудников группы по её названию
        //emploeesName_Group(group);
        // Метод для модификации значения кол-во сотрудников группы по её названию
        // modifEmploeesName_Group(group,115);
         //modifEmploeesName_Group(group1,225);
        // modifEmploeesName_Group(group2,335);



    }






    @Override
    public String toString() {
        return  group + " ," +  group1 + " " + " ," + group2 ;
    }
}
