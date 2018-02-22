//_а Дан массив чисел размерностью 10 элементов. Написать функцию, которая сортирует массив
// по возрастанию или по убыванию, в зависимости от третьего параметра функции. Если он равен 1,
//сортировка идет по убыванию, если 0, то по возрастанию. Первые 2 параметра функции - это массив
//и его размер, третий параметр по умолчанию равен 1. 


package lesson10;

public class SortArrayOf10 {
		
        //_а Метод сортировка
		public static<T> void sortArray(T [] array, int sizeOfArray, int param) {
								
			int length = sizeOfArray;	//_а Длина массива задается при вызове метода
			
			//_а Создаем массив типа Double, в котором будем производить сортировку
			Double[] doubleArray = new Double[length];	
			
			for (int i=0; i<length; i++) {
				
				//_а Наполняем массив Double елементами входного массива
				doubleArray[i] = Double.parseDouble(array[i].toString());
				
				//System.out.print(doubleArray[i] + " ");
			}
			
			//_а Сортировка
			for (int i=0; i<length; i++) {
				
				int k = i;
				double x = doubleArray[i];
				
				for (int j=i+1; j<length; j++) {
					
					//_а Выбор направления сортировки в зависимости от ==param==
					switch (param) {
					
						case 0:
							if (doubleArray[j] < x) {
								k = j;
								x = doubleArray[j];
								doubleArray[k] = doubleArray[i];
								doubleArray[i]  =  x;
							}
							break;
							
						case 1:
							if (doubleArray[j] > x) {
								k = j;
								x = doubleArray[j];
								doubleArray[k] = doubleArray[i];
								doubleArray[i]  =  x;
							}	
							break;
					}	
				}
				
				//System.out.print(x + " ");	//_а Вывод элементов отсортированного массива
				
				//_а Переводим выходной массив в нужный тип (как входящий)
				//_а и выводим элементы отсортированного массива
				if (array instanceof Integer[]) System.out.print((int)x + " ");
				if (array instanceof Byte[]) System.out.print((byte)x + " ");
				if (array instanceof Double[]) System.out.print(x + " "); 
				if (array instanceof Long[]) System.out.print((long)x + " ");
				if (array instanceof Short[]) System.out.print((short)x + " ");
				
			}	
		
		System.out.println("");
	}
	
	public static void main(String[] args) {
		
		//_а Массив Integer
		Integer[] intArray = {1, 1, 100, -2, 17, 8, 32, -15, 3, 66};	
			
		//_а Массив Byte
		Byte[] byteArray = {2, 3, 0, -3, 8, 8, 0, -5, 12, 27, -40, 65, 33, 2};
			
		//_а Массив Double
		Double[] doubleArray = {2.21, 0.123, 271.44, -71.4, -21.98675, 43.98, 12890.44, -34.0, 30.12};
			
		//_а Массив Long
		Long[] longArray = {-21800L, 12976L, -12345L, 3400L, 8790L, 12599L, 690211L, -2340L, 20535L};
		
		//_а Массив Short
		Short[] shortArray = {-10000, -2010, 7342, -390, 0, 680, - 23, 40, 2200, 555};	
			
		
		//_а Вызов методов с параметрами 
		sortArray(intArray, 7, 0);
		sortArray(byteArray, 4, 0);
		sortArray(doubleArray, 9, 0);
		sortArray(longArray, 5, 1);
		sortArray(shortArray, 10, 1);
		

	}

}
