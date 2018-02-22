package lesson14;

/* Пользователь вводит отдельно строку и символ, необходимо показать на экран номер
 *  по порядку только последнего совпадения (нумерация с единицы).
 */
import java.util.Scanner;

public class LastSymbolInLine {

	private static Scanner scanner;
	private static String phraze, symbol;
	private static boolean matches;
	private static int lastMatch;
	
	public static void main(String[] args) {

		scanner = new Scanner(System.in);
		
		// изначально допускаем, что совпадений не будет
		matches = false;
		
		System.out.print("Введите строку: ");
		
		// Строка, введенная пользователем
		phraze = scanner.nextLine();
		
		System.out.print("Введите символ: ");
		
		// Символ, введенный пользователем (может быть строкой)
		symbol = scanner.next();
		
		// если введен именно символ (1 знак)
		if (symbol.length()==1) {
		
			// проверка совпадения
			for (int i=0; i<phraze.length(); i++) {
				if (phraze.charAt(i) == symbol.charAt(0)) {
					lastMatch = i+1;
					matches = true;
				}
			}
		} else {
			System.out.println("Вы ввели не символ!");
		}
		
		if (!matches) {
			System.out.println("Совпадений нет.");
		} else {
			System.out.println("Последнее совпадение: " + lastMatch);
		}
		

	}

}
