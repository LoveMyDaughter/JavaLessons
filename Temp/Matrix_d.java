//_а Дана квадратная матрица порядка n (n строк, n столбцов). Найти наибольшее из значений элементов,
//_а расположенных в тёмно-синих частях матриц.
//_а Рисунок г)

package Lesson7;

import java.util.Random;

public class Matrix_d {

	public static void main(String[] args) {

		int n=8;	//_а Количество строк и столбцов
		Integer[][] matrixArray = new Integer[n][n];
		Random random = new Random();
		
		//_а Показываем на екран массив для наглядности
			for (int y=0; y<n; y++) {
				for (int x=0; x<n; x++) {
					matrixArray[y][x] = random.nextInt(100);	//_а Присваиваем каждому элементу случайное число
					System.out.printf("%02d",matrixArray[y][x]);	//_а Выводим строку (все числа 2-цифровые для выравнивания)
					System.out.printf(" ");	//_а Пробел между столбцами
				} System.out.println();	//_а Перевод каретки на новую строку для наглядности
			}	
		//
				
		int max = matrixArray[n-1][n-1];
		
		//_а Находим максимальное значение
		for (int y=(n-1); y>=0; y--) {
			for (int x=y; x>=(n-y)-1; x--) {
				
				if (matrixArray[y][x] > max) {
					max = matrixArray[y][x];
				}
			} 
		}
		System.out.println("Максимальное значение= " + max);

	}

}
