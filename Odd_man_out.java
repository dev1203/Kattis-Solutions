import java.util.*;
import java.io.*;
import java.math.*;
public class first{
		public static void main(String []args) throws Exception{
		// BufferedReader scan=new BufferedReader(new InputStreamReader(System.in));
		// String s=scan.readLine();
			Scanner scan=new Scanner(System.in);
			String s=scan.nextLine();
			int count=1;
			int number=Integer.parseInt(s);
		while(scan.hasNextLine()){
			TreeMap<Integer,Integer> hm=new TreeMap<Integer,Integer>();  
			// System.out.println(number);
			s=scan.nextLine();
			int guestno=Integer.parseInt(s);
			// System.out.println(guestno);
			s=scan.nextLine();
			String arr[]=s.split(" ");	
			// tos(arr);
			for(int i=0;i<arr.length;i++){
				if(!hm.containsKey(Integer.parseInt(arr[i]))){
					hm.put(Integer.parseInt(arr[i]),1);
				}
				else{
					int num=hm.get(Integer.parseInt(arr[i]));
					num++;
					hm.put(Integer.parseInt(arr[i]),num);
				}
			}
			
			  for(Map.Entry m:hm.entrySet()){  
  		 if(m.getValue().toString().equals("1")){
  		 	System.out.println("Case #"+count+": "+m.getKey());
  		 	count++;
  		 }  
 		 } 
		}
		
}
public static void tos(String a[]){
	for(int i=0;i<a.length;i++){
		System.out.print(a[i]+" ");
	}
	System.out.println();
}
}