import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.math.BigInteger;
public class  A_different_problem{
	public static void main(String []args) throws Exception{
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		String s=scan.readLine();
		while(s!=null){
		String array[]=s.split(" ");
		BigInteger a=new BigInteger(array[0]);
		BigInteger b=new BigInteger(array[1]);
		BigInteger answer= a.subtract(b).abs();
		System.out.println(answer);
		s=scan.readLine();
	}
}
}