import java.util.*;
import java.io.*;
import java.math.*;
public class second{
		public static void main(String []args) throws Exception{
		Scanner scan=new Scanner(System.in);
		// PriorityQueue<Integer> q=new PriorityQueue<Integer>(Collections.reverseOrder());
		ArrayList<Integer> arr=new ArrayList<Integer>();
			while(scan.hasNextLine()){
				String s=scan.nextLine();
				String array[]=s.split(" ");
				int first=Integer.parseInt(array[array.length-2]);
				int second=Integer.parseInt(array[array.length-1]);
				for(int i=0;i<array.length-2;i++){
					arr.add(Integer.parseInt(array[i]));
				}
				Collections.sort(arr, Collections.reverseOrder());
				String g=tripet(arr,first);
				String f=tripet(arr,second);
				array=g.split(" ");
				tos(array);
				array=f.split(" ");
				tos(array);
				System.out.println();

			}
	
}
public static void tos(String a[]){
	for(int i=0;i<a.length;i++){
		System.out.print(a[i]+" ");
	}
}
public static String tripet(ArrayList<Integer> arr,int first){
		 int l, r;
 		String s="";
        for (int i = 0; i < arr.size() - 2; i++) 
        {
            for (int j = i + 1; j < arr.size() - 1; j++) 
            {
                for (int k = j + 1; k < arr.size(); k++) 
                {
                    if (arr.get(i) + arr.get(j) + arr.get(k) == first) 
                    {
   					s=arr.get(i).toString()+" "+arr.get(j).toString()+" "+ arr.get(k).toString();
                    }
                }
            }

        }
        return s;
}
}