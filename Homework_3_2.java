/*
Домашня робота №3. Батовинмірні масиви
Завдання 6.4
Знайти суму елементів матриці, розташованих між першим і другим додатними елементами кожного рядка.
*/
import java.util.Arrays;

public class Homework_3 {
    static int summ(int[][] m) {
    	System.out.println("Знаходимо суму елементів матриці, розташованих між першим і другим додатними числами кожного рядка:");
        int first, second;
        int sum = 0;
    	for (int i = 0; i < m.length; i++) {
    		for (first = 0; first < m[i].length; first++) {
    			if (m[i][first] > 0) {
    				break;
    		}
    		}
    		for (second = first+1; second < m.length; second++) {
    			if (m[i][second] > 0) {
    				break;
    			}
    		}
    		for (int j = first+1; j < second; j++) {
            	sum += m[i][j];
            }
            
        }
    	System.out.println("Сума елементів кожного рядка матриці між 1-м і 2-м додатними елементами " + sum);
    	return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, -5, 3}, {4, -5, 6}, {7, -8, 9}};
        int ij = summ(matrix);


    }

}