package lesson12;

/*_� ���� ��� ������� : �[n] � B[m]. ���������� ������� ������ ������, � ������� ����� �������: 
	1. �������� ����� ��������; 
	2. ����� �������� ���� ��������; 
	3. �������� ������� A, ������� �� ���������� � B; 
	4. �������� ������� B, ������� �� ���������� � A; 
	5. �������� �������� A � B, ������� �� �������� ������ ��� ��� (�� ���� ����������� ����������� ���� ���������� ���������). 
*/
		 

import java.util.ArrayList;

public class MergeAndHandling {

	public static void main(String[] args) {
		
		//_� �������� ������ aList � bList 
		ArrayList <Integer> aList = new ArrayList();
		ArrayList <Integer> bList = new ArrayList();
		
		//_� ��������� ������
		ArrayList <Integer> outList = new ArrayList();
		ArrayList <Integer> cloneList;

		//_� ��������� aList		
		aList.add(15);	aList.add(-8); aList.add(2); aList.add(1); aList.add(-25); aList.add(4); aList.add(9);
		
				
		//_� ��������� bList		
		bList.add(10); bList.add(2); bList.add(-2); bList.add(1);  bList.add(-5); bList.add(17); bList.add(7); bList.add(3); bList.add(15);
		
		
		
		//_� �������� ������
		System.out.println("������ ������: \n" + aList);
     	//System.out.println("���������� ��������� = " + aList.size());
		  
		System.out.println("������ ������: \n" + bList);
		//System.out.println("���������� ��������� = " + bList.size());
		
		
		
		
		//_� ���������� ������ bList � aList
		cloneList = (ArrayList)aList.clone();
		cloneList.addAll(bList);
				
		System.out.println("1. �������� ����� ������� ������: \n" +cloneList);

		
		
		
		//_� ����� �������� ����� �������
		cloneList = (ArrayList)aList.clone();
		cloneList.retainAll(bList);
		System.out.println("2. ����� �������� ����� �������: \n" + cloneList);
				
				
		//_� �������� aList, ������� �� ���������� � bList
		cloneList.clear();
				
		for (int i=0; i<aList.size(); i++) {
						
				if (! bList.contains(aList.get(i)))  
					cloneList.add(aList.get(i));
						
		}
		System.out.println("3. �������� aList, ������� �� ���������� � bList: \n" +cloneList);
		
		
		
		
		
		
		//_� �������� bList, ������� �� ���������� � aList
		cloneList.clear();
		
		for (int i=0; i<bList.size(); i++) {
			
			if (! aList.contains(bList.get(i)) )
					cloneList.add(bList.get(i));
			
		}
		System.out.println("4. �������� bList, ������� �� ���������� � aList: \n" + cloneList);
		
		
			
		//_� �������� aList � bList, ������� �� �������� ������ 
		for (int i=0; i<aList.size(); i++) {
			
			for (int j=0; j<bList.size(); j++) {
				
				if (bList.get(j)==aList.get(i)) {
					bList.remove(j);
					aList.remove(i);
				}	
			}
		}
		
		outList.addAll(aList);
		outList.addAll(bList);
		System.out.println("5. �������� aList � bList, ������� �� �������� ������: \n" +outList);
		System.out.println();
		
		
	}

}
