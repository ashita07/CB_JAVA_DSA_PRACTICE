import java.util.LinkedList;

public class StacksUsingLinkedList {
    private LinkedList<Integer> ll=new LinkedList<>();

    public void push(int item){
        ll.addFirst(item);
    }
    public int pop(){
        return ll.remove();
    }

    public int peek(){
        return ll.get(0);
    }
    public int size(){
        return ll.size();
    }
    public void Display() {
        System.out.println(ll);
    }
    public boolean isEmpty(){
        return ll.size()==0;
    }

    public static void main(String[] args) {
        StacksUsingLinkedList sl=new StacksUsingLinkedList();
        sl.push(10);
        sl.push(20);
        sl.push(23);
        sl.push(45);
        System.out.println( sl.peek());
        sl.Display();
        System.out.println( sl.pop());
    }
}
