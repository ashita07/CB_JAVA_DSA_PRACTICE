public class Queue_Client {
    public static void main(String[] args) throws Exception {
        Queue q=new Queue();
        q.Enqueue(10);
        q.Enqueue(122);
        q.Enqueue(52);
        q.Enqueue(798);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        q.Enqueue(523);
        q.Enqueue((32321321));

    }

}
