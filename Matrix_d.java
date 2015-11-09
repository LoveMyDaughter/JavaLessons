//_� ���� ���������� ������� ������� n (n �����, n ��������). ����� ���������� �� �������� ���������,
//_� ������������� � ����-����� ������ ������.
//_� ������� �)

package Lesson7;

import java.util.Random;

public class Matrix_d {

	public static void main(String[] args) {

		int n=8;	//_� ���������� ����� � ��������
		Integer[][] matrixArray = new Integer[n][n];
		Random random = new Random();
		
		//_� ���������� �� ����� ������ ��� �����������
			for (int y=0; y<n; y++) {
				for (int x=0; x<n; x++) {
					matrixArray[y][x] = random.nextInt(100);	//_� ����������� ������� �������� ��������� �����
					System.out.printf("%02d",matrixArray[y][x]);	//_� ������� ������ (��� ����� 2-�������� ��� ������������)
					System.out.printf(" ");	//_� ������ ����� ���������
				} System.out.println();	//_� ������� ������� �� ����� ������ ��� �����������
			}	
		//
				
		int max = matrixArray[n-1][n-1];
		
		//_� ������� ������������ ��������
		for (int y=(n-1); y>=0; y--) {
			for (int x=y; x>=(n-y)-1; x--) {
				
				if (matrixArray[y][x] > max) {
					max = matrixArray[y][x];
				}
			} 
		}
		System.out.println("������������ ��������= " + max);

	}

}
