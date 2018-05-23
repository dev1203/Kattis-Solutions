import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.OutputStream;
import java.util.*;
public class bricks{
	public static void main(String []args){
		Kattio io=new Kattio (System.in);
		int height=io.getInt();
		int width=io.getInt();
		int number=io.getInt();
		ArrayList<Integer> arr=new ArrayList<Integer>();
		for(int i=0;i<number;i++){
			arr.add(io.getInt());
		}
		for(int i=0;i<height;i++){
			if(checkit(arr,width)==false){
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}
	public static boolean checkit(ArrayList<Integer> arr,int width){
		// System.out.println(arr);
		int sum=0;
		int count=0;
		while(arr.size()>0){
			sum+=arr.get(0);
			arr.remove(0);
			if(sum==width){
				return true;
			}
			if(sum>width){
				return false;
			}
			count++;
		}
		return false;
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

