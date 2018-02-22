package lesson14;

/*_� �������� �� ����� � m �� n �������� ������, ��������� �������������
 *  � �������� ������ ������� � ������ ������. (m � n ����� �������� �������������)
 * 
 */

import java.util.Scanner;

public class PartOfArray {

	private static Scanner scanner;
	private static int m,n;

	public static void main(String[] args) {
		
		scanner = new Scanner(System.in);
		
		//_� ����������� ������, � ������� ����� ���������� ������� ������
		char [] defaultArray; 
		
		//_� ���� ������ �������������
			System.out.print("������� ������: ");
			
			//_� ������, ��������� �������������
			String phraze = scanner.nextLine();
		
			//_� ���������� �������� ��������� ������
			int phrazeLength = phraze.length();
						
			try {
				System.out.print("������� ����� ������� �������: ");
				
				//_� ��������� ������ - m
				m = scanner.nextInt();
						
				System.out.print("������� ����� ���������� �������: ");
			
				//_� ��������� ������ - n
				n = scanner.nextInt();
				
				
				//_� �������� ����������� m � n
				if ( (m >=0) & (m <= phrazeLength) ) {
					if ( (n >= m) & (n <= phrazeLength) ) {
						
						//_� ������� ������ � ������ char[]
						char [] inputArray = phraze.toCharArray();
						
						//_� �������������� ��������� ������ ������ - � ������� ������
						defaultArray = new char [n-m+1];
						
						//_� ������� ��������� �� ���������� ������� - � ���������
						int j=0;
						for (int i=m-1; i<n; i++) {
							defaultArray[j] = inputArray[i];
							System.out.print(defaultArray[j]);
							
							j++;
						}
						
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
		
		//_� -����� �����
			
			
		
			
	}

}
