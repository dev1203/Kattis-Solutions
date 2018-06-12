// This solution works for both ArmyStrength(Weak) and ArmyStrength(Hard)

import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.OutputStream;
import java.util.PriorityQueue;

public class ArmyStrength{
	public static void main(String[]args){
		Kattio io=new Kattio(System.in);
		int testcase=io.getInt();
		for(int i=0;i<testcase;i++){
			int Ng=io.getInt();
			int Nm=io.getInt();
			PriorityQueue<Integer> gozilla=new PriorityQueue<Integer>();
			PriorityQueue<Integer> mgozilla=new PriorityQueue<Integer>();
			for(int j=0;j<Ng;j++){
				gozilla.add(io.getInt());
			}
			for(int j=0;j<Nm;j++){
				mgozilla.add(io.getInt());
			}
			while(!mgozilla.isEmpty() && !gozilla.isEmpty()){
				battle(mgozilla,gozilla);
			}
		}
	}
	public static void battle(PriorityQueue<Integer> mgozilla,PriorityQueue<Integer> gozilla){
		while(!mgozilla.isEmpty() && !gozilla.isEmpty()){
			int g=gozilla.poll();
			int m=mgozilla.poll();
			if(m>g){
				mgozilla.add(m);
			}
			else if(g==m){
				gozilla.add(g);
			}
			else{
				gozilla.add(g);
			}
		}
		if(gozilla.size()>mgozilla.size()){
			System.out.println("Godzilla");
		}
		else if(gozilla.size()<mgozilla.size()){
			System.out.println("MechaGodzilla");
		}
		else{
			System.out.println("uncertain");
		}
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
