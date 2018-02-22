package lesson12;

//_а Дан массив целых чисел. Поменяйте местами элементы массива с четными и нечетными индексами
//   (т.е. те элементы массива, которые стоят на четных местах, поменяйте с элементами, которые
//   стоят на нечетных местах). 
//_а Делаем через ArrayList

import java.util.ArrayList;

public class EvenOddChange {

	public static void main(String[] args) {
		 
		ArrayList <Integer> aList = new ArrayList <Integer>(); 

		//_а Наполняем ArrayList		
		aList.add(7);
		aList.add(-8);
		aList.add(2);
		aList.add(5);
		aList.add(10);
		aList.add(-4);
		aList.add(-5);
		aList.add(1);
		aList.add(0);
		aList.add(17);
		aList.add(-77);
	//	aList.add(12);
		
		//_а Показать массив
		System.out.println(aList);
		
		//_а Длина массива
		//System.out.println("Длина массива = " + aList.size());
		
		
		//_а Здесь перебор идет до предпоследнего (i<aList.size()-1) элемента на случай,
		//   если последний с нечетным индексом
		for (int i =0; i<aList.size()-1; i++) {
			if (i%2==0) {
				
				//_а Меняем местами четный в нечетным элементы
				int x = aList.get(i);
				aList.set(i, aList.get(i+1));
				aList.set(i+1, x);
				
			} 
		}
				
		System.out.println(aList);
		
	}

}
