/*_а Написать функцию, которая принимает в качестве параметров вещественное число
и количество знаков после десятичной точки, которые должны остаться. Задачей функции является
округление вышеуказанного вещественного числа с заданной точностью. 
*/

package lesson9;

import java.util.Scanner;

public class RoundMethod {
	
	private static Scanner readParams;
	static boolean correctNumber, correctDigits = false;	//_а Для проверки типа вводимых данных
	
	static double number;	//_а Вводимое число
	static int digits;	//_а Количество знаков после точки
	
	
	//_а Метод округления
	static void getRound(double number, int digits) {
		
		//_а Для округления уножаем и делим на у
		double y = Math.pow(10, digits);
		System.out.println("Умножаем на " + y);
		
		System.out.println("Округление умноженного числа: " + Math.round(number*y));
		double result = Math.round(number*y)/y;
				
		System.out.println(result);
		
	}

	public static void main(String[] args) {
		
		while (!correctNumber) {
			System.out.println("Введите вещественное число: ");	
			readParams = new Scanner(System.in);	
			
			//_а Проверка типа вводимых данных - тип данных Double
			if (readParams.hasNextDouble()) {
				correctNumber = true;
				number = readParams.nextDouble();
										
				//_а Повтор запроса ввода ==Количества Знаков== при неправильном формате
				while (!correctDigits) {
					System.out.println("Введите количество знаков после точки: ");	
					readParams = new Scanner(System.in);	
					
					//_а Проверка типа вводимых данных - тип данных iNTEGER
					if (readParams.hasNextInt()) {
						correctDigits = true;
						digits = readParams.nextInt();
													
					} else {
						System.out.println("Неверно указано количество знаков");
						correctDigits = false;
					}
				}

				
			} else {
				System.out.println("Неверный формат числа!");
				correctNumber = false;
			}
		}
			
			//_а Собственно вызов метода для округления
			getRound(number, digits);
				
		
	}

}
