public class Lists {
    private GroupPIO head;
    private GroupPIO tail;

    public Lists() {
        head = null;
        tail = null;
    }

    private boolean isEmpty(){
        return head == null;
    }
    public void addFirst(int data){
        GroupPIO temp = new GroupPIO(data);

        if (isEmpty())
            tail = temp;
        else
            head.prev = temp;

        temp.next = head;
            head = temp;

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
    // Метод добавления элемента по индексу
        public void addByIndex(int data,int index){
            GroupPIO groupPIO = head;
            int c = 0;

            while (groupPIO != null && c != index){
                groupPIO = groupPIO.next;
                c++;
            }
    }

    public  void  print(){
        GroupPIO temp = head;

        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}
