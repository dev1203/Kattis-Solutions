import java.util.*;

public class anothercandies{
	public static void main(String []args){
		Scanner scan=new Scanner(System.in);
		int testcase=Integer.parseInt(scan.nextLine());
		String s="";
		for(int i=0;i<testcase;i++){
			if(i==0)
			s=scan.nextLine();
		int sum=0;
		int count=0;
		while(!(s=scan.nextLine()).equals("")){
			sum+=Integer.parseInt(s);
			count++;
			if(!scan.hasNextLine()){
				break;
				}
			}
			System.out.println(count);
			if(sum%count==0){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");

			}
		}
	}
}
