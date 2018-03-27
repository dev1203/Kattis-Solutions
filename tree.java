import java.util.*;
import java.io.*;
import java.math.*;
public class tree{
	public static void main(String []args){
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		while(Integer.parseInt(s)!=0){
			BinarySearchTree tree=new BinarySearchTree();
			int n=Integer.parseInt(s);
			String arr[]=scan.nextLine().split(" ");
			for(int i=0;i<arr.length;i++){
				tree.insert(Integer.parseInt(arr[i]));
			}
			Node root=tree.root;
            System.out.println(tree.permutations(root));
            s=scan.nextLine();
		}
	}
	public static void tos(String a[]){
			for(int i=0;i<a.length;i++){
				System.out.print(a[i]+" ");
			}
			System.out.println();
		}
	}
 class Node{
        int value;
        Node left, right;
 
        public Node(int item) {
            value = item;
            left = right = null;
        }
    }
class BinarySearchTree {
    public Node root;
    int to_left;
    int to_right;
    public BinarySearchTree(){
        root = null;
    }
      public BigInteger permutations(Node n){
        BigInteger final_ans =BigInteger.valueOf(1);
        if (n==null){
        	return final_ans;
        }
        else{
        final_ans=binomial((getCount(n.left)+getCount(n.right)), getCount(n.right));
        final_ans=final_ans.multiply((permutations(n.left)));
        final_ans=final_ans.multiply(permutations(n.right));
        return final_ans;
          }
    }
 public int getCount(Node n){
        if(n == null){
            return 0;
        }
       	else if(n. right != null && n.left==null){
            return 1 + getCount(n.right);
        }
         else if(n.left != null && n.right==null){
            return 1+getCount(n.left);
        }
        else return 1+ getCount(n.left) + getCount(n.right);
    }

 public void insert(int data){
        Node n = new Node(data);
        if (root == null){  
            root = n;
            return;
        } 
        else{  
        Node temp = root;
        for(;;){
            if(data >= temp.value ){
                if(temp.right ==null){
                    temp.right = n;
                    if(data>=root.value){
                     to_right++;
                      }
                    else{
                    to_left++;
                    }
                    return;
                }
                else{
                	temp = temp.right;
                }
            }
     	else if(data<temp.value){  
              if(temp.left ==null){
                   temp.left =n;
                    if(data>=root.value ){ 
                    	to_right++;
                    }
                     else{ 
                     	to_left++;
                     }
                    return;
                }
                else{
                	temp= temp.left;
                }
            }
        }
        }

    }
    public BigInteger binomial(int N,int K) {
        BigInteger data = BigInteger.valueOf(1);
        for (int i = 0; i< K; i++) {
   		 data=data.multiply(BigInteger.valueOf(N-i));
   		 data=data.divide(BigInteger.valueOf(i+1));
        }
        return data;
        }

    // This method mainly calls InorderRec()
    void inorder()  {
       inorderRec(root);
    }
 
    // A utility function to do inorder traversal of BST
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.value);
            inorderRec(root.right);
        }
    }

}