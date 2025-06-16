import java.util.LinkedList;

public class Queue_using_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(10);
        ll.add(434);
        ll.add(44);
        ll.add(436);
        System.out.println(ll);
        System.out.println(ll.remove());
        System.out.println(ll.poll());
        System.out.println(ll.peek());

    }
}
