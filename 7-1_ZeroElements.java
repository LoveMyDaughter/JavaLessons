//_� ������� ���������� ��������� == 0 � ��������� ������ 3�4
package Lesson7;

import java.util.Random;

public class ZeroElements {

	public static void main(String[] args) {

		Integer[][] randomArray = new Integer[3][4];
		Random random = new Random();
		int count = 0;
		
		for (int i=0; i<3; i++) {
			for (int j=0; j<4; j++) {
				randomArray[i][j] = random.nextInt(10);	//_� ����������� ������� �������� ��������� �����
				System.out.print(randomArray[i][j] + " ");	//_� ������� ������
				if (randomArray[i][j] == 0) count++;
			} System.out.println();	//_� ������� ������� �� ����� ������ ��� ����������� 
		}
		System.out.println("���������� ��������� ������ ����: " + count);

	}

}
