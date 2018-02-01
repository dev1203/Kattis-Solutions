import java.util.*;
import java.io.*;
public class bishop{
	public static void main(String []args) throws Exception{
		BufferedReader scan=new BufferedReader(new InputStreamReader(System.in));
		String s;
		while((s=scan.readLine())!=null){
			int a=Integer.parseInt(s);
			if(a==1){
				System.out.println(1);
			}
			else{
				System.out.println((2*a)-2);
			}
		}
	}
}