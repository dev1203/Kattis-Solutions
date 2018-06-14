import java.util.*;
public class AnthonyandDiablo{
	public static void main(String []args){
		Scanner scan=new Scanner(System.in);
		double A=scan.nextDouble();
		double N=scan.nextDouble();
		double area=(N*N)/(4*Math.PI);
		if(area>=A){
			System.out.println("Diablo is happy!");
		}
		else{
			System.out.println("Need more materials!");
		}
	}
}