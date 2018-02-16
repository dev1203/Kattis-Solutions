import java.util.Arrays;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Erase_securely{
	public static void main(String []args) throws Exception{
		 BufferedReader scan=new BufferedReader(new InputStreamReader(System.in));
		int number_of_times=Integer.parseInt(scan.readLine().trim());
		String s=scan.readLine();
		String mylist[]=s.split("");
		String s1=scan.readLine();
		if(number_of_times%2!=0){
			s="";
			for(int i=0;i<mylist.length;i++){
				if(mylist[i].equals("0")){
				mylist[i]="1";
				}
				else{
					mylist[i]="0";
				}
				s+=mylist[i];
			}
		}
		if(s.equals(s1)){
			System.out.println("Deletion succeeded");
		}
		else{
			System.out.println("Deletion failed");
		}
	}
	
}