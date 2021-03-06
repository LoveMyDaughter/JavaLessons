package lesson13;

/*_� ��������� ����� ���� ����� � �������� � ������
 ������������ Generic, ���� ����� � �������, ��������� try-catch
 ����� ������ ���� ���������
*/

import java.util.Scanner;

//_� ���������� Generic ��� ������
public class Sum <T> {

	private static Scanner readNumber;
	
	//_� ������, ������� ������ ������������ � �������
	private static String firstNumber, secondNumber;
	
	//_� ���������� ������ ����
	private T value1, value2;
	
	//_� ������ ������� ����� (��� �� �����)
	public T getValue1() {
		return value1;
	}
	
	//_� ������ ������� ����� (��� �� �����)
	public T getValue2() {
		return value2;
	}
	
	//_� ������ ��� ���������� ��������� ����� ���������� value1 � value2
	public void setValue(T val1, T val2) {
		value1 = val1;
		value2 = val2;
		
		
	}
	
	public static void main(String[] args) {
		
		readNumber = new Scanner(System.in);
		
		System.out.print("������� ������ ����� : ");
		firstNumber = readNumber.nextLine();
		
		System.out.print("������� ������ ����� : ");
		secondNumber = readNumber.nextLine();
		
		//_� ��������� ������ Sum ���� Double 
		Sum <Double> doubleInstance = new Sum();
					
				
		try {
			
			//_� ���� ��������� � ������� - �����
			//_� ��������� �� � ��� Double
			doubleInstance.setValue(Double.parseDouble(firstNumber), Double.parseDouble(secondNumber));
			
			//System.out.println(doubleInstance.getValue1());
			//System.out.println(doubleInstance.getValue2());
						
			System.out.println("����� ����� = " + (double)(doubleInstance.getValue1()+doubleInstance.getValue2()));
		
		} catch (Exception e) {
			System.out.print("���� ��� ��� �������� �� �������� �������! - ");
			System.out.println(firstNumber + " " + secondNumber);
			System.out.println("����� ����� ����������.");
		}
		

	}

}
