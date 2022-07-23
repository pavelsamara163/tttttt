import java.util.List;
/* 2 Списки
        Создайте класс Домен ПИО со схожей функциональностью из пункта 2, только, чтобы он
        был основан на двусвязном циклическом списке с головой.
        2) Метод для получения названия отдела;

        */

public  class GroupPIO {
    public int data;
    public GroupPIO next; //следующий элемент
    public GroupPIO prev; // предыдйщий элемент


    public GroupPIO(int data) {
        this.data = data;
    }

}


