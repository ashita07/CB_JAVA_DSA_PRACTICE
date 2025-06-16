public class Stack_Class_Client {
    public static void main(String[] args) {
        StackI st= new StackI() {
            @Override
            public void push(int x) {

            }

            @Override
            public int peek() {
                return 0;
            }

            @Override
            public int pop() {
                return 0;
            }
        };
        StackI st1=new Stack_Class();
    }
}
