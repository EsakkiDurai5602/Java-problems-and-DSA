import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        System.out.println(list);
        list.addFirst(10);
        System.out.println(list);
        list.addLast(16);
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
    }
}
