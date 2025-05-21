public class Stack {
   private int[] arr;
   private int idx=-1;

    public Stack(){
        this(5);
    }
    public Stack(int n){
        arr=new int[n];
    }
    public boolean isEmpty(){
        return idx==-1;
    }
    public boolean isFull(){
return idx==arr.length-1;
    }
    public void push(int item) throws Exception{
        if(isFull()){
            throw new Exception("stack is full");
        }
        idx++;
        arr[idx]=item;
    }
    public int peek(){
        return arr[idx];
    }
    public int pop() throws Exception {
        if(isEmpty()){
            throw new Exception("stack is empty");
        }
        idx--;
        return arr[idx+1];

    }
    public void display(){
        for (int i=0;i<=idx;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }


}

