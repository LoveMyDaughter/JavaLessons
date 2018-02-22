package lesson15;

/* ���� ������� ������� MxN (M �����, N ��������). ���������� ��������� �� ���������� � �������� �������,
 *  �������������� ����������� ����� ����� �/��� �������� ������� ��������� ���������� ��� 
 *  � � ��������� �������.
*/
// ���������� ������� - ��������� ����� �����
// ����� ������� - ��������� ����� �����


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;

import java.util.Scanner;

public class Move2 {

	// ����������� �������
	private static int m, n;
	
	private static int direction;
	
	// ���-�� �������
	private static int quantity;
	
	private static boolean correctDirection, correctQuantity;
	
	// ������� ������-������� (����� ��������)
	private static String alphabet = "abcdefghijklmnopqrstuvwxyz";
	
	// ����� ������ ����� ��� ������� ���������� ������ �������� �� ������-��������
	private static int length = alphabet.length();
	
	private static Random r;
	private static Scanner scanner;
	
	// ������ list ������ ����� �������
	private static ArrayList <ArrayList<Character>> list;
	
	// ����� - ��������� �������
	public static void fill (ArrayList <ArrayList<Character>> list) {
		for (int i=0; i<m; i++) {
			list.add(new ArrayList<Character>());
			for (int j=0; j<n; j++) {
				list.get(i).add(j, alphabet.charAt(r.nextInt(length)));
			}			
		}
	}
	
	// ����� - ����� �������
	public static void showMatrix(ArrayList <ArrayList<Character>> list) {
		for (ArrayList<Character> e : list) {			
			System.out.print(e + "\n");			
		}
	}
	
	// ����� - ���������� ������ (����� ����)
	public static void insertLine(ArrayList <ArrayList<Character>> list) {
		list.add(0, new ArrayList<Character>());
	}
	
	// ����� - �������� ������ (����� �����)
	public static void deleteLine(ArrayList <ArrayList<Character>> list) {
		list.remove(0);
	}
		
	// ����� - ���������� ������� (����� ������)
	public static void insertColumn(ArrayList <ArrayList<Character>> list) {
		for (ArrayList<Character> element : list) {
			element.add(0, ' ');
		}
	}
	
	// ����� - �������� ������� (����� �����)
	public static void deleteColumn(ArrayList <ArrayList<Character>> list) {
		for (ArrayList<Character> element : list) {
			element.remove(0);
		}
	}
	
	
	public static void main(String[] args) {
		
		m = 4;	// �����
		n = 7;	// ��������		
		r = new Random();	
		
		list = new ArrayList();
		
		// ��������� �������
		fill(list);
		
		// ������� �������
		System.out.println("�������:");
		showMatrix(list);
		System.out.println();
				
		// ��������� ����������� ����������� ������
		while (! correctDirection) {
			System.out.println("���� ��������?"
					+ "\n 1. ����� (������� ������)."
					+ "\n 2. ���� (�������� ������)."
					+ "\n 3. ����� (������� �������)."
					+ "\n 4. ������ (�������� �������).");
			scanner = new Scanner(System.in);
			try {
				direction = scanner.nextInt();
				if (direction == 1 || direction == 2 ||
					direction == 3 || direction == 4) {
					correctDirection = true;
				} else {
					System.out.println("������� �� 1 �� 4"); 	
				}
			} catch (InputMismatchException e) {
				System.out.println("������� �����!");
			}
		}
		
		// ����������� ���������� �������
		while (! correctQuantity) {
			System.out.println("������� ���?");
			scanner = new Scanner(System.in);
			try {
				quantity = scanner.nextInt();
				if (quantity > 0) {
					// ���������� ����� ����� ����������� �����
					if (direction == 1) {
						if ( quantity <= list.size()) {
							correctQuantity = true;
						} else {
						System.out.println("������� �� 1 �� " + list.size());
						continue;
							}
					}	
					// ���������� ����� ����� ����������� ��������
					if (direction == 3) {
						if (quantity <= list.get(0).size()) {
							correctQuantity = true;
						} else {
							System.out.println("������� �� 1 �� " + list.get(0).size());
							continue;
							}	
					}	
					correctQuantity = true;
				}					
			} catch (InputMismatchException e) {
				System.out.println("������� ����������� �����!");
			}
		}
		
		// ��������� ������� � ����������� �� ���������� �����������
		switch (direction) {				
			// ����� �����
			case 1: {
				for (int i=0; i<quantity; i++) {
					System.out.println("����� ����� - " + (i+1));
					deleteLine(list);
					showMatrix(list);
					System.out.println();
				}
				break;
			}				
			// ����� ����
			case 2: {
				for (int i=0; i<quantity; i++) {
					System.out.println("����� ���� - " + (i+1));
					insertLine(list);
					showMatrix(list);
					System.out.println();
				}
				break;
			}			
			// ����� ����� 
			case 3: {
				for (int i=0; i<quantity; i++) {
					System.out.println("����� ����� - " + (i+1));
					deleteColumn(list);
					showMatrix(list);
					System.out.println();
				}
				break;
			}			
			// ����� ������ 
			case 4: {
				for (int i=0; i<quantity; i++) {
					System.out.println("����� ������ - " + (i+1));
					insertColumn(list);
					showMatrix(list);
					System.out.println();
				}
				break;
			}			
			default : {
				break;
			}					
		}
		
	}

}
