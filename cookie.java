//V00873441
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.OutputStream;
public class cookie{
public static void main(String []args){
Kattio scan=new Kattio(System.in);
PriorityQueue<Integer> q=new PriorityQueue<Integer>();
PriorityQueue<Integer> q2=new PriorityQueue<Integer>(Collections.reverseOrder());
while(scan.hasMoreTokens()){
	String j=scan.getWord();
	if(j.equals("#")){
		if((q.size()+q2.size())%2==0){
			System.out.println(q.poll());
		}
		else{
			System.out.println(q2.poll());
		}
        }
	else if(Integer.parseInt(j)<300000000){
		int i=Integer.parseInt(j);
		if(q.size()==0 || i>q.peek()){
			q.add(i);
		}
		else {
			q2.add(i);
		}
		if(q2.size()>(q.size()+1)){
			q.add(q2.poll());
		}
  		if(q.size()>q2.size()){
  			q2.add(q.poll());
  		}
	}
	}
	scan.close();
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