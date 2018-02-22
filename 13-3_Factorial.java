package lesson13;

/*_� ����� ��������� �����.
������������ Generic, ���� ����� � �������, ��������� try-catch
����� ������ ���� ���������
*/

//_� ����������: �������� ���� for - iterator

import java.util.Scanner;

public class Factorial <T> {

	private Scanner readNumber;
	private String inputNumber;
	private Integer number, factorial;
	
	public static void main(String[] args) {
				
		//_� ���������� ������ Factorial 
		//_� �������� ����������, ����� ����������� �������� ���������� � ���������
		Factorial <String> stringFactorial = new Factorial();
		Factorial <Scanner> scannerFactorial = new Factorial();
		Factorial <Integer> integerFactorial = new Factorial();
		
		//_� ��������� ��������� �������� ��� ����������� ������� �� ����� - ������� ����������
		integerFactorial.factorial = 1;
				
		scannerFactorial.readNumber = new Scanner(System.in);
		
		System.out.println("������� ����� : ");
		stringFactorial.inputNumber = scannerFactorial.readNumber.nextLine();
		
					
		//_� //_� ���� ��������� � ������� - �����
		//_� ��������� ��� � ��� int
		try {
			integerFactorial.number = Integer.parseInt(stringFactorial.inputNumber);
			 
			//_� ���������� ����������
			for (int i=1; i<=integerFactorial.number; i++) {
				integerFactorial.factorial *= i;
							
			}
			
			System.out.println(integerFactorial.factorial.intValue());
				
		} catch (NumberFormatException e) {
			System.out.println("�� ����� �� ����� �����!");
		}
		
	}

}
