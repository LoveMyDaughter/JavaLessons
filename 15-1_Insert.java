package lesson15;

<<<<<<< HEAD
/* Написать программу, которая осуществляет добавление строки или столбца
 * в любое место двумерной матрицы по выбору пользователя.
 */

// способ наполнение матрицы - Романуха А.
=======
/* РќР°РїРёСЃР°С‚СЊ РїСЂРѕРіСЂР°РјРјСѓ, РєРѕС‚РѕСЂР°СЏ РѕСЃСѓС‰РµСЃС‚РІР»СЏРµС‚ РґРѕР±Р°РІР»РµРЅРёРµ СЃС‚СЂРѕРєРё РёР»Рё СЃС‚РѕР»Р±С†Р°
 * РІ Р»СЋР±РѕРµ РјРµСЃС‚Рѕ РґРІСѓРјРµСЂРЅРѕР№ РјР°С‚СЂРёС†С‹ РїРѕ РІС‹Р±РѕСЂСѓ РїРѕР»СЊР·РѕРІР°С‚РµР»СЏ.
 */

// СЃРїРѕСЃРѕР± РЅР°РїРѕР»РЅРµРЅРёРµ РјР°С‚СЂРёС†С‹ - Р РѕРјР°РЅСѓС…Р° Рђ.
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
=======
		// СЂР°Р·РјРµСЂРЅРѕРІСЃС‚СЊ РјР°С‚СЂРёС†С‹
		matrixLength = 8;
		
		// РїСЂРѕРІРµСЂРєР° РїСЂР°РІРёР»СЊРЅРѕСЃС‚Рё РІС‹Р±РѕСЂР° РЅР°РїСЂР°РІР»РµРЅРёСЏ (СЃС‚СЂРѕРєР° РёР»Рё СЃС‚РѕР»Р±РµС†)
		correctDirection = false;
		
		// СЃРїРёСЃРѕРє insideList СЏРІР»СЏРµС‚ СЃРѕР±РѕР№ "СЃС‚СЂРѕРєСѓ" РІ РјР°С‚СЂРёС†Рµ
		ArrayList<Character> insideList = new ArrayList();
				
		// СЃРїРёСЃРѕРє list СЏРІР»СЏРµС‚ СЃРѕР±РѕР№ "СЃС‚РѕР»Р±С†С‹" РІ РјР°С‚СЂРёС†Рµ - РІСЃСЋ РјР°С‚СЂРёС†Сѓ
		ArrayList<ArrayList<Character>> list = new ArrayList();
			
		// СЃРѕР·РґР°РµРј СЃС‚СЂРѕРєСѓ-Р°Р»С„Р°РІРёС‚ (РЅР°Р±РѕСЂ СЃРёРјРІРѕР»РѕРІ)
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		
		// СЃС‚СЂРѕРєР° (РёР»Рё СЃС‚РѕР»Р±РµС†) РєРѕС‚РѕСЂСѓСЋ РґРѕР±Р°РІР»СЏРµРј Рє РјР°С‚СЂРёС†Рµ
		String phraze = "Р РћР‘РћРўРђ";
		
		
		// РЅР°РїРѕР»РЅСЏРµРј СЃРїРёСЃРѕРє insideList СЃРёРјРІРѕР»Р°РјРё РёР· СЃС‚СЂРѕРєРё phraze 
>>>>>>> c0ad407ecd83aa6bee2290b638c63333c0e9ee07
		for (char c : phraze.toCharArray()) {
			insideList.add(c);
		}	
		//System.out.println(insideList);				
		
		r = new Random();
		
<<<<<<< HEAD
		// наполняем матрицу и выводим
=======
		// РЅР°РїРѕР»РЅСЏРµРј РјР°С‚СЂРёС†Сѓ Рё РІС‹РІРѕРґРёРј
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
		System.out.println("Добавить строку: " + phraze);
		
		// считываем направление добавляемой строки
		while (! correctDirection) {
			System.out.println("Как добавить? "
					+ "\n 1. Строка (горизонтально)."
					+ "\n 2. Столбец (вертикально).");
=======
		System.out.println("Р”РѕР±Р°РІРёС‚СЊ СЃС‚СЂРѕРєСѓ: " + phraze);
		
		// СЃС‡РёС‚С‹РІР°РµРј РЅР°РїСЂР°РІР»РµРЅРёРµ РґРѕР±Р°РІР»СЏРµРјРѕР№ СЃС‚СЂРѕРєРё
		while (! correctDirection) {
			System.out.println("РљР°Рє РґРѕР±Р°РІРёС‚СЊ? "
					+ "\n 1. РЎС‚СЂРѕРєР° (РіРѕСЂРёР·РѕРЅС‚Р°Р»СЊРЅРѕ)."
					+ "\n 2. РЎС‚РѕР»Р±РµС† (РІРµСЂС‚РёРєР°Р»СЊРЅРѕ).");
>>>>>>> c0ad407ecd83aa6bee2290b638c63333c0e9ee07
			scanner = new Scanner(System.in);
			try {
				direction = scanner.nextInt();
				if (direction == 1 || direction == 2) {
					correctDirection = true;
				} else {
<<<<<<< HEAD
					System.out.println("Введите 1 или 2"); 	
				}
			} catch (InputMismatchException e) {
				System.out.println("Введите число!");
			}
		}
		
		System.out.print("Введите позицию: ");
=======
					System.out.println("Р’РІРµРґРёС‚Рµ 1 РёР»Рё 2"); 	
				}
			} catch (InputMismatchException e) {
				System.out.println("Р’РІРµРґРёС‚Рµ С‡РёСЃР»Рѕ!");
			}
		}
		
		System.out.print("Р’РІРµРґРёС‚Рµ РїРѕР·РёС†РёСЋ: ");
>>>>>>> c0ad407ecd83aa6bee2290b638c63333c0e9ee07
		scanner = new Scanner(System.in);
		position = scanner.nextInt();
		
		
<<<<<<< HEAD
		// обработка выбранного направления строки
		switch (direction) {
		
		// добавляем строку
=======
		// РѕР±СЂР°Р±РѕС‚РєР° РІС‹Р±СЂР°РЅРЅРѕРіРѕ РЅР°РїСЂР°РІР»РµРЅРёСЏ СЃС‚СЂРѕРєРё
		switch (direction) {
		
		// РґРѕР±Р°РІР»СЏРµРј СЃС‚СЂРѕРєСѓ
>>>>>>> c0ad407ecd83aa6bee2290b638c63333c0e9ee07
		case 1: {
			list.add(position, insideList);
			break;
				}
		
<<<<<<< HEAD
		// добавляем столбец
		case 2: {
			for (int i=0; i<list.size(); i++) {
				if (i < insideList.size()) {
					list.get(i).add(position, insideList.get(i)); 	// столбец
=======
		// РґРѕР±Р°РІР»СЏРµРј СЃС‚РѕР»Р±РµС†
		case 2: {
			for (int i=0; i<list.size(); i++) {
				if (i < insideList.size()) {
					list.get(i).add(position, insideList.get(i)); 	// СЃС‚РѕР»Р±РµС†
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
		// вывод итоговой матрицы с добавленой строкой
=======
		// РІС‹РІРѕРґ РёС‚РѕРіРѕРІРѕР№ РјР°С‚СЂРёС†С‹ СЃ РґРѕР±Р°РІР»РµРЅРѕР№ СЃС‚СЂРѕРєРѕР№
>>>>>>> c0ad407ecd83aa6bee2290b638c63333c0e9ee07
		for (int i=0; i<list.size(); i++) {
			System.out.print(list.get(i));
			System.out.println();
		}
		
		
	
		
		
	}

}
