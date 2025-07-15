



import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Binary_tree {

    class Node{
        int val;
        Node left;
        Node right;
    }

    private Node root;
    Scanner sc = new Scanner(System.in);
    public Binary_tree() {
        root = CreateTree();
    }
    private Node CreateTree() {
        int item = sc.nextInt();
        Node nn = new Node();
        nn.val = item;
        boolean hlc = sc.nextBoolean();
        if(hlc) {
            nn.left = CreateTree();
        }
        boolean hrc = sc.nextBoolean();
        if(hrc) {
            nn.right = CreateTree();
        }
        return nn;
    }

    public void Display() {
        Display(root);
    }
    private void Display(Node nn) {
        if (nn == null) {
            return;
        }
        String s = "<--" + nn.val + "-->";
        if (nn.left != null) {
            s = nn.left.val + s;
        }
        else {
            s = "." + s;
        }
        if (nn.right != null) {
            s =  s + nn.right.val ;
        }
        else {
            s = s + ".";
        }
        System.out.println(s);
        Display(nn.left);
        Display(nn.right);
    }
    public int max() {
        return max(root);
    }

    private int max (Node nn) {
        if (nn == null) {
            return Integer.MIN_VALUE;
        }
        int lmax = max(nn.left);
        int rmax = max(nn.right);
        return Math.max(lmax, Math.max(rmax, nn.val));
    }
    public boolean find(int item) {
        return find(root, item);
    }
    private boolean find (Node nn, int item) {
        if (nn == null) {
            return false;
        }
        if (nn.val == item) {
            return true;
        }
        boolean left = find(nn.left, item);
        boolean right = find(nn.right, item);
        return left||right;
    }
    public int ht() {
        return ht(root);
    }
    private int ht(Node node) {
        if (node == null) {
            return 0;
        }
        int lh = ht(node.left);
        int rh = ht(node.right);
        return Math.max(lh, rh)+1;
    }
    public void PreOrder(){
        PreOrder(this.root);
        System.out.println();
    }
    private void PreOrder(Node nn){
        if(nn==null){
            return;
        }
        System.out.println(nn.val+" ");
        PreOrder(nn.left);
        PreOrder(nn.right);
    }
    public void PostOrder(){
        PostOrder(this.root);
        System.out.println();
    }
    private void PostOrder(Node nn){
        if(nn==null){
            return;
        }

        PostOrder(nn.left);
        PostOrder(nn.right);
        System.out.println(nn.val+" ");
    }

    public void InOrder(){
        InOrder(this.root);
        System.out.println();
    }
    private void InOrder(Node nn){
        if(nn==null){
            return;
        }
        InOrder(nn.left);
        System.out.println(nn.val+" ");
        InOrder(nn.right);
    }
    public void LevelOrder(){
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node r=q.poll();
            System.out.println(r.val+" ");
            if(r.left!=null){
                q.add(r.left);
            }
            if(r.right!=null){
                q.add(r.right);
            }
        }
        System.out.println();
    }
}