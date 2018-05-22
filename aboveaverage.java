import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.OutputStream;
import java.text.*;
public class aboveaverage{
	public static void main(String []args){
		Kattio io=new Kattio(System.in);
		int lines=io.getInt();
		DecimalFormat df = new DecimalFormat("0.000");
		for(int i=0;i<lines;i++){
			int students=io.getInt();
			int average=0;
			int count=0;
			int number[]=new int[students];
			for(int j=0;j<students;j++){
				number[j]=io.getInt();
				average+=number[j];
			}
			average=average/students;
			for(int j=0;j<students;j++){
				if(number[j]>average){
					count++;
				}
			}
			double ans=((double)(count)/(double)students)*100;
			// System.out.println((count/100)*students);
			System.out.println(getTwoDecimals(ans)+"%");
		}

	}

private static String getTwoDecimals(double value){
      DecimalFormat df = new DecimalFormat("0.000"); 
      return df.format(value);
    }

}

class Kattio extends PrintWriter {
    public Kattio(InputStream i) {
        super(new BufferedOutputStream(System.out));
        r = new BufferedReader(new InputStreamReader(i));
    }
    public Kattio(InputStream i, OutputStream o) {
        super(new BufferedOutputStream(o));
        r = new BufferedReader(new InputStreamReader(i));
    }

    public boolean hasMoreTokens() {
        return peekToken() != null;
    }

    public int getInt() {
        return Integer.parseInt(nextToken());
    }

    public double getDouble() {
        return Double.parseDouble(nextToken());
    }

    public long getLong() {
        return Long.parseLong(nextToken());
    }

    public String getWord() {
        return nextToken();
    }



    private BufferedReader r;
    private String line;
    private StringTokenizer st;
    private String token;

    private String peekToken() {
        if (token == null)
            try {
                while (st == null || !st.hasMoreTokens()) {
                    line = r.readLine();
                    if (line == null) return null;
                    st = new StringTokenizer(line);
                }
                token = st.nextToken();
            } catch (IOException e) { }
        return token;
    }

    private String nextToken() {
        String ans = peekToken();
        token = null;
        return ans;
    }
}

