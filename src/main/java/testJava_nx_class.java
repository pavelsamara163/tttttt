
public class testJava_nx_class {
    private static String name_department = "��.������24x7";
    private static String name_department_1 = "����� �������� � ������";


    public static void main(String[] args) {
        //�������� ������
        getName_department(name_department);
        getName_department(name_department_1);
        //
        setName_department(name_department + " ��� �� ��������");


    }

    //����� ������ �������� ������
    private static void   getName_department (String getDepartment){
        System.out.println(getDepartment);
    }
    //�����
    private static void  setName_department(String setDepartment){
        System.out.println(setDepartment);

    }



}
/*
* 1 ������
�������� ����� ����� ���. �� ������ ���������:


+++++1) ���� ���� String, �������� �������� ������;
+++++2) ����� ��� ��������� �������� ������;
+++++3) ����� ��� ����������� �������� ������;
*
+++++4) ���������� ����� ������, ������� ���� �������� ������ � ���-�� �����������;
*
+++++5) ����������� (����� ����� ��� ������ ������ �����);
+++++6) ����� ��� �����������   �������� ������;
*
+++++7) �����, ������������ ������ �������� ���� �����;
*
+++++8) ����� ��� ��������� ���-�� ����������� ������ �� � ��������;
*
+++++9) ����� ��� ����������� �������� ���-�� ����������� ������ �� � ��������;
*
++++++10)�����, ������������ ������ ���-�� ����������� ������;
*
++++++11)����� ���������� �������� ������ � �� ���-�� ����������� (����� �������� ������ ������� ����� � �������������� ������ Arrays.copyOf());
*
+++++12)����� �������� ������ � ��������� �������� � ���-�� �����������( � �������������� ������� System.arraycopy, Arrays.copyOf());
*
++++++13)����� ��� ��������� ������� ������� �����.

�����������:
����������� ������ ������ ��������� � �������� ���������� �������� ������ � ������ ������� �����.
*
*
* 2 ������
�������� ����� ����� ��� �� ������ ����������������� �� ������ 2, ������, ����� ��
��� ������� �� ���������� ����������� ������ � �������.
*
*
*
*3 ������ ������
������� ������ ������:
1) ������� ��������������� �������� ������ NoSuchGroupNameException (�����������),
2) ������������ �������� ������ DuplicateGroupNameException (�����������),
3) ������� ��������� ���-�� ����� � ������ GroupCntOutOfBoundsException (�� �����������).

�������� ������ ������� ���, ����� ��� ��������� ������������ ������ � ����������� ����������.

������ ������:
� ��� ������� ����� ������������ � �������������� �������� ������?

4 ����������
������� ��������� ����������� ������� ������ ��������������� ����� ���������������� ���� ��������� �������.
��� ������ ������ ����������� ������ ���������.

5 ������ �� ������������ ��������
�������� ����� �� ������������ �������� ���, ����� �� ������� �� �������� ���� ���������.

� ������ ������ ����:
1) ����� ��� ����������� �������� ��������������� ���-�� ����������� ��� ��������� ������������;
2) ����� ������������� ����� �� ����� ���� ����� � ���-�� ����������� ������ ���� ��� ��������� ������������.

6 ��������� ����� � ������ ������
�������������� ����� �� ������ 6 � ������� �������:
1) ������ ���������� � ������������ � �������� �����;
2) ������ ���������� � ������������ �� ��������� ������;
3) ������ ���������� � ������������ � ���������� �����;
4) ������ ���������� � ������������ �� ����������� ������;

� ���� 2� ������� �������� ���������� �� ������ ������������, ���-�� ������, � ����� ������ ����� � ���-�� �����������;
��� ��������� ����������� ������ ������� � main? ��������.

7 ������������
    �������������� ������ ����� ��� � ���, ����� ��� ���� ��������������.

    ���������� ������� ������������ � main � ������� ObjectOutputStream, ObjectInputStream.


*
*
* */