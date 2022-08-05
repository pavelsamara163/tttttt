import java.util.LinkedList;

public class DoublyLinkedList {
    //Голова
    private DomenPIO head;
    //Хвост
    private DomenPIO tail;

//В конструкторе задаем нулевые позиции для хвоста и головы
    public DoublyLinkedList() {
        head = null;
        tail = null;
    }
    //Метод для проверки позиции головы
    private boolean isEmpty(){
        return head == null;
    }
    //Метод добавления элемента в начало списка. Те добавление элементов происходит с хвоста до головы(Последний элемент становится первым)
    public void addFirst(String data){
        //Обьявляем конструктор где конструктор принимает элемент на вход
        DomenPIO groupPIO = new DomenPIO(data);

        //Делаем проверку , если голова списка пуста то делаем добавление элемента в хвост
        if (isEmpty())
            tail = groupPIO;
        else
            //иначе предыдущий элемент добавленный в голову списка будет равен добавленному
            head.prev = groupPIO;
        //К добавленному элементу присваиваем значение позиции головы
        //Если присвоить temp.prev = head , то выведет только последний положенный элемент в список
        groupPIO.next = head;
        //и делаем присвоение головы списка как добавленное значение
             head = groupPIO;
            //По итогу данный метод должен реализовать функционал: Что при добавлении элементов по порядку
            //Метод должен добавлять в список в обратном порядке: Те если мы добавляем элементы как первый/второй/третий
            //На выходе должны получит:  Третий элемент как первый , тк мы его добавили последним , второй будет без изменений , а первый должен быть третьим
            //тк первый элемент мы добавили первым и на выходе первый элемент должен стать последним , а последний добавленный элемент первым .

        //Создаем ссылку на класс ПИО - конструктор которого принимает на вход int .
        //Делаем проверку - если переменная head пуста(null)
        //то присваиваем значение передаваемое в метод = хвосту(tail)
    }


    //Метод для добавления значения в конец списка
    public void addLast(String data){
        //Обьявляем ссылку на класс PIO , на вход согласно констурктуру метод принимает int
        DomenPIO temp = new DomenPIO(data);
        //Делаем проверку что список пуст
        if (isEmpty())
            //Если список пуст , то присваиваем переменной head = Значение передаваемое в метод
            head = temp;
        else
            //Если список уже не пустой то присваиваем переменной tail.next = значение передаваемое в метод . Те
            //те если в списке есть уже какое то значение то следующее значение будт присвоено переменной tail.next
            tail.next = temp;
        //Делаем присвоение для переменной prev = tail (хвосту)
        temp.prev = tail;
        //А хвосту делаем присвоение переменной ссылки на класс
        tail = temp;

    }
    // Метод добавления элемента по индексу . Те вставляем желаемый элемент на место которое хотим
        public void addByIndex(String data,int index){
        //Текущему элемент будем присваивать переменную head
            DomenPIO domenPIO  = head;
            int c = 0;
        //Делаем проверку что переменная domenPIO не пуста и индекс не равен нулю
            while (domenPIO != null && c != index){
                //Если проходим условие то увеличиваем
                domenPIO = domenPIO.next;
                c++;
            }
            //Создаем новый экземпляр класса
            DomenPIO dp = new DomenPIO(data);
            //Присваиваем текущему элементу со ссылкой на предыдущий/следующий элемент будет равен новому экземпляру класса
            domenPIO.prev.next = dp;
            //Переменная dp.prev присваивается текущему элементу
            dp.prev = domenPIO.prev;
            domenPIO.prev = dp;
            //Переменная dp.next присваивается текущему элементу
            dp.next = domenPIO;
    }


    //Удаление первого элемента из списка
    public void removeFirst(){
        //Проверяем что в списке нет элементов
        if(head.next == null){
            //Если условие проходим то присваиваем переменной tail пустое значение
            tail = null;
        }else {
            //Если условие не проходим то присваиваем следующему и предыдущему элементу головы пустое значение
            head.next.prev = null;
        }
        //Присваиваем голове = переменную head.next (следующее значение головы) будет пустым
        head = head.next;
    }
    //Удаление последнего элемента из списка.
    //Аналогичная реализация как и у метода removeFirst только проверяем переменную хвоста tail
    public void removeLast(){
        if(head.next == null){
            head = null;
        }else {
            tail.prev.next = null;
        }
        tail = tail.prev;
    }

    public void removeAt(String key){
        DomenPIO cur = head;

        while (cur.name_otdel != key){
            cur = cur.next;

            if(cur == null)
                return;
        }
        if (cur == head){
            removeFirst();
        }else
            cur.prev.next = cur.next;

        if (cur == tail)
            removeLast();
        else
            cur.next.prev = cur.prev;
    }

    public void getGroup(String a){
        DomenPIO domenPIO = new DomenPIO(a);
            a = domenPIO.name_otdel ;
            System.out.println(a);
    }

    public  void  print(){
        DomenPIO temp = head;
        while (temp != null){
            System.out.println(temp.name_otdel);
            temp = temp.next;
        }
    }

}
