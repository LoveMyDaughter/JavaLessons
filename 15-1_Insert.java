package lesson15;

/* �������� ���������, ������� ������������ ���������� ������ ��� �������
 * � ����� ����� ��������� ������� �� ������ ������������.
 */

// ������ ���������� ������� - �������� �.
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Insert {

	private static Scanner scanner;
	private static int direction, position, matrixLength;
	private static Random r;
	private static boolean correctDirection;
	
	public static void main(String[] args) {
		
		// ������������ �������
		matrixLength = 8;
		
		// �������� ������������ ������ ����������� (������ ��� �������)
		correctDirection = false;
		
		// ������ insideList ������ ����� "������" � �������
		ArrayList<Character> insideList = new ArrayList();
				
		// ������ list ������ ����� "�������" � ������� - ��� �������
		ArrayList<ArrayList<Character>> list = new ArrayList();
			
		// ������� ������-������� (����� ��������)
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		
		// ������ (��� �������) ������� ��������� � �������
		String phraze = "������";
		
		
		// ��������� ������ insideList ��������� �� ������ phraze 
		for (char c : phraze.toCharArray()) {
			insideList.add(c);
		}	
		//System.out.println(insideList);				
		
		r = new Random();
		
		// ��������� ������� � �������
		for (int i=0; i<matrixLength; i++) {
			list.add(new ArrayList<Character>());
			for (int j=0; j<matrixLength; j++) {
				list.get(i).add(j, alphabet.charAt(r.nextInt(alphabet.length())));
			}
			System.out.print(list.get(i));
			System.out.println();
		}
				
		
		System.out.println("�������� ������: " + phraze);
		
		// ��������� ����������� ����������� ������
		while (! correctDirection) {
			System.out.println("��� ��������? "
					+ "\n 1. ������ (�������������)."
					+ "\n 2. ������� (�����������).");
			scanner = new Scanner(System.in);
			try {
				direction = scanner.nextInt();
				if (direction == 1 || direction == 2) {
					correctDirection = true;
				} else {
					System.out.println("������� 1 ��� 2"); 	
				}
			} catch (InputMismatchException e) {
				System.out.println("������� �����!");
			}
		}
		
		System.out.print("������� �������: ");
		scanner = new Scanner(System.in);
		position = scanner.nextInt();
		
		
		// ��������� ���������� ����������� ������
		switch (direction) {
		
		// ��������� ������
		case 1: {
			list.add(position, insideList);
			break;
				}
		
		// ��������� �������
		case 2: {
			for (int i=0; i<list.size(); i++) {
				if (i < insideList.size()) {
					list.get(i).add(position, insideList.get(i)); 	// �������
				} else {
					list.get(i).add(position, ' ');
				}
					
				
			}
			break;
				}
		default : {
			break;
		}
			
		}
		
		// ����� �������� ������� � ���������� �������
		for (int i=0; i<list.size(); i++) {
			System.out.print(list.get(i));
			System.out.println();
		}
		
		
	
		
		
	}

}
