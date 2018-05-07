import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.OutputStream;
import java.util.*;
public class Board {
	public int[][] solution;
	int path = 1;
	public static TreeMap<Integer,PriorityQueue<String>> tree;
	public Board(int N) {
		solution = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				solution[i][j] = 0;
			}
		}
	}
	public boolean searchWord(char[][] matrix, String word) {
		int N = matrix.length;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (search(matrix, word, i, j, 0, N)) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean search(char[][] matrix, String word, int row, int col,
			int index, int N) {
		if (solution[row][col] != 0 || word.charAt(index) != matrix[row][col]) {
			return false;
		}
		if (index == word.length() - 1) {
			solution[row][col] = path++;
			return true;
		}
		solution[row][col] = path++;		
		if (row+1<N && search(matrix,word,row+1,col,index+1,N)) {																// down
			return true;
		}
		if (row-1>=0 && search(matrix,word,row-1,col,index+1,N)) {
			return true;
		}
		if (col+1<N && search(matrix,word,row,col+1,index+1, N)) {
			return true;
		}
		if (col-1>=0 && search(matrix,word,row,col-1,index+1,N)) {
			return true;
		}
		if (row-1>=0 && col+1<N && search(matrix,word,row-1,col+1,index+1,N)) {
			return true;
		}
		if (row-1>=0 && col-1>=0 && search(matrix,word,row-1,col-1,index+1,N)) {
			return true;
		}
		if (row+1<N && col-1>=0 && search(matrix,word,row+1,col-1,index+1,N)) {
			return true;
		}
		if (row+1<N && col+1<N && search(matrix,word,row+1,col+1,index+1,N)) {
			return true;
		}
		solution[row][col] = 0;
		path--;
		return false;
	}

	public static void main(String []args){
	Kattio io=new Kattio(System.in);
	int dict_num=io.getInt();
	String arr[]=new String[dict_num];
	for(int i=0;i<dict_num;i++){
		arr[i]=io.getWord();
	}
	int b=io.getInt();
	for(int u=0;u<b;u++){
		tree=new TreeMap<Integer,PriorityQueue<String>>();
		int first_pass[]=new int[100];
		char matrix[][]=new char[4][4];
			for(int i=0;i<4;i++){
				String s=io.getWord();
				for(int j=0;j<4;j++){
					matrix[i][j]=s.charAt(j);
					first_pass[(int)matrix[i][j]]=(int)matrix[i][j];
				}
			}
			int score=0;
			int count=0;
			for(int i=0;i<arr.length;i++){
				if(first_pass[arr[i].charAt(0)]!=0){
					Board w = new Board(matrix.length);
				if (w.searchWord(matrix,arr[i])) {
					count++;
					if(arr[i].length()==3 || arr[i].length()==4){
						score+=1;
					}
					else if(arr[i].length()==5){
						score+=2;
					}
					else if(arr[i].length()==6){
						score+=3;
					}
					else if(arr[i].length()==7){
						score+=5;
					}
					else if(arr[i].length()==8){
						score+=11;
					}
					if(!tree.containsKey(arr[i].length())){
					PriorityQueue<String> q=new PriorityQueue<String>();
					q.add(arr[i]);
					tree.put(arr[i].length(),q);
					}
					else{
						PriorityQueue<String> q=tree.get(arr[i].length());
						q.add(arr[i]);
						tree.put(arr[i].length(),q);
					}
					}					
				}
			}
			String max="";
			PriorityQueue<String> q=tree.get( tree.lastKey());
			System.out.println(score+" "+q.peek()+" "+count);
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