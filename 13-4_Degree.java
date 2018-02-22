package lesson13;

/*_� ����� �������� ������� �����.
������������ Generic, ���� ����� � �������, ��������� try-catch
����� ������ ���� ���������
*/

//_� ��� �������� ����� ������������ ������ ����� �����

import java.util.Scanner;

public class Degree <T> {

	private Scanner readNumber, readDegree;
	private String inputNumber, inputDegree;
	
	//_� ����� - number, ������� - degree, ����� � ������� - result
	private Integer number, degree, result;
	
	public static void main(String[] args) {
				
		//_� ���������� ������ Factorial 
		//_� �������� ����������, ����� ����������� �������� ���������� � ���������
		Degree <String> stringDegree = new Degree();
		Degree <Scanner> scannerDegree = new Degree();
		Degree <Integer> integerDegree = new Degree();
					
		scannerDegree.readNumber = new Scanner(System.in);
		scannerDegree.readDegree = new Scanner(System.in);
		
		System.out.println("������� ����� : ");
		stringDegree.inputNumber = scannerDegree.readNumber.nextLine();
		
		System.out.println("������� ������� : ");
		stringDegree.inputDegree = scannerDegree.readDegree.nextLine();
		
					
		//_� //_� ���� ��������� � ������� - �����
		//_� ��������� ��� � ��� int
		try {
			integerDegree.number = Integer.parseInt(stringDegree.inputNumber);
			integerDegree.degree = Integer.parseInt(stringDegree.inputDegree);
			 
			//_� ���������� ����������
			integerDegree.result = integerDegree.number;
			for (int i=1; i<integerDegree.degree; i++) {
				integerDegree.result *= integerDegree.number;
			}
			
			System.out.println(integerDegree.result.intValue());
				
		} catch (NumberFormatException e) {
			System.out.println("�������� ������ ����� ��� �������!");
		}
		
	}

}
