import java.util.Scanner;

public class Program {   
    public static void main (String [] args) {
    Scanner in = new Scanner (System.in);
    System.out.println("Input a number: ");
    int num = in.nextInt();
    System.out.println("Input a number of bit: ");
    int bit = in.nextInt();
    String s = Integer.toBinaryString(num).substring(0,bit-1)+Integer.toBinaryString(num).substring(bit);
    System.out.println(Integer.parseInt(s,2));
    in.close ();
    }
}