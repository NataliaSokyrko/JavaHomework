import java.io.IOException;
import java.io.StringReader;
import java.util.Scanner;

/*
Напишить програму LongestRun.java
 */


public class FindLongestRun {

	public static void main(String[] args) {		

		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the string : ");
		String strin = scanner.next();
		
		if (strin != null)
		{
			String strout = LongestRun(strin);
			System.out.println("longest run is : " + strout);
		}
		else
			System.out.println("Input string is empty");
		
		scanner.close();
	}
	
	public static String LongestRun(String strin)
	{		
		int pos = 0;
		int max_pos = strin.length();
		char this_elem;
		char last_elem;
		String strout = "";
		String strrep = "";
		int count = 1;
		int max_count = 0;
		
		last_elem = strin.charAt(pos);
		for (pos = 1; pos < max_pos; pos++)
		{
			this_elem = strin.charAt(pos);
			if (last_elem == this_elem)
			{
				count++;
				strrep = strrep + last_elem;
			}
			else				
			{
				if (count > max_count)
				{
					max_count = count;
					strout = strrep + last_elem;					
				}
				strrep = "";
				count = 1;
			}
			last_elem = this_elem;
		}
		if (count > max_count)
		{
			max_count = count;
			strout = strrep + last_elem;					
		}
			
		if (max_pos == 1)
			strout = strin;
		
		return strout;
		
	}
}