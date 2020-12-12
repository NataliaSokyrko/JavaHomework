/*18.18. Cкласти  програму перетворення рядка А видаленням із нього всіх ком, які передують першій крапці, 
 * та заміною у ньому знаком '+' усіх цифр '3', які зустрічаються після першої крапки.
 */

import java.util.*;

public class task_18 {
	static void func(String A){
		int point = A.indexOf('.');
        char[] str = A.toCharArray();
        for (int i = 0; i < str.length; i++)
        {
            if (i < point)
            {   
                if (str[i] == ',')
                {
                    for (int j = i; j < str.length - 1; j++)
                        str[j] = str[j+1];
                    str[str.length-1] = '\0';
                }
            }
        }
        String str1 = new String(str);
        String str2 = str1.replaceAll("3", "+");
        System.out.println(str2);
	}
	

	public static void main(String[] args) {
		System.out.println("Input string: ");
		Scanner scanner = new Scanner(System.in);
		String A = scanner.nextLine();
		func(A);
		scanner.close();
	}
	

}
