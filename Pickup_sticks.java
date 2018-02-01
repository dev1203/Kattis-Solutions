//V00873441
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
//This class Diagraph, Directed Cycle,Depth firt Order and Topological sort 
//Is taken the Algorithms books (CSC:226)(UVIC).
public class Pickup_sticks
{
  public static void main(String[]args)throws Exception
  {
  BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
    String s=scan.readLine();
    String array[]=s.split(" ");
    int number_of_sticks=Integer.parseInt(array[0]);
    Digraph graph=new Digraph(number_of_sticks+1);
    int lines=Integer.parseInt(array[1]);
    for(int i=0;i<lines;i++){
      s=scan.readLine();
      array=s.split(" ");
      graph.addEdge(Integer.parseInt(array[0]),Integer.parseInt(array[1]));
    }
    Topological top=new Topological(graph);
    if(top.isDAG()==false){
      Stack a=top.ret();
      while(!a.isEmpty()){
        System.out.println(a.pop());
      }
  }
  else{
    System.out.println("IMPOSSIBLE");
  }
  }
 static class Digraph
{
   private final int V;
   private int E;
   private LinkedList<Integer>[] adj;
   public  Digraph(int V)
   {
     this.V = V;
     this.E = 0;
     adj = (LinkedList<Integer>[]) new LinkedList[V];
     for (int v = 0; v < V; v++)
     adj[v] = new LinkedList<Integer>();
   }
   public int V() { return V; }
   public int E() { return E; }
   public void addEdge(int v, int w)
   {
     adj[v].add(w);
     E++;
   }
   public Iterable<Integer> adj(int v)
   { return adj[v];
   }
   public Digraph reverse()
   {
     Digraph R = new Digraph(V);
     for (int v = 0; v < V; v++)
     for (int w : adj(v))
     R.addEdge(w, v);
     return R;
   }
}
static class DirectedCycle
{
   private boolean[] marked;
   private int[] edgeTo;
   private Stack<Integer> cycle; 
   private boolean[] onStack; 
   public DirectedCycle(Digraph G)
   {
     onStack = new boolean[G.V()];
     edgeTo = new int[G.V()];
     marked = new boolean[G.V()];
     for (int v = 1; v < G.V(); v++)
     if (!marked[v]) dfs(G, v);
   }
   private void dfs(Digraph G, int v)
   {
     onStack[v] = true;
     marked[v] = true;
     for (int w : G.adj(v))
     if (this.hasCycle()){
       return;
     }
     else if (!marked[w])
     { edgeTo[w] = v; dfs(G, w); }
     else if (onStack[w])
     {
     cycle = new Stack<Integer>();
     for (int x = v; x != w; x = edgeTo[x])
     cycle.push(x);
     cycle.push(w);
     cycle.push(v);
     }
     onStack[v] = false;
   }
   public boolean hasCycle()
   { return cycle != null; }
   public Iterable<Integer> cycle()
   { return cycle; }
}
 static class DepthFirstOrder
{
   private boolean[] marked;
   private Stack<Integer> reversePost;
   public DepthFirstOrder(Digraph G)
   {
     reversePost = new Stack<Integer>();
     marked = new boolean[G.V()];
     for (int v = 1; v < G.V(); v++)
     if (!marked[v]) dfs(G, v);
   }
   private void dfs(Digraph G, int v)
   {
     marked[v] = true;
     for (int w : G.adj(v))
     if (!marked[w])
     dfs(G, w);
     reversePost.push(v);
   }
   public Iterable<Integer> reversePost()
   { return reversePost; }
   public Stack returnit(){
    return reversePost;
   }
}
static class Topological
{
   private Iterable<Integer> order;
   Stack c;
   public Topological(Digraph G)
   {
    DirectedCycle cyclefinder=new DirectedCycle(G);
    if(!cyclefinder.hasCycle()){
     DepthFirstOrder dfs = new DepthFirstOrder(G);
     order = dfs.reversePost();
     c=dfs.returnit();
   }
   }
   public Stack ret(){
      return c;
   }
   public Iterable<Integer> order()
   { return order; }
   public boolean isDAG()
   { return order == null; }
}
  
}