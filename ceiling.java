import java.util.*;
public class ceiling{
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String testcase[] = scan.nextLine().split(" ");
        int number = Integer.parseInt(testcase[0]);
        Node roots[] = new Node[number];
        for (int i=0 ;i< number; i++){
            BST tree = new BST();
            String input[] = scan.nextLine().split(" ");
            for (String line : input){
                tree.insert(Integer.parseInt(line));
            }
            roots[i] = tree.root;
        }
        int count = 0;
        for (int i=0;i<roots.length;i++){
            for(int j=0;j<i;j++){
                if(isSame(roots[i],roots[j])){
                    count ++;
                }
            }
        }
        System.out.println(number-count);
        scan.close();
     }
     public static boolean isSame(Node root1, Node root2){
        if(root1 == null && root2 == null){
            return true;
        }
        if((root1 == null && root2 !=null) || (root1 !=null && root2 == null)){
            return false;
        }
        return isSame(root1.left, root2.left) && isSame(root1.right, root2.right);
     }
}
class Node{
    public Node left;
    public Node right;
    public int data;

    public Node(int data){
        this.left = null;
        this.right = null;
        this.data = data;
    }
}
class BST{
    public Node root;

    public BST(){
        this.root = null;
    }
    public void insert(int data){
        if (this.root == null){
            this.root = new Node(data);
        }
        else{
            insertNode(data, root);
        }
    }
    public void insertNode(int data, Node current){
        if(current.data <= data){
            if(current.right == null){
                current.right = new Node(data);
            }
            else{
                insertNode(data, current.right);
            }
        }
        else {
            if(current.left == null){
                current.left = new Node(data);
            }
            else{
                insertNode(data, current.left);
            }
        }
    }
    public void traverse(){
        if (this.root == null){
            return;
        }
        else{
            inorderTraverse(root);
        }
    }
    public void inorderTraverse(Node current){
        if(current.left != null){
            inorderTraverse(current.left);
        }
        System.out.print(current.data+ " -> " );
        if(current.right != null){
            inorderTraverse(current.right);
        }
    }
}