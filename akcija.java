import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.OutputStream;
import java.util.*;
public class akcija{
	public static void main(String []args){
		Kattio io =new Kattio(System.in);
		int lines=io.getInt();
		int sum=0;
		PriorityQueue<Integer> q=new PriorityQueue<Integer>(Collections.reverseOrder());
		for(int i=0;i<lines;i++){
			q.add(io.getInt());
		}
		// while(!q.isEmpty()){
		// 	System.out.println(q.poll());
		// }
		while(!q.isEmpty() && q.size()>=3){
			sum+=q.poll();
			sum+=q.poll();
			q.poll();
		}
		while(!q.isEmpty()){
			sum+=q.poll();
		}
		while(!q.isEmpty()){
			sum+=q.poll();
		}
		System.out.println(sum);
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

