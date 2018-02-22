package lesson12;

/*_� 2. ���� ��� �������, ������������� �� �����������: �[n] � B[m]. ����������� ������ C[n+m],
 *  ��������� �� ��������� �������� � � �, ������������� �� �����������. 
 */

import java.util.ArrayList;
import java.util.Collections;

public class MergeArrays {

	public static void main(String[] args) {
	
		ArrayList <Integer> aList = new ArrayList <Integer>();
		ArrayList <Integer> bList = new ArrayList <Integer>(); 

		//_� ��������� aList		
		aList.add(-15);
		aList.add(-8);
		aList.add(2);
		aList.add(10);
		aList.add(25);
		aList.add(40);
		aList.add(49);
		
		
		//_� ��������� bList		
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
		
		//_� �������� ������
		System.out.println(aList);
     		System.out.println("���������� ��������� = " + aList.size());
		  
		System.out.println(bList);
		    System.out.println("���������� ��������� = " + bList.size());	
		
		//_� ��������� ������ bList � aList
		aList.addAll(bList);
				
		System.out.println();
		
		//_� ��������� ����������� ������
		Collections.sort(aList);
		System.out.println("�������� ������: \n" + aList);
		System.out.println("���������� ��������� = " + aList.size());

		
	}

}
