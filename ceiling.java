import java.util.*;
public class ceiling{
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String testcase[] = scan.nextLine().split(" ");
        int number = Integer.parseInt(testcase[0]);
        Set<String> set = new HashSet<String>();
        for (int i=0 ;i< number; i++){
            BST tree = new BST();
            String input[] = scan.nextLine().split(" ");
            for (String line : input){
                tree.insert(Integer.parseInt(line));
            }
            set.add(tree.traverse());
        }
        System.out.println(set.size());
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
    public String traverse(){
        if (this.root == null){
            return "";
        }
        StringBuilder str = new StringBuilder();
        inorderTraverse(root, str);
        return str.toString();
    }
    public void inorderTraverse(Node current,StringBuilder str){
        if(current.left != null){
            str.append('l');
            inorderTraverse(current.left,str);
        }
        str.append('x');
        if(current.right != null){
            str.append('r');
            inorderTraverse(current.right,str);
        }
    }
}