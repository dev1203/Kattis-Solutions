//V00873441
import java.util.Stack;
import java.util.Scanner;
public class kastenlauf{
public static void main(String []args){
    Scanner scan=new Scanner(System.in);
	String number_of_test=scan.nextLine();
	int number=Integer.parseInt(number_of_test);
	Stack<Integer> stack = new Stack<Integer>();
	for(int i=0;i<number;i++){
	   String s=findDistance(scan,stack);
       System.out.println(s);	
    }
}
public static String findDistance(Scanner scan,Stack<Integer> stack){
        String mood="";
        String input=scan.nextLine();
        input=input.trim();
        int stores=Integer.parseInt(input); 
        
        int a[]=new int[stores+2];
        int b[]=new int[a.length];
        boolean[] bool_array = new boolean[a.length];
    
        for(int j=0;j<a.length;j++){
            String s[]=scan.nextLine().split(" ");
            a[j]=Integer.parseInt(s[0]);
            b[j]=Integer.parseInt(s[1]);
        }
       
        stack.push(0);
        
        while(stack.size()!=0){
        int p=stack.pop();
        if(bool_array[p]==false){
        bool_array[p]=true;     
        for (int r = 0; r < stores+2; r++) {
        if (p!=r) {
        if ((Math.abs(a[p] - a[r]) + Math.abs(b[p] - b[r])) <= 1000) {
        stack.push(r);
          }
          }
            }
        }
        }
        if(bool_array[stores+1]==false){
            mood="sad";
        }
        else{
            mood="happy";
        }
        return mood;
}
}
