import java.util.*;
import java.io.*;
public class ragged{

	public static void main(String []args){

		Scanner scan=new Scanner(System.in);
		List <Integer> mylist=new ArrayList<Integer>();
		while(scan.hasNextLine()){
			String s=scan.nextLine();
			mylist.add(s.length());
		}
		int max=max(mylist);
		int score=0;	
		for(int i=0;i<mylist.size()-1;i++){
			score+=Math.pow(Math.abs(mylist.get(i)-max),2);
		}
		System.out.println(score);
	}
	public static int max(List <Integer> mylist){
		int max_n=mylist.get(0);
		for(int i=1;i<mylist.size();i++){
			if(mylist.get(i)>max_n){
				max_n=mylist.get(i);
			}
		}
		return max_n;
	} 
}