import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.OutputStream;
import java.util.ArrayList;
public class ACM{
	public static void main(String []args){
		Kattio io=new Kattio(System.in);
		int N=io.getInt();
		int firstsolve=io.getInt();
		ArrayList<Integer> problem=new ArrayList<Integer>();
		for(int i=0;i<N;i++){
			problem.add(io.getInt());
		}
		solveit(problem,firstsolve);
	}
	public static void solveit(ArrayList<Integer> a, int first){
		int total=0;
		int intial=a.size();
		total+=a.get(first);
		if(a.get(first)<300){
			int removed=a.remove(first);
		}
		while(total<300){
			total+=smallest(a);
		}
		int num=(intial-a.size());
		if(num==0){
		System.out.println(0+" "+0);

		}
		else{
		System.out.println(num+" "+total);
		}
	}
	public static int smallest(ArrayList<Integer> a){
		int smallest=a.get(0);
		int index=0;
		for(int i=0;i<a.size();i++){
			if(a.get(i)<smallest){
				smallest=a.get(i);
				index=i;
			}
		}
		a.remove(index);
		return smallest;
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
