//_а Находим количество элементов == 0 в двумерном масиве 3х4
package Lesson7;

import java.util.Random;

public class ZeroElements {

	public static void main(String[] args) {

		Integer[][] randomArray = new Integer[3][4];
		Random random = new Random();
		int count = 0;
		
		for (int i=0; i<3; i++) {
			for (int j=0; j<4; j++) {
				randomArray[i][j] = random.nextInt(10);	//_а Присваиваем каждому элементу случайное число
				System.out.print(randomArray[i][j] + " ");	//_а Выводим строку
				if (randomArray[i][j] == 0) count++;
			} System.out.println();	//_а Перевод каретки на новую строку для наглядности 
		}
		System.out.println("Количество элементов равных нулю: " + count);

	}

}
