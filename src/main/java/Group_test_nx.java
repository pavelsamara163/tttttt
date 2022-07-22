
import com.Hibernate.HibernateConnection;

import java.util.*;

public class Group_test_nx  extends HibernateConnection {
    private static String group = "Домен Продукты и Услуги";
    private static int group_emp = 10;
    private static String group1 = "Домен ПУ";
    private static int group_emp1 = 20;
    private static String group2 = "Домен ПУ.Аварий24x7";
    private static int group_emp2 = 30;
    private static int emploees = 0;





    public   Group_test_nx( ) {

    }
    public   Group_test_nx(String nameOtdel,int[] massGroup ) {

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
    //10)метод, возвращающий массив кол-ва сотрудников группы;
      int[] returnArraySumEmpGroup (String groupName){
        int[] name = {group_emp, group_emp1, group_emp2};

        if (groupName == group ){
            System.out.println(group + " . "  + " Кол-во сотрудников : " + group_emp );

        } else if (groupName == group1 ){
            System.out.println(group1 + " . "  + " Кол-во сотрудников : " + group_emp1 );

        }else if (groupName == group2 ){
            System.out.println(group2 + " . "  + " Кол-во сотрудников : " + group_emp2 );

        }


          return name;
      }
      //11 метод добавления названия группы и ее кол-во сотрудников (путем создания нового массива групп с использованием метода Arrays.copyOf());
       static void modifEmpAndNames_Group (String a,int b){
               String[] name_group = new String[]{group, group1, group2};
               int[] emp_group = new int[]{group_emp, group_emp1, group_emp2};
               //new
               String [] new_name_group = Arrays.copyOf(name_group,name_group.length+1);
               int[] new_emp_group = Arrays.copyOf(emp_group,emp_group.length+1);

               int i_name_group = new_name_group.length-1;
               int s_emp_group = new_emp_group.length-1;

               new_name_group[i_name_group]  = a ;
               new_emp_group[s_emp_group] = b;

                System.out.println(Arrays.toString(new_name_group));
                System.out.println(Arrays.toString(new_emp_group));

    }
    static void deleteEmpAndNames_Group (String a,int b ) {
        String[] name_group = new String[]{group, group1, group2};
        int[] emp_group = new int[]{group_emp, group_emp1, group_emp2};
        //new

        if (group == a & group_emp == b) {
            String[] new_name_group = Arrays.copyOf(name_group, name_group.length - 1);
            System.arraycopy(name_group, 1, new_name_group, 0, 2);
            System.out.println(Arrays.toString(new_name_group));

            int[] new_emp_group = Arrays.copyOf(emp_group, emp_group.length - 1);
            System.arraycopy(emp_group, 1, new_emp_group, 0, 2);
            System.out.println(Arrays.toString(new_emp_group));

        } else if (group1 == a & group_emp1 == b) {
            System.arraycopy(name_group, 2, name_group, 1, name_group.length - 2);
            String[] new_name_group2 = Arrays.copyOf(name_group, name_group.length - 1);
            System.out.println(Arrays.toString(new_name_group2));

            System.arraycopy(emp_group, 2, emp_group, 1, emp_group.length - 2);
            int[] new_emp_group2 = Arrays.copyOf(emp_group, emp_group.length - 1);
            System.out.println(Arrays.toString(new_emp_group2));

        } else {
            System.arraycopy(name_group, 0, name_group, 0, name_group.length);
            String[] new_name_group2 = Arrays.copyOf(name_group, name_group.length - 1);
            System.out.println(Arrays.toString(new_name_group2));

            System.arraycopy(emp_group, 0, emp_group, 0, emp_group.length);
            int[] new_emp_group2 = Arrays.copyOf(emp_group, emp_group.length - 1);
            System.out.println(Arrays.toString(new_emp_group2));
        }
    }
          static void returnMassivGroup  (){
              String[] name_group = new String[]{group, group1, group2};
              int[] emp_group = new int[]{group_emp, group_emp1, group_emp2};
              System.out.println("Размер массивыа групп : " + name_group.length );
        }







    public static void main(String[] args) {
        Group_test_nx group_test_nx = new Group_test_nx();

/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Домен : " + group);
        System.out.print("Введите кол-во сотрудников " ) ; emploees = Integer.parseInt(scanner.nextLine());
        System.out.println("В " + group + ". Кол-во сотрудников : "+ emploees);
        */

        //Метод вызова название групп
        // System.out.println("1) " + getGroup());
        //Метод замены названия групп
        // setGroup("2) " + "Была группа = " + getGroup() + ",а  заменяем на " + group1);
        //Метод вызова всех групп
        //allGroup();
        //Метод для получения кол-во сотрудников группы по её названию
        //emploeesName_Group(group);
        // Метод для модификации значения кол-во сотрудников группы по её названию
        // modifEmploeesName_Group(group,115);
        //modifEmploeesName_Group(group1,225);
        // modifEmploeesName_Group(group2,335);
        //10)метод, возвращающий массив кол-ва сотрудников группы;
        //group_test_nx.returnArraySumEmpGroup(group1);
        //11)метод добавления названия группы и ее кол-во сотрудников (путем создания нового массива групп с использованием метода Arrays.copyOf());
         //modifEmpAndNames_Group("Privet_medvDDDD",2231);
        //12)метод удаления группы с указанием названия и кол-ва сотрудников( с использованием методов System.arraycopy, Arrays.copyOf());
        //deleteEmpAndNames_Group(group2,group_emp2);
        //13)метод для получения размера массива Групп.
        returnMassivGroup();



    }






    @Override
    public String toString() {
        return  group + " ," +  group1 + " " + " ," + group2 ;
    }
}
