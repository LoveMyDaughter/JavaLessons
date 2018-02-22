package lesson14;

//_� ������� � m �� n ��������, ������������ ������ � �������� �� �� �����.

import java.util.Scanner;
 
public class ReWrite {
	
	private static Scanner scanner;
	private static int m,n;

	public static void main(String[] args) {

		//_� ����������� ������
		String string = "� ��������� ������ ���� Java";
				
		//_� ������, � ������� ����� ��������������
		String result = "";
		
		System.out.println(string);

		scanner = new Scanner(System.in);
		
		
		try {
			System.out.print("������� ����� ������� �������: ");
			
			//_� ��������� ������ - m
			m = scanner.nextInt();
					
			System.out.print("������� ����� ���������� �������: ");
		
			//_� ��������� ������ - n
			n = scanner.nextInt();
			
			
			//_� �������� ����������� m � n
			if ( (m >=0) & (m <= string.length()) ) {
				if ( (n >= m) & (n <= string.length()) ) {
					
					//_� ���������� ������
					for (int i=0; i<string.length(); i++) {
						if ( (i>=0 & i<m) || (i>n & i<string.length()) )
							result += string.charAt(i);
					}
					
					//_� ����� �������������� ������
					System.out.println(result);
					
				} else {
					System.out.println("����� ���������� ������� ������� �� ���������� ��������.");
				}
			} else {
				System.out.println("����� ������� ������� ������� �� �������� ������.");
			}
			
			//
				
		} catch (java.util.InputMismatchException e) {
			System.out.println("�������� ������!");
			System.exit(0);
		}
		
	}

}
