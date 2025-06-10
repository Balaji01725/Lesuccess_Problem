package Assignment17;
import java.util.*;

public class levelOrderTraversal {
    Node root = null;

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static void levelOrderTraversal(Node root){
        Queue<Node> qu=new LinkedList<>();
        qu.offer(root);
        while(!qu.isEmpty()){
            Node ptr=qu.poll();
            System.out.print(ptr.data+" ");
            if(ptr.left!=null){
                qu.offer(ptr.left);
            }if(ptr.right!=null){
                qu.offer(ptr.right);
            }
        }
    }
    static int sum=0;
    static int countLeafNode(Node root,int sum){
        if(root.left==null && root.right==null){
            sum++;
            return sum;
        }
        return countLeafNode(root.left,sum)+countLeafNode(root.right,sum);
    }
    static int height=0;
    static int findHeight(Node root,int height){
        if(root==null) return -1;
        int le=findHeight(root.left,height);
        int ri=findHeight(root.right,height);
        return 1+Math.max(le,ri);
    }

    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.left.left =new Node(40);
        root.left.right=new Node(50);
        root.right=new Node(30);
        root.right.left=new Node(60);
        root.right.right=new Node(70);
        System.out.println("Level Sorting");
        levelOrderTraversal(root);
        System.out.println();
        System.out.println("count LeafNode");
        System.out.println(countLeafNode(root,sum));
        System.out.println("Find Height");
        System.out.println(findHeight(root,height));

    }
}
