

public class Cycle_Removal {
    private class Node {
        int val;
        Node next;

    }

    private Node head;
    private Node tail;
    private int size;

    // O(1)
    public void addLast(int item) {
        Node nn = new Node();
        nn.val = item;
        if (size == 0) {
            head = nn;
            tail = nn;
            size++;
        } else {
            tail.next = nn;
            tail = nn;
            size++;
        }
    }

    private Node getNode(int k) {

        Node temp = head;
        for (int i = 0; i < k; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void CreateCycle() {
        tail.next = getNode(2);
    }
    public void Display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + "-->");
            temp = temp.next;
        }
        System.out.println(".");

    }
    public Node hasCycle() {
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return slow;
            }
        }
        return null;
    }
    public void cycleRemoval(){
        Node meet =hasCycle();
        if(meet==null){
            return;
        }
        Node start=head;
        while(start!=null){
            Node temp=meet;
            while(temp.next!=meet){
                while(temp.next==start){
                    temp.next=null;
                    return;
                }
                temp=temp.next;
            }
            start=start.next;
        }
    }
    public void cycleRemoval2(){
        Node meet =hasCycle();
        if(meet==null){
            return;
        }
        int m=1;
        Node temp=meet;
        while(temp.next!=meet){
            m++;
            temp=temp.next;
        }
        //starting se m distance move ahead
        Node fast=head;
        for(int i=1;i<=m;i++){
            fast=fast.next;

        }
        Node slow=head;
        while(slow.next!=fast.next){
            slow=slow.next;
            fast=fast.next;
        }
        fast.next=null;
    }
    public void floydCycleRemoval(){
        Node meet =hasCycle();
        if(meet==null){
            return;
        }
        Node fast=meet;
        Node slow=head;
        while(slow.next!=fast.next){
            slow=slow.next;
            fast=fast.next;
        }
        fast.next=null;
    }


    public static void main(String[] args) throws Exception {
        Cycle_Removal cl = new Cycle_Removal();
        cl.addLast(1);
        cl.addLast(2);
        cl.addLast(3);
        cl.addLast(4);
        cl.addLast(5);
        cl.addLast(6);
        cl.addLast(7);
        cl.addLast(8);
        cl.CreateCycle();
       // cl.cycleRemoval();
       // cl.cycleRemoval2();
        cl.floydCycleRemoval();
        cl.Display();
    }

}

//floyd cycle formation removal and detection
