public class Queue {
    protected int[] arr;
    protected int front=0;
    int size=0;
//    int rear=0;
    public Queue(){
        this(5);
    }
    public Queue(int n) {
    arr=new int[n];
    }
    public boolean isEmpty(){
        return size==0;
    }
    public boolean isFull(){
        return size==arr.length;
    }
    public int size(){
        return size;
    }
    public void Enqueue(int item) throws Exception{
        if(isFull()){
            throw new Exception("queue is full");
        }
        int idx=(front+size)%arr.length;
        arr[idx]=item;
        size++;
//    rear++;
    }
    public int dequeue() throws Exception {
        if(isEmpty()){
            throw new Exception("que empty");
        }
         int v=arr[front];
         front=(front+1)%arr.length;
         size--;
         return v;
    }
public int getFront() throws Exception{
        if(isEmpty()){
           throw new Exception("empty");
        }
        return arr[front];
    }
    public void Display(){
        for (int i = 0; i < size; i++) {
            int idx=(front+i)%arr.length;
            System.out.print(arr[idx]+" ");
        }
        System.out.println();
    }
}
