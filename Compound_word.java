import java.util.*;
import java.io.*;
import java.math.*;
public class Compound_word{
		public static void main(String []args) throws Exception{
		Scanner scan=new Scanner(System.in);
		PriorityQueue<String> q=new PriorityQueue<String>();
		String s="";
		while(scan.hasNextLine()){
		s+=scan.nextLine()+" ";
		}	
		String arr[]=s.split(" ");
		tos(arr,q);
	while(!q.isEmpty()){
		System.out.println(q.poll());
	}
}
public static void tos(String a[],PriorityQueue<String> q){
	for(int i=0;i<a.length;i++){
		for(int j=i+1;j<a.length;j++){
			if(!q.contains(a[i]+a[j])){
				q.add(a[i]+a[j]);
			}
			if(!q.contains(a[j]+a[i])){
				q.add(a[j]+a[i]);
			}
		}

	}
}
}