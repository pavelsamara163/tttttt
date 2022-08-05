import java.util.List;
/* 2 Списки
        Создайте класс Домен ПИО со схожей функциональностью из пункта 2, только, чтобы он
        был основан на двусвязном циклическом списке с головой.
        2) Метод для получения названия отдела;

        */

public  class DomenPIO {
    public String name_otdel;
    public DomenPIO next; //следующий элемент
    public DomenPIO prev; // предыдйщий элемент


    public DomenPIO(String name_otdel) {
        this.name_otdel = name_otdel;
    }

}


