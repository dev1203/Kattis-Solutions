import java.util.*;
import java.io.*;
public class Un_bear_able_zoo{
	public static void main(String []args){
		Scanner scan=new Scanner(System.in);
		int j=1;
		while(scan.hasNextLine()){
		int number=Integer.parseInt(scan.nextLine());
		if(number==0){
			return;
		}
		TreeMap<String,Integer> tree=new TreeMap<String,Integer>();
		for(int i=0;i<number;i++){
			String s=scan.nextLine();
			String arr[]=s.split(" ");
			String animal=arr[arr.length-1];
			// System.out.println(animal);
			if(!tree.containsKey(animal.toLowerCase())){
			tree.put(animal.toLowerCase(),1);
			}
			else{
			int count=tree.get(animal.toLowerCase());
			count=count+1;
			tree.put(animal.toLowerCase(),count);
			}
		}
		System.out.println("List "+j+":");
		for (Map.Entry<String, Integer> entry : tree.entrySet()) {
    	 	System.out.print(entry.getKey()+" ");
    	 	System.out.println("| "+entry.getValue());
}
		j++;
	}
		}
	public static void tos(String s[]){
	for(int i=0;i<s.length;i++){
		System.out.println(s[i]);
	}
	}
}
