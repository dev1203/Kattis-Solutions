import java.util.*;
import java.io.*;
public class N0_Duplicates{
	public static void main(String []args){
		Scanner scan=new Scanner(System.in);
		PriorityQueue<String> q=new PriorityQueue<String>();
			String s=scan.nextLine();
			String arr[]=s.split(" ");
			for(int i=0;i<arr.length;i++){
				if(!q.contains(arr[i])){
					q.add(arr[i]);
				}
				else{
					System.out.println("no");
					return;
				}
			}
			System.out.println("yes");
	}
}
