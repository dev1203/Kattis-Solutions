import java.util.*;

public class securedoors{
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int testcase = Integer.parseInt(scan.nextLine());
        Map< String,Boolean> employee =  new HashMap< String,Boolean>();
        for (int i =0; i<testcase; i++){
            String line [] = scan.nextLine().split(" ");
            boolean at_work;
            if (line[0].equals("entry")){
                if (employee.containsKey(line[1])) {
                    boolean value = employee.get(line[1]);
                    if(value == true){
                        System.out.println(line[1]+" entered (ANOMALY)");
                    }
                    else{
                        System.out.println(line[1]+" entered");
                    }
                }
                else{
                    System.out.println(line[1]+" entered");
                }
                at_work = true;
            }
            else{
                if (employee.containsKey(line[1])) {
                    boolean value = employee.get(line[1]);
                    if(value == true){
                        System.out.println(line[1]+" exited");
                    }
                    else{
                        System.out.println(line[1]+" exited (ANOMALY)");
                    }
                } 
                else{
                    System.out.println(line[1]+" exited (ANOMALY)");
                }
                at_work = false;
            }
            employee.put(line[1],at_work);
        }
          scan.close();
    }
    public static void printMap(Map mp) {
        Iterator it = mp.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());
            it.remove(); // avoids a ConcurrentModificationException
        }
    }
}