import java.util.Scanner;
public class pervasiveheartmonitor{
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextLine()){
            String value [] = scan.nextLine().split(" ");
            double total = 0;
            String name = "";
            double count = 0.0;
            for (int i =0 ;i< value.length;i++){
                try {
                    total+= Double.parseDouble(value[i]);
                    count++;
                }
                catch(Exception e) {
                    name+=" "+value[i];
                }
            }
            System.out.println((total/count)+name);
        }
        scan.close();
    }   
}