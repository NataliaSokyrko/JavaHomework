//12)Виділити з рядка найбільший монотонний підрядок, коди послідовних символів якого відрізняються на 1.

import java.util.Scanner;

public class task_12{
    static String longestMonotoneSubstring(String A){
        //Пошук найбільшого монотонного підрядка
        //param: A - вхідний рядок
        char currSymb;
        int currSymInt;
        String currSubstring = "";
        String ansSubstring = "";
        int maxLen = 0;
        for (int i = 0; i < A.length();i++){
            currSymb = A.charAt(i);
            currSymInt = currSymb;
            int n = currSubstring.length();
            if (n == 0) currSubstring += currSymb;
            else{
                if (Math.abs(currSymInt - (int) currSubstring.charAt(n - 1)) == 1){
                    currSubstring += currSymb;
                }
                else {
                    if (n > maxLen){
                        maxLen = n;
                        ansSubstring = currSubstring;
                    }
                    currSubstring = "" + currSymb;
                }
            }
        }

        if (currSubstring.length() > maxLen){
            ansSubstring = currSubstring;
        }

        return ansSubstring;
    }
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Input string : ");
        String A = in.nextLine();
        System.out.println("Longest monotone substring: ");
        System.out.println(longestMonotoneSubstring(A));
        System.out.println("END!");
        in.close();
    }

}