import java.util.Arrays;
import java.util.Scanner;
public class Erase_securely{
	public static void main(String []args){
		Scanner scan=new Scanner(System.in);
		int number_of_times=Integer.parseInt(scan.nextLine().trim());
		String s=scan.nextLine();
		String mylist[]=s.split("");
		s=scan.nextLine();
		String mylist2[]=s.split("");
		for(int r=0;r<number_of_times;r++){
			for(int i=0;i<mylist.length;i++){
				if(mylist[i].equals("0")){
				mylist[i]="1";
				}
				else{
					mylist[i]="0";
				}
			}
		}
		System.out.println(check(mylist,mylist2));
	}
	public static String check(String a[],String b[]){
		for(int i=0;i<a.length;i++){
			if(!a[i].equals(b[i])){
				return "Deletion failed";
			}
		}
		return "Deletion succeeded";
	}

}