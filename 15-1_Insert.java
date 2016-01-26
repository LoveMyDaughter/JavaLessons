package lesson15;

/* Написать программу, которая осуществляет добавление строки или столбца
 * в любое место двумерной матрицы по выбору пользователя.
 */

// способ наполнение матрицы - Романуха А.
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
		for (char c : phraze.toCharArray()) {
			insideList.add(c);
		}	
		//System.out.println(insideList);				
		
		r = new Random();
		
		// наполняем матрицу и выводим
		for (int i=0; i<matrixLength; i++) {
			list.add(new ArrayList<Character>());
			for (int j=0; j<matrixLength; j++) {
				list.get(i).add(j, alphabet.charAt(r.nextInt(alphabet.length())));
			}
			System.out.print(list.get(i));
			System.out.println();
		}
				
		
		System.out.println("Добавить строку: " + phraze);
		
		// считываем направление добавляемой строки
		while (! correctDirection) {
			System.out.println("Как добавить? "
					+ "\n 1. Строка (горизонтально)."
					+ "\n 2. Столбец (вертикально).");
			scanner = new Scanner(System.in);
			try {
				direction = scanner.nextInt();
				if (direction == 1 || direction == 2) {
					correctDirection = true;
				} else {
					System.out.println("Введите 1 или 2"); 	
				}
			} catch (InputMismatchException e) {
				System.out.println("Введите число!");
			}
		}
		
		System.out.print("Введите позицию: ");
		scanner = new Scanner(System.in);
		position = scanner.nextInt();
		
		
		// обработка выбранного направления строки
		switch (direction) {
		
		// добавляем строку
		case 1: {
			list.add(position, insideList);
			break;
				}
		
		// добавляем столбец
		case 2: {
			for (int i=0; i<list.size(); i++) {
				if (i < insideList.size()) {
					list.get(i).add(position, insideList.get(i)); 	// столбец
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
		
		// вывод итоговой матрицы с добавленой строкой
		for (int i=0; i<list.size(); i++) {
			System.out.print(list.get(i));
			System.out.println();
		}
		
		
	
		
		
	}

}
