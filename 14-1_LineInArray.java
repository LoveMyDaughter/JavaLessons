package lesson14;

/*_а Пользователь вводит строку с клавиатуры в фиксированный массив. Необходимо проверить,
 * cколько элементов массива теперь занято, сколько свободно и сколько всего вообще.
 */

import java.util.Scanner;

public class LineInArray {

	private static Scanner scanner;

	public static void main(String[] args) {

		scanner = new Scanner(System.in);
		
		//_а Изначальный фиксированный массив
		char [] defaultArray = new char [20]; 
		System.out.println("Длина фиксированного массива = " + defaultArray.length);
		
		System.out.println();
							
		System.out.print("Введите строку: ");
		
		//_а Строка, введенная пользователем
		String phraze = scanner.nextLine();
		
		System.out.println();
		
		//_а Количество символов введенной строки
		int phrazeLength = phraze.length();
		//System.out.println("Количество символов = " + phraze.length());

		
		//_а Проверяем, помещается ли введенная строка в фиксированный массив
		if (phrazeLength > defaultArray.length) {
			System.out.println("Введенная строка не помещается в массив!");
			System.exit(0);
			
		} else {
			//_а Перевод строки в массив char[]
			char [] inputArray = phraze.toCharArray();
			
			//_а Перенос элементов из введенного массива - в начальный 
			for (int i=0; i<inputArray.length; i++) {
				defaultArray[i] = inputArray[i]; 
			}
			
			//_а Вывоод количества элементов
			System.out.println("Занято элементов массива = " + inputArray.length);
			System.out.println("Свободных элемнетов = " + (defaultArray.length - inputArray.length));
			System.out.println("Всех элементов вообще = " + defaultArray.length);
			
		}
		
			
	}

}
