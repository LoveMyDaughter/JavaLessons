package lesson14;

/* ��������� - ������ ������� � ������
 * ������������ ������ �������� ������ � ������, ���������� �������� �� ����� ������ �� �������
 *  ���� ���������� (��������� � �������).
 */
import java.util.Scanner;

public class SymbolInLine {

	private static Scanner scanner;
	private static String phraze, symbol;
	private static boolean matches;
	
	public static void main(String[] args) {

		scanner = new Scanner(System.in);
		
		// ���������� ���������, ��� ���������� �� �����
		matches = false;
		
		System.out.print("������� ������: ");
		
		// ������, ��������� �������������
		phraze = scanner.nextLine();
		
		System.out.print("������� ������: ");
		
		// ������, ��������� ������������� (����� ���� �������)
		symbol = scanner.next();
		
		// ���� ������ ������ ������ (1 ����)
		if (symbol.length()==1) {
		
			// �������� ����������
			for (int i=0; i<phraze.length(); i++) {
				if (phraze.charAt(i) == symbol.charAt(0)) {
					System.out.println(i+1);
					matches = true;
				}
			}
		} else {
			System.out.println("�� ����� �� ������!");
			matches = true;
		}
		
		if (!matches) {
			System.out.println("���������� ���.");
		}
		

	}

}
