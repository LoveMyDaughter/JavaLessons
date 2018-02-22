//_� ���� �������. 
/* �������: ������� ��� ��������� ������ �� ���������� �� 1 �� 6. ���� ���������� � �����������,
 * ������ ��������� ����������. ��������� ���, � ���� ����� �������� ����� �� ������ ���� �������
 * ������. ������������� ����������� ��������� ������� ���� ��������� ��� �����������.
 * ������ ������������ � ������� ��������. � ����� ���� ���������� �������� ������� �����
 * �� ������� ��� ����� ����������.
 */

//_� ����� Cubes �������� ����� main


package lesson8;
import java.util.Scanner;


public class Cubes {
	
	private static Scanner readThrow, readEnter;
	static int firstThrow;	//_� ��� ����� ������ ���
	
	static int userCount=1;	//_� ������� ����� ������������
	static int pcCount=1;	//_� ������� ����� ����������
	
	static int userSum=0;
	static int pcSum=0;
	
	static boolean rightSelect = false;
	
		
	public static void main(String[] args) {
		
		Throws selectThrow= new Throws();
				
		readThrow = new Scanner(System.in);
		
		//_� ��������, ��� ������ �����
		while (!rightSelect) {	//_� ����� ������� ������ 1.��� ��� ��� 2.��� ����������
			
			System.out.println("��������, ��� ������ ���: \n 1. ��� \n 2. ����������");
			firstThrow = readThrow.nextInt();
			
			switch (firstThrow) {
			
				case 1: selectThrow.gamerName = "user";	//_� ������� ����� - ������������
				rightSelect = true;
				break;
				
				case 2:	selectThrow.gamerName = "pc";		//_� ������� ����� - ���������
				rightSelect = true;
				break;
				
				default:
					System.out.println("����� ������� 1 ��� 2");
					rightSelect = false;
			}
		}

		readEnter = new Scanner(System.in);
		
		//_� ������ 5 ����� ��� ������� ������
		while (userCount<6 || pcCount<6) {
			
			if (selectThrow.gamerName=="user") {
			
				System.out.println("�������� ������ ! (������� Enter)");
				readEnter.nextLine();
				
				System.out.println("� ��� ������:");
				
				selectThrow.throwling();	//_� ���������� ���
				
				userSum += selectThrow.sum;
				System.out.println("����� ����� = " + userSum);
				
				userCount++;
				selectThrow.gamerName="pc";	//_� ����� ������
			}
			
			else if (selectThrow.gamerName=="pc") {
				
				System.out.println("� ���������� ������:");
				
				selectThrow.throwling();	//_� ���������� ���
				
				pcSum += selectThrow.sum;
				System.out.println("����� ����� = " + pcSum);
				
				pcCount++;
				selectThrow.gamerName="user";	//_� ����� ������
			}
		}
		
		System.out.println("������� ����� ����� ���������� = " + pcSum/5);
		System.out.println("������� ����� ����� ����� = " + userSum/5);
		
		if (userSum == pcSum) System.out.println("����� !");
		else if (userSum > pcSum) System.out.println("�� �������� !");
		else System.out.println("������� ��������� !");
		
		
	}

}
