public class BinaryTree_Client {
    public static void main(String[] args) {
        Binary_tree b=new Binary_tree();

         b.Display();
        System.out.println(b.max());
        System.out.println(b.find(60));
        System.out.println(b.ht());
//        b.PreOrder();
//        b.PostOrder();
//        b.InOrder();
        b.LevelOrder();
    }
}
