public class Lists {
    //Голова
    private GroupPIO head;
    //Хвост
    private GroupPIO tail;

//В конструкторе задаем нулевые позиции для хвоста и головы
    public Lists() {
        head = null;
        tail = null;
    }
    //Метод для проверки позиции головы
    private boolean isEmpty(){
        return head == null;
    }
    //Метод добавления элемента в начало списка. Те добавление элементов происходит с хвоста до головы
    public void addFirst(int data){
        //Обьявляем конструктор где конструктор принимает элемент на вход
        GroupPIO temp = new GroupPIO(data);

        //Делаем проверку , если голова списка пуста то делаем добавление элемента в хвост
        if (isEmpty())
            tail = temp;
        else
            //иначе предыдущий элемент добавленный в голову списка будет равен добавленному
            head.prev = temp;
        //К добавленному элементу присваиваем значение позиции головы
        temp.next = head;
        //и делаем присвоение головы списка как добавленное значение
            head = temp;
            //По итогу данный метод должен реализовать функционал: Что при добавлении элементов по порядку
            //Метод должен добавлять в список в обратном порядке: Те если мы добавляем элементы как первый/второй/третий
            //На выходе должны получит:  Третий элемент как первый , тк мы его добавили последним , второй будет без изменений , а первый должен быть третьим
            //тк первый элемент мы добавили первым и на выходе первый элемент должен стать последним , а последний добавленный элемент первым .

    }
    public void addLast(int data){
        GroupPIO temp = new GroupPIO(data);

        if (isEmpty())
            head = temp;
        else
            tail.next = temp;

        temp.prev = tail;
        tail = temp;

    }
    // Метод добавления элемента по индексу . Те вставляем желаемый элемент на место которое хотим
        public void addByIndex(int data,int index){
            GroupPIO groupPIO = head;
            int c = 0;

            while (groupPIO != null && c != index){
                groupPIO = groupPIO.next;
                c++;
            }

            GroupPIO temp = new GroupPIO(data);
            groupPIO.prev.next = temp;
            temp.prev = groupPIO.prev;
            groupPIO.prev = temp;
            temp.next = groupPIO;
    }

    public void removeFirst(){


        if(head.next == null){
            tail = null;
        }else {
            head.next.prev = null;
        }
        head = head.next;
    }

    public void removeLast(){


        if(head.next == null){
            head = null;
        }else {
            tail.prev.next = null;
        }
        tail = tail.prev;
    }

    public void removeAt(int key){
        GroupPIO cur = head;

        while (cur.data != key){
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



    public  void  print(){
        GroupPIO temp = head;

        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}
