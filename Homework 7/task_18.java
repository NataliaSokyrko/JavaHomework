/*18.18. C������  �������� ������������ ����� � ���������� �� ����� ��� ���, �� ��������� ������ ������, 
 * �� ������ � ����� ������ '+' ��� ���� '3', �� ������������ ���� ����� ������.
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
