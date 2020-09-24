import java.util.Scanner;

public class Main{
	public static void main(String[] args) { 
	   Scanner myObj = new Scanner(System.in);
	   System.out.println("input n: ");
	   int n = myObj.nextInt();
	   System.out.println("Input x: ");
		double x = myObj.nextDouble();
		chepol newChepol = new chepol();
	 	System.out.println(newChepol.chePolynom(n, x));
		myObj.close(); 
    	
}
}