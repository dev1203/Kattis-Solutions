import java.util.*;
public class ABC{
	public static void main(String []args){
		Scanner scan=new Scanner(System.in);
			String []num=scan.nextLine().split(" ");
			int first=Integer.parseInt(num[0]);
			int second=Integer.parseInt(num[1]);
			int third=Integer.parseInt(num[2]);
			int arr[]=new int[3];
			arr[0]=first;
			arr[1]=second;
			arr[2]=third;
			Arrays.sort(arr);
			String desired[]=scan.nextLine().split("");
			for(int i=0;i<desired.length;i++){
				if(desired[i].equals("A")){
					System.out.print(arr[0]+" ");
				}
				else if(desired[i].equals("B")){
					System.out.print(arr[1]+" ");

				}
				else{
					System.out.print(arr[2]+" ");
				}
			}
			System.out.println();
	}
}