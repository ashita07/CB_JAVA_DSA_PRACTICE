public class Client {
    public static void main(String[] args) {
//        P obj=new P();
        //case1

//        System.out.println(obj.d);
//        System.out.println(obj.d1);
//        obj.fun();
//        obj.fun1();

        //Case2
//        P obj = new C();
//        System.out.println(obj.d);
//        System.out.println(obj.d1);
//        System.out.println(((C)obj).d2);
//        System.out.println(((C)obj).d);
//        obj.fun();
//        obj.fun1();
//       ( (C) obj).fun2();

        //3rd case of inheritance

//        C obj=new P();//not possible as object of c cannot be created
//        System.out.println(obj.d);
//        System.out.println(obj.d1);
//        System.out.println(obj.d2);

        C obj=new C();
        System.out.println(obj.d);
        System.out.println(obj.d1);
        System.out.println(obj.d2);
        obj.fun();
    }
}
