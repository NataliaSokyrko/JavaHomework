//14.14. Скласти  програму перетворення слова А, видаливши у ньому кожний символ '*' та подвоївши кожний символ, відмінний від '*'.

import java.util.*;

public class task_14{
	static void func(String A){
		String step_1 = A.replaceAll("\\*", "");
		System.out.println(step_1);
		String result = "";
		int i = 0;
		while (i < step_1.length()){
		    char c = step_1.charAt(i);
		    result = result + c + c;
		    i++;
		}
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String A = scanner.nextLine();
		func(A);
		scanner.close();
	}
	
}
