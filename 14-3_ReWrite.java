package lesson14;

//_а Удалить с m по n символов, перезаписать строку и показать ее на экран.

import java.util.Scanner;
 
public class ReWrite {
	
	private static Scanner scanner;
	private static int m,n;

	public static void main(String[] args) {

		//_а Изначальная строка
		String string = "Я регулярно изучаю язык Java";
				
		//_а Строка, в которую будем перезаписывать
		String result = "";
		
		System.out.println(string);

		scanner = new Scanner(System.in);
		
		
		try {
			System.out.print("Введите номер первого символа: ");
			
			//_а Начальный символ - m
			m = scanner.nextInt();
					
			System.out.print("Введите номер последнего символа: ");
		
			//_а последний символ - n
			n = scanner.nextInt();
			
			
			//_а Проверка коректности m и n
			if ( (m >=0) & (m <= string.length()) ) {
				if ( (n >= m) & (n <= string.length()) ) {
					
					//_а Перезапись строки
					for (int i=0; i<string.length(); i++) {
						if ( (i>=0 & i<m) || (i>n & i<string.length()) )
							result += string.charAt(i);
					}
					
					//_а Вывод результирующей строки
					System.out.println(result);
					
				} else {
					System.out.println("Номер последнего символа выходит за допустимый диапазон.");
				}
			} else {
				System.out.println("Номер первого символа выходит за диапазон строки.");
			}
			
			//
				
		} catch (java.util.InputMismatchException e) {
			System.out.println("Неверный формат!");
			System.exit(0);
		}
		
	}

}
