package lesson12;

//_� ��� ������ ����� �����. ��������� ������� �������� ������� � ������� � ��������� ���������
//   (�.�. �� �������� �������, ������� ����� �� ������ ������, ��������� � ����������, �������
//   ����� �� �������� ������). 
//_� ������ ����� ArrayList

import java.util.ArrayList;

public class EvenOddChange {

	public static void main(String[] args) {
		 
		ArrayList <Integer> aList = new ArrayList <Integer>(); 

		//_� ��������� ArrayList		
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
		
		//_� �������� ������
		System.out.println(aList);
		
		//_� ����� �������
		//System.out.println("����� ������� = " + aList.size());
		
		
		//_� ����� ������� ���� �� �������������� (i<aList.size()-1) �������� �� ������,
		//   ���� ��������� � �������� ��������
		for (int i =0; i<aList.size()-1; i++) {
			if (i%2==0) {
				
				//_� ������ ������� ������ � �������� ��������
				int x = aList.get(i);
				aList.set(i, aList.get(i+1));
				aList.set(i+1, x);
				
			} 
		}
				
		System.out.println(aList);
		
	}

}
