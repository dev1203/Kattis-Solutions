import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.OutputStream;
import java.util.*;
public class colour{
	public static int N;
	public static int adj[][];
	public static int x[];
	public static int m;
	public static void main(String []args){
		Scanner scan=new Scanner(System.in);
		ArrayList<Integer> arr=new ArrayList<Integer>();
		N=Integer.parseInt(scan.nextLine());
		adj=new int[N][N];
		x=new int[N];	
		for(int i=0;i<N;i++){
			adj[i][i]=1;
			String s[]=scan.nextLine().split(" ");
			for(int j=0;j<s.length;j++){
				int k=Integer.parseInt(s[j]);
				adj[i][k]=1;
			}
		}
		// for(int i=0;i<N;i++){
		// 	for(int j=0;j<N;j++){
		// 		System.out.print(adj[i][j]+" ");

		// 	}
		// 	System.out.println();
		// }
			for(m=2;m<=N;m++){
				x[0]=1;
				colour_it(0);
				if(!iszero(x)){
					for(int j=0;j<N;j++){
						if(!arr.contains(x[j])){
							arr.add(x[j]);
						}
					}
					System.out.println(arr.size());
					return;
				}
			}
		}
	public static boolean iszero(int k[]){
		for(int i=0;i<k.length;i++){
			if(k[i]==0){
				return true;
			}
		}
		return false;
	}
	public static boolean colour_it(int k){
		if(k==x.length){
			return true;
		}
		if(x[k]!=0){
			return colour_it(k+1);
		}
		for(int c=1;c<=m;c++){
			if(worth_it(k,c)){
				x[k]=c;
			if(colour_it(k+1)){
			return true;
				}
				x[k]=0;
				}
			}
			return false;
		}
	public static boolean worth_it(int k,int c){
		for(int i=0;i<N;i++){
			if(adj[k][i]==1){
				if(c==x[i]){
				return false;
				}
				}
			}
			return true;
		}
	public static void toString(String a[]){
	for(int i=0;i<a.length;i++){
		System.out.print(a[i]+" ");
	}
	System.out.println();
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
//I learned how to solve this porblem from one of the youtube video from CSBREAKDOWN