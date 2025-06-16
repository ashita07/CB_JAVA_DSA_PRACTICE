public class LinkedList {
    class Node{
        int val;
        Node next;
    }
    private Node head ;
    private Node tail;
    private int size;

    public void addFirst(int item){
        Node nn=new Node();
        nn.val=item;
        if(size==0){
            head=nn;
            tail=nn;
            size++;
        }else{
            nn.next=head;
            head=nn;
            size++;

        }
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"-->");
            temp=temp.next;
        }
        System.out.print(".");
    }
    public int size(){
        return size;
    }
    public void addLast(int item) {
        if(size==0){
            addFirst(item);

        }
        else{
            Node nn=new Node();
            nn.val=item;
            tail.next=nn;
            tail=nn;
            size++;

        }
    }

    private Node getNode(int k){
        Node temp=head;
        for(int i=0;i<k;i++){
            temp=temp.next;
        }
        return temp;
    }
    public void addIndex(int item,int k){
        if(k==0){
            addFirst(item);
        }
        else if(k==size){
            addLast(item);
        }
        else{
            Node nn=new Node();
            nn.val=item;
            Node prev=getNode(k-1);
            nn.next=prev.next;
            prev.next=nn;
            size++;
        }
    }
    public int getFirst(){
        return head.val;
    }
    public int getLast(){
        return tail.val;
    }
    public int getatIndex(int k){
        return getNode(k).val;
    }
    public int removeFirst(){
        Node temp=head;
        if(size==1){
            head=null;
            tail=null;
            size=0;
        }else{
            head=head.next;
            temp.next=null;
            size--;
        }
        return temp.val;
    }
    public int removeLast(){
        if (size==1){
            return removeLast();
        }else{
            Node prev=getNode(size-2);
            int val=tail.val;
            prev.next=null;
            tail=prev;
            size--;
            return val;
        }
    }
    public int removeFromAParticular(int k){
        if(k==0){
            return removeFirst();

        }else if(k==size-1){
            return removeLast();
        }else{
            Node prev=getNode(k-1);
            Node curr=prev.next;
            prev.next=curr.next;
            curr.next=null;
            size--;
            return curr.val;
        }
    }

}
