package lesson15;

<<<<<<< HEAD
/* �������� ���������, ������� ������������ ���������� ������ ��� �������
 * � ����� ����� ��������� ������� �� ������ ������������.
 */

// ������ ���������� ������� - �������� �.
=======
/* Написать программу, которая осуществляет добавление строки или столбца
 * в любое место двумерной матрицы по выбору пользователя.
 */

// способ наполнение матрицы - Романуха А.
>>>>>>> c0ad407ecd83aa6bee2290b638c63333c0e9ee07
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
		
<<<<<<< HEAD
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
=======
		// размерновсть матрицы
		matrixLength = 8;
		
		// проверка правильности выбора направления (строка или столбец)
		correctDirection = false;
		
		// список insideList являет собой "строку" в матрице
		ArrayList<Character> insideList = new ArrayList();
				
		// список list являет собой "столбцы" в матрице - всю матрицу
		ArrayList<ArrayList<Character>> list = new ArrayList();
			
		// создаем строку-алфавит (набор символов)
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		
		// строка (или столбец) которую добавляем к матрице
		String phraze = "РОБОТА";
		
		
		// наполняем список insideList символами из строки phraze 
>>>>>>> c0ad407ecd83aa6bee2290b638c63333c0e9ee07
		for (char c : phraze.toCharArray()) {
			insideList.add(c);
		}	
		//System.out.println(insideList);				
		
		r = new Random();
		
<<<<<<< HEAD
		// ��������� ������� � �������
=======
		// наполняем матрицу и выводим
>>>>>>> c0ad407ecd83aa6bee2290b638c63333c0e9ee07
		for (int i=0; i<matrixLength; i++) {
			list.add(new ArrayList<Character>());
			for (int j=0; j<matrixLength; j++) {
				list.get(i).add(j, alphabet.charAt(r.nextInt(alphabet.length())));
			}
			System.out.print(list.get(i));
			System.out.println();
		}
				
		
<<<<<<< HEAD
		System.out.println("�������� ������: " + phraze);
		
		// ��������� ����������� ����������� ������
		while (! correctDirection) {
			System.out.println("��� ��������? "
					+ "\n 1. ������ (�������������)."
					+ "\n 2. ������� (�����������).");
=======
		System.out.println("Добавить строку: " + phraze);
		
		// считываем направление добавляемой строки
		while (! correctDirection) {
			System.out.println("Как добавить? "
					+ "\n 1. Строка (горизонтально)."
					+ "\n 2. Столбец (вертикально).");
>>>>>>> c0ad407ecd83aa6bee2290b638c63333c0e9ee07
			scanner = new Scanner(System.in);
			try {
				direction = scanner.nextInt();
				if (direction == 1 || direction == 2) {
					correctDirection = true;
				} else {
<<<<<<< HEAD
					System.out.println("������� 1 ��� 2"); 	
				}
			} catch (InputMismatchException e) {
				System.out.println("������� �����!");
			}
		}
		
		System.out.print("������� �������: ");
=======
					System.out.println("Введите 1 или 2"); 	
				}
			} catch (InputMismatchException e) {
				System.out.println("Введите число!");
			}
		}
		
		System.out.print("Введите позицию: ");
>>>>>>> c0ad407ecd83aa6bee2290b638c63333c0e9ee07
		scanner = new Scanner(System.in);
		position = scanner.nextInt();
		
		
<<<<<<< HEAD
		// ��������� ���������� ����������� ������
		switch (direction) {
		
		// ��������� ������
=======
		// обработка выбранного направления строки
		switch (direction) {
		
		// добавляем строку
>>>>>>> c0ad407ecd83aa6bee2290b638c63333c0e9ee07
		case 1: {
			list.add(position, insideList);
			break;
				}
		
<<<<<<< HEAD
		// ��������� �������
		case 2: {
			for (int i=0; i<list.size(); i++) {
				if (i < insideList.size()) {
					list.get(i).add(position, insideList.get(i)); 	// �������
=======
		// добавляем столбец
		case 2: {
			for (int i=0; i<list.size(); i++) {
				if (i < insideList.size()) {
					list.get(i).add(position, insideList.get(i)); 	// столбец
>>>>>>> c0ad407ecd83aa6bee2290b638c63333c0e9ee07
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
		
<<<<<<< HEAD
		// ����� �������� ������� � ���������� �������
=======
		// вывод итоговой матрицы с добавленой строкой
>>>>>>> c0ad407ecd83aa6bee2290b638c63333c0e9ee07
		for (int i=0; i<list.size(); i++) {
			System.out.print(list.get(i));
			System.out.println();
		}
		
		
	
		
		
	}

}
