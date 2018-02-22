package lesson12;

/*_а 2. Даны два массива, упорядоченных по возрастанию: А[n] и B[m]. Сформируйте массив C[n+m],
 *  состоящий из элементов массивов А и В, упорядоченный по возрастанию. 
 */

import java.util.ArrayList;
import java.util.Collections;

public class MergeArrays {

	public static void main(String[] args) {
	
		ArrayList <Integer> aList = new ArrayList <Integer>();
		ArrayList <Integer> bList = new ArrayList <Integer>(); 

		//_а Наполняем aList		
		aList.add(-15);
		aList.add(-8);
		aList.add(2);
		aList.add(10);
		aList.add(25);
		aList.add(40);
		aList.add(49);
		
		
		//_а Наполняем bList		
		bList.add(0);
		bList.add(2);
		bList.add(2);
		bList.add(5);
		bList.add(10);
		bList.add(14);
		bList.add(15);
		bList.add(17);
		bList.add(20);
		bList.add(27);
		bList.add(37);
		bList.add(52);
		
		//_а Показать спискы
		System.out.println(aList);
     		System.out.println("Количество элементов = " + aList.size());
		  
		System.out.println(bList);
		    System.out.println("Количество элементов = " + bList.size());	
		
		//_а Добавляем список bList к aList
		aList.addAll(bList);
				
		System.out.println();
		
		//_а Сортируем соединенный список
		Collections.sort(aList);
		System.out.println("Конечный список: \n" + aList);
		System.out.println("Количество элементов = " + aList.size());

		
	}

}
