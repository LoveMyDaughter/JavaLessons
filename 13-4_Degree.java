package lesson13;

/*_а Найти заданную степень числа.
Использовать Generic, ввод чисел с консоли, обработку try-catch
Числа должны быть объектами
*/

//_а Для простоты будем использовать только целые числа

import java.util.Scanner;

public class Degree <T> {

	private Scanner readNumber, readDegree;
	private String inputNumber, inputDegree;
	
	//_а Число - number, Степень - degree, число в степени - result
	private Integer number, degree, result;
	
	public static void main(String[] args) {
				
		//_а Экземпляры класса Factorial 
		//_а Создавая экземпляры, можем отслеживать значения переменных в отладчике
		Degree <String> stringDegree = new Degree();
		Degree <Scanner> scannerDegree = new Degree();
		Degree <Integer> integerDegree = new Degree();
					
		scannerDegree.readNumber = new Scanner(System.in);
		scannerDegree.readDegree = new Scanner(System.in);
		
		System.out.println("Введите число : ");
		stringDegree.inputNumber = scannerDegree.readNumber.nextLine();
		
		System.out.println("Введите степень : ");
		stringDegree.inputDegree = scannerDegree.readDegree.nextLine();
		
					
		//_а //_а Если введенное с консоли - число
		//_а переводим его в тип int
		try {
			integerDegree.number = Integer.parseInt(stringDegree.inputNumber);
			integerDegree.degree = Integer.parseInt(stringDegree.inputDegree);
			 
			//_а Вычисление результата
			integerDegree.result = integerDegree.number;
			for (int i=1; i<integerDegree.degree; i++) {
				integerDegree.result *= integerDegree.number;
			}
			
			System.out.println(integerDegree.result.intValue());
				
		} catch (NumberFormatException e) {
			System.out.println("Неверный формат числа или степени!");
		}
		
	}

}
