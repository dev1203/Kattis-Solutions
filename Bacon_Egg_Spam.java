//V00873441
import java.util.TreeMap;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Scanner;
public class Bacon_Egg_Spam{
public static void main(String []args){
Scanner scan=new Scanner(System.in);

while(scan.hasNextLine()){
TreeMap<String,PriorityQueue<String>> tree = new TreeMap<String,PriorityQueue<String>>();
PriorityQueue<String> Q =new PriorityQueue<String>();
	String s=scan.nextLine();

	if(s.trim().equals("0")){
		break;
	}
	int number=Integer.parseInt(s);
	for(int i=0;i<number;i++){
	    Q =new PriorityQueue<String>();
		s=scan.nextLine();
		String a[]=s.split(" ");
		for(int j=1;j<a.length;j++){
				if(!tree.containsKey(a[j])){
				PriorityQueue<String> t=new PriorityQueue<String>();	
				t.add(a[0]);
				tree.put(a[j],t);
				}
				else{
				PriorityQueue<String> t=tree.get(a[j]);	
				t.add(a[0]);
				tree.put(a[j],t);
				}
	}
	}
	for (Map.Entry<String, PriorityQueue<String>> entry : tree.entrySet()) {
     System.out.print(entry.getKey()+" ");
     tos(entry.getValue());
}
	System.out.println();
}
}
public static void tos(PriorityQueue<String> Q){
	while(!Q.isEmpty()){
		System.out.print(Q.poll()+" ");
	}
       System.out.println();
	
}
}