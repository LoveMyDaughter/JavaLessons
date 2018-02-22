package lesson13;

/*_а Написать примитивный калькулятор.
 Использовать Generic, ввод чисел с консоли, обработку try-catch
 Числа должны быть объектами
*/

import java.util.Scanner;

//_а Используем Generic для класса
public class Calc <T> {

	private static Scanner readNumber;
	
	//_а Числа, которые вводит пользователь с консоли
	private static String firstNumber, secondNumber, operation;
	
	//_а переменные любого типа
	private T value1, value2;
	
	//_а Геттер первого числа (или не числа)
	public T getValue1() {
		return value1;
	}
	
	//_а Геттер второго числа (или не числа)
	public T getValue2() {
		return value2;
	}
	
	//_а Сеттер для присвоения введенных даных переменным value1 и value2
	public void setValue(T val1, T val2) {
		value1 = val1;
		value2 = val2;
		
		
	}
	
	public static void main(String[] args) {
		
		readNumber = new Scanner(System.in);
		
		System.out.print("Введите Первое число : ");
		firstNumber = readNumber.nextLine();
		
		System.out.print("Введите Второе число : ");
		secondNumber = readNumber.nextLine();
		
		System.out.println("Выберите операцию: \n 1. + \n 2. - \n 3. *  \n 4. /");
		operation = readNumber.nextLine();
		
		//_а Экземпляр класса Sum типа Double 
		Sum <Double> doubleInstance = new Sum();
					
				
		try {
			
			//_а Если введенное с консоли - числа
			//_а переводим их в тип Double
			doubleInstance.setValue(Double.parseDouble(firstNumber), Double.parseDouble(secondNumber));
			
			//System.out.println(doubleInstance.getValue1());
			//System.out.println(doubleInstance.getValue2());
			
			//_а Обработка действий в зависимости от операции
			switch (operation) {
			
				case "1": {
					System.out.println("Сумма чисел = " + (double)(doubleInstance.getValue1()+doubleInstance.getValue2()));
					break;
					
				}
				
				case "2": {
					System.out.println("Вычитание чисел = " + (double)(doubleInstance.getValue1()-doubleInstance.getValue2()));
					break;
				}
				
				case "3": {
					System.out.println("Умножение чисел = " + (double)(doubleInstance.getValue1()*doubleInstance.getValue2()));
					break;
				}
				
				case "4": {
					System.out.println("Деление чисел = " + (double)(doubleInstance.getValue1()/doubleInstance.getValue2()));
					break;
				}
				
				default: {
					System.out.println("Неверно выбрана операция!");
					break;
				}
			
			}
			
		
		} catch (Exception e) {
			System.out.print("Один или два элемента не являются числами: ");
			System.out.println(firstNumber + " " + secondNumber);
			
		}
		

	}

}
