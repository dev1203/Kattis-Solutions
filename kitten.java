
import java.util.*;
import java.io.*;
public class kitten {
 public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  int stuck_on = scan.nextInt();
  int array[] = new int[101];
  while (scan.hasNextLine()) {
   String line = scan.nextLine();
   if (line.equals("-1")) {
    break;
   }
   line = line.trim();
   String string_array[] = line.split(" ");
   for (int i = 1; i < string_array.length; i++) {
    array[Integer.parseInt(string_array[i])] = Integer.parseInt(string_array[0].trim());
   }
  }
  while (stuck_on > 0) {
   System.out.print(stuck_on + " ");
   stuck_on = array[stuck_on];
  }
  System.out.println();
 }
}
