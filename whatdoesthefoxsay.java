import java.util.Scanner;

public class whatdoesthefoxsay{
    public static void main(String []args){
       Scanner scan = new Scanner(System.in);
        int testcase = Integer.parseInt(scan.nextLine());
        for(int i = 0; i < testcase; i++){
            String sample [] = scan.nextLine().split(" ");
            String known = scan.nextLine();
            while(!known.equals("what does the fox say?")){
                remove(sample, known.split(" ")[2]);
                known=  scan.nextLine();
            }
            for (String var : sample) {
                if(!var.equals(""))
                System.out.print(var+" ");
            }
            System.out.println();
        }
        scan.close();
    }
    public static void remove(String []arr, String val){
        for(int i =0;i<arr.length;i++){
            if(arr[i].equals(val)){
                    arr[i] = "";
            }
        }  
    }
}