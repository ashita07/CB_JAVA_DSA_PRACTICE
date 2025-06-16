public class Abstract_Demo_Client {
    public static void main(String[] args) {
//
          Abstract_Demo_Child b1=new Abstract_Demo_Child();
          b1.fun1();
        System.out.println(b1.fun2());
        System.out.println(b1.viewBalance());

        Abstract_Demo ab=new Abstract_Demo() {
            @Override
            public void fun1() {

            }

            @Override
            public int fun2() {
                return 0;
            }
        };
            }
        }


