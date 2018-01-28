import java.io.BufferedReader;
import java.io.InputStreamReader;
public class conundrum{
	public static void main(String []args) throws Exception{
BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
	String s=scan.readLine();
	int days=0;
	for(int i=0;i<s.length();i++){
	if(!Character.toString(s.charAt(i)).equals("P")){
			days++;
			}
			if(!Character.toString(s.charAt(i+1)).equals("E")){
				days++;
			}
			if(!Character.toString(s.charAt(i+2)).equals("R")){
				days++;
			}
				i+=2;
		}
		System.out.println(days);
	}
}