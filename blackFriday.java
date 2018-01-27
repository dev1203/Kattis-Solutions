import java.util.*;
import java.io.*;
public class black{
	
	public static void main(String []args){

		Scanner scan=new Scanner(System.in);
		TreeMap<Integer,Integer> tree=new TreeMap<Integer,Integer>();
			String s=scan.nextLine();
			s=scan.nextLine();
			boolean check=false;
			List<String> myList = new ArrayList<String>(Arrays.asList(s.split(" ")));
			if(isequal(myList)==true){
				System.out.println("none");
				return;
			}
			for(int i=0;i<myList.size();i++){
				int a=Integer.parseInt(myList.get(i));
				if(!tree.containsKey(a)){
					int count=1;
					tree.put(a,count);
				}
				else{
					 int count=tree.get(a);
					count++;
					tree.put(a,count);
				}
			}
		int key=6;
		int value=100;
	for (Map.Entry<Integer, Integer> entry : tree.entrySet()) {
     if(entry.getKey()<key && entry.getValue()<value){
     	key=entry.getKey();
     	value=entry.getValue();

     }	
}
	System.out.println("Here"+value);
		String e=Integer.toString(value);
	System.out.println(myList.indexOf(e));

	}
	public static boolean isequal(List<String> myList){
		if(myList.size()==1){
			return false;
		}

		for(int i=1;i<myList.size();i++){
			if(Integer.parseInt(myList.get(0))!=Integer.parseInt(myList.get(i))){
				return false;
			}
			
		}
		return true;
	}
}