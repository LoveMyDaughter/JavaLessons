/*_� �������� �������, ������� ��������� � �������� ���������� ������������ �����
� ���������� ������ ����� ���������� �����, ������� ������ ��������. ������� ������� ��������
���������� �������������� ������������� ����� � �������� ���������. 
*/

package lesson9;

import java.util.Scanner;

public class RoundMethod {
	
	private static Scanner readParams;
	static boolean correctNumber, correctDigits = false;	//_� ��� �������� ���� �������� ������
	
	static double number;	//_� �������� �����
	static int digits;	//_� ���������� ������ ����� �����
	
	
	//_� ����� ����������
	static void getRound(double number, int digits) {
		
		//_� ��� ���������� ������� � ����� �� �
		double y = Math.pow(10, digits);
		System.out.println("�������� �� " + y);
		
		System.out.println("���������� ����������� �����: " + Math.round(number*y));
		double result = Math.round(number*y)/y;
				
		System.out.println(result);
		
	}

	public static void main(String[] args) {
		
		while (!correctNumber) {
			System.out.println("������� ������������ �����: ");	
			readParams = new Scanner(System.in);	
			
			//_� �������� ���� �������� ������ - ��� ������ Double
			if (readParams.hasNextDouble()) {
				correctNumber = true;
				number = readParams.nextDouble();
										
				//_� ������ ������� ����� ==���������� ������== ��� ������������ �������
				while (!correctDigits) {
					System.out.println("������� ���������� ������ ����� �����: ");	
					readParams = new Scanner(System.in);	
					
					//_� �������� ���� �������� ������ - ��� ������ iNTEGER
					if (readParams.hasNextInt()) {
						correctDigits = true;
						digits = readParams.nextInt();
													
					} else {
						System.out.println("������� ������� ���������� ������");
						correctDigits = false;
					}
				}

				
			} else {
				System.out.println("�������� ������ �����!");
				correctNumber = false;
			}
		}
			
			//_� ���������� ����� ������ ��� ����������
			getRound(number, digits);
				
		
	}

}
