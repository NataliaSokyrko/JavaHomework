/*
������� ������ �3. ���������� ������
�������� 6.4
������ ���� �������� �������, ������������ �� ������ � ������ ��������� ���������� ������� �����.
*/
import java.util.Arrays;

public class Homework_3 {
    static int summ(int[][] m) {
    	System.out.println("��������� ���� �������� �������, ������������ �� ������ � ������ ��������� ������� ������� �����:");
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
    	System.out.println("���� �������� ������� ����� ������� �� 1-� � 2-� ��������� ���������� " + sum);
    	return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, -5, 3}, {4, -5, 6}, {7, -8, 9}};
        int ij = summ(matrix);


    }

}