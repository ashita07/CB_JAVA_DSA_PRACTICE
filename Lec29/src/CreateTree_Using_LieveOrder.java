import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CreateTree_Using_LieveOrder {
    class Node{
        int val;
        Node left;
        Node right;
    }
    private Node root;
    Scanner sc=new Scanner(System.in);

    public CreateTree_Using_LieveOrder(){

        CreateTree();
    }
    private void CreateTree() {
 int item=sc.nextInt();
 Node nn=new Node();
 nn.val=item;
 root=nn;
     Queue<Node> q=new LinkedList<>();
     q.add(nn);
     while(!q.isEmpty()){
         Node rn=q.poll();
         int c1=sc.nextInt();
         int c2=sc.nextInt();
         if(c1!=-1){
             Node left_node=new Node();
             left_node.val=c1;
             rn.left=left_node;
             q.add(left_node);
         }if(c2!=-1){
             Node right_node=new Node();
             right_node.val=c2;
             rn.left=right_node;
             q.add(right_node);
         }

    }
    }
}
