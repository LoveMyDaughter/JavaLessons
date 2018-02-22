package lesson12;

/*_а ƒаны два массива : ј[n] и B[m]. Ќеобходимо создать третий массив, в котором нужно собрать: 
	1. Ёлементы обоих массивов; 
	2. ќбщие элементы двух массивов; 
	3. Ёлементы массива A, которые не включаютс€ в B; 
	4. Ёлементы массива B, которые не включаютс€ в A; 
	5. Ёлементы массивов A и B, коотрые не €вл€ютс€ общими д€л них (то есть объединение результатов двух предыдущих вариантов). 
*/
		 

import java.util.ArrayList;

public class MergeAndHandling {

	public static void main(String[] args) {
		
		//_а ¬ходащие списки aList и bList 
		ArrayList <Integer> aList = new ArrayList();
		ArrayList <Integer> bList = new ArrayList();
		
		//_а »сход€щие списки
		ArrayList <Integer> outList = new ArrayList();
		ArrayList <Integer> cloneList;

		//_а Ќаполн€ем aList		
		aList.add(15);	aList.add(-8); aList.add(2); aList.add(1); aList.add(-25); aList.add(4); aList.add(9);
		
				
		//_а Ќаполн€ем bList		
		bList.add(10); bList.add(2); bList.add(-2); bList.add(1);  bList.add(-5); bList.add(17); bList.add(7); bList.add(3); bList.add(15);
		
		
		
		//_а ѕоказать списки
		System.out.println("ѕервый список: \n" + aList);
     	//System.out.println(" оличество элементов = " + aList.size());
		  
		System.out.println("¬торой список: \n" + bList);
		//System.out.println(" оличество элементов = " + bList.size());
		
		
		
		
		//_а ќбъедин€ем список bList и aList
		cloneList = (ArrayList)aList.clone();
		cloneList.addAll(bList);
				
		System.out.println("1. Ёлементы обоих списков вместе: \n" +cloneList);

		
		
		
		//_а ќбщие элементы обоих списков
		cloneList = (ArrayList)aList.clone();
		cloneList.retainAll(bList);
		System.out.println("2. ќбщие элементы обоих списков: \n" + cloneList);
				
				
		//_а Ёлементы aList, которые не включаютс€ в bList
		cloneList.clear();
				
		for (int i=0; i<aList.size(); i++) {
						
				if (! bList.contains(aList.get(i)))  
					cloneList.add(aList.get(i));
						
		}
		System.out.println("3. Ёлементы aList, которые не включаютс€ в bList: \n" +cloneList);
		
		
		
		
		
		
		//_а Ёлементы bList, которые не включаютс€ в aList
		cloneList.clear();
		
		for (int i=0; i<bList.size(); i++) {
			
			if (! aList.contains(bList.get(i)) )
					cloneList.add(bList.get(i));
			
		}
		System.out.println("4. Ёлементы bList, которые не включаютс€ в aList: \n" + cloneList);
		
		
			
		//_а Ёлементы aList и bList, которые не €вл€ютс€ общими 
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
		System.out.println("5. Ёлементы aList и bList, которые не €вл€ютс€ общими: \n" +outList);
		System.out.println();
		
		
	}

}
