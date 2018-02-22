package lesson14;

/*_� ������������ ������ ������ � ���������� � ������������� ������. ���������� ���������,
 * c������ ��������� ������� ������ ������, ������� �������� � ������� ����� ������.
 */

import java.util.Scanner;

public class LineInArray {

	private static Scanner scanner;

	public static void main(String[] args) {

		scanner = new Scanner(System.in);
		
		//_� ����������� ������������� ������
		char [] defaultArray = new char [20]; 
		System.out.println("����� �������������� ������� = " + defaultArray.length);
		
		System.out.println();
							
		System.out.print("������� ������: ");
		
		//_� ������, ��������� �������������
		String phraze = scanner.nextLine();
		
		System.out.println();
		
		//_� ���������� �������� ��������� ������
		int phrazeLength = phraze.length();
		//System.out.println("���������� �������� = " + phraze.length());

		
		//_� ���������, ���������� �� ��������� ������ � ������������� ������
		if (phrazeLength > defaultArray.length) {
			System.out.println("��������� ������ �� ���������� � ������!");
			System.exit(0);
			
		} else {
			//_� ������� ������ � ������ char[]
			char [] inputArray = phraze.toCharArray();
			
			//_� ������� ��������� �� ���������� ������� - � ��������� 
			for (int i=0; i<inputArray.length; i++) {
				defaultArray[i] = inputArray[i]; 
			}
			
			//_� ������ ���������� ���������
			System.out.println("������ ��������� ������� = " + inputArray.length);
			System.out.println("��������� ��������� = " + (defaultArray.length - inputArray.length));
			System.out.println("���� ��������� ������ = " + defaultArray.length);
			
		}
		
			
	}

}
