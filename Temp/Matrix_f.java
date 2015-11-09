//_а Дана квадратная матрица порядка n (n строк, n столбцов). Найти наибольшее из значений элементов,
//_а расположенных в тёмно-синих частях матриц.
//_а Рисунок е)

package Lesson7;

import java.util.Random;

public class Matrix_f {

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
				
		int maxLeft = matrixArray[0][0];
		
		//_а Находим максимальное значение Левого треугольника
		for (int x=0; x<n; x++) {
			for (int y=x; y<=(n-1)-x; y++ ) {
			
			if (matrixArray[y][x] > maxLeft) {
				maxLeft = matrixArray[y][x];
			}
		} 
	}
		int max = maxLeft;
		
		int maxRight = matrixArray[n-1][n-1];
		
		//_а Находим максимальное значение Правого треугольника
		for (int x=n-1; x>=0; x--) {
			for (int y=x; y>=(n-1)-x; y-- ) {
				
				if (matrixArray[y][x] > maxRight) {
					maxRight = matrixArray[y][x];
				}
			} 
		}		
		
		if (maxRight > maxLeft) max = maxRight; 
		
		System.out.println("Максимальное значение= " + max);

	}

}
