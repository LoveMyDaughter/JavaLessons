//_�    ��� ������ ��������� ����� � ��������� �� -20 �� +20. ���������� ����� ������� �������
//    ������������� ��������� (������ ������ �������������� �������� � ������ ������� 
//    �������������� ��������) � ������������� ��������, ����������� ����� ����. 


package lesson10;
import java.util.Random;

public class SortBetweenNegatives {
	
	static int leftKey;
	static int rightKey;
	static int leftKeyIndex;
	static int rightKeyIndex;
	
	static boolean leftKeyExists = false;
	static boolean rightKeyExists = false;
	

	public static void main(String[] args) {

		Random random = new Random();
		
		int length = 10;
		Integer[] randomArray = new Integer[length];
//		Integer[] randomArray = {1, 1, 100, 2, -17, -8, 32, 15, 3, 66};
		
		
		//_� ������ ��������� ����� (-20, 20)
		for (int i=0; i<randomArray.length; i++) {
			randomArray[i] = random.nextInt(40)-20;
			System.out.print(randomArray[i] + " ");
		}
		
		System.out.println();
		
		//_� ����� �������� ������ �������������� ��������
		for (int i=0; i<randomArray.length; i++) {
			
			if (randomArray[i]<0) {
				leftKey = randomArray[i];
				leftKeyIndex = i;
				leftKeyExists = true;
				break;
			}
		}
		
		//_� ����� �������� ������� �������������� ��������
		//_� ���� ��� �������� ������ - ��� ������ ������ ������� ������
		if (leftKeyExists) {
			for (int i=randomArray.length-1; i>0; i--) {
				
				if (randomArray[i]<0) {
					rightKey = randomArray[i];
					rightKeyIndex = i;
					rightKeyExists = true;
					break;
				}
			}
		} else {
			System.out.print("������������� ��������� ���!");
		}
			
			
		//_� ����� ������ � ����������� �� ������� ������������� ���������	
		if (rightKeyIndex - leftKeyIndex > 1) {
			System.out.print("����� �������� ������: " + leftKeyIndex + "\n����� �������� �������: " + rightKeyIndex);
			System.out.println();
			
			//_� ����������
			for (int i=leftKeyIndex; i<=rightKeyIndex; i++) {
				int k = i;
				int x = randomArray[i];
				
				for (int j=i+1; j<=rightKeyIndex; j++) {
					if (randomArray[j] < x) {
						k = j;
						x = randomArray[j];
						randomArray[k] = randomArray[i];
						randomArray[i]  =  x;
					}
				}
				System.out.print(x + " ");
			}
			
		} else {
			System.out.println("������������� ������� ������ ����, ��� 2 �� �����!\n������ �����������.");
		}

	}

}
