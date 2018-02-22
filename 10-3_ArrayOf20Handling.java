/*_� ��� ������ �� 20 ����� ����� �� ���������� �� 1 �� 20. ����������: 

1) �������� �������, �������������� �������� ������� ������������ �������; 

2) ������� ��������� ����� �� ���� �� ��������� � ����� ������� ����� ���������� ����� � �������; 

3) ������������� �������� �������, ����������� ����� �� ��������� ������� �� ��������, � ��������
 �������, ����������� ������ �� ��������� ������� �� �����������. 
*/

package lesson10;

//import java.lang.reflect.Array;
import java.util.Random;

public class ArrayOf20Handling {
	
	static Random random;
	
	//_� ����� ������������ �������� �������
	public static void flyElements (Integer[] array) {
		System.out.println("�������� ����������:");
		
		for (int i=0; i<array.length; i++) {	//_� ����� ������ �� �������
						
			int k = random.nextInt(20)+1;	//_� ������������ �����
			int x = array[i];	//_�   � - �������� ������� �������
								
			for (int j=i+1; j<array.length; j++) {	//_� ������ ������ �� ��������� ���������
							
				if (k==j) {		//_� ������������ ��������� ����� � ���������� ������� ������� 
					
					//_� ������ ������� �������� i-��� � ���������
					x =array[j];
					array[k] = array[i];
					array[i] = x;
						
					break;	//_� ������ �� �����, ��� ������ k==j ����� ������ 1 ���
				}
			}
			System.out.print(x + " ");	
		}
	}
	
	public static void main(String[] args) {
		
		random = new Random();
		
		//_� ������ Integer (����� ����� �� 1 �� 20)
		//Integer[] array = {1, 17, 2, 13, 3, 4, 20, 18, 16, 5, 12, 6, 7, 11, 19, 8, 9, 10, 14, 15};
		Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		
		//System.out.println(array.length);	//_� ����� �������
		
		//_� ����� �������
		System.out.println("������� ������:");
		for (int i=0; i<array.length; i++) { 
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		
		//_� ������������ ��������
		flyElements(array);
		
		System.out.println();
		System.out.println();
		
		//
			//_� ��������� ����� �� ��������� [1; 20]
			int randomNumber = random.nextInt(20)+1;
			System.out.println("��������� ����� = " + randomNumber);
			
			//_� �������� ����� � ������� ��� �����������
			for (int i=0; i<array.length; i++) { 
				if (array[i] == randomNumber) {
					System.out.print("|" + array[i] + "| ");
				} else System.out.print(array[i] + " "); 	
			}
			
			System.out.println();
			
			//_� ������� ���������� ����� � �������
			int randomIndex=0;
			for (int i=0; i<array.length; i++) { 
				if (array[i] == randomNumber) {
					randomIndex = i;
					System.out.println("���������� ����� ���������� ����� =  " + randomIndex);
					break;
				}
			}
		//
		
			System.out.println();
				
			
		//_� ���������� ����� � ������ ����� �� randomNumber
			//_� ����� �� randomNumber - �� �������� 	
			for (int i=0; i<randomIndex; i++) {
				int k = i;
				int x = array[i];
				
				for (int j=i+1; j<randomIndex; j++) {
					if (array[j] > x) {
						k = j;
						x = array[j];
						array[k] = array[i];
						array[i]  =  x;
					}
				}
				
			}
					
			//_� ������ �� randomNumber - �� ����������� 	
			for (int i=randomIndex+1; i<array.length; i++) {
				int k = i;
				int x = array[i];
				
				for (int j=i+1; j<array.length; j++) {
					if (array[j] < x) {
						k = j;
						x = array[j];
						array[k] = array[i];
						array[i]  =  x;
					}
				}
			}

			
			//_� ����� ������� ����� ����������
			System.out.println("����� ����������:");
			
			 for(int i=0; i<array.length; i++){
				 if (array[i] == randomNumber) {
					 System.out.print("|" + array[i] + "| ");
				 }
			     else System.out.print(array[i]+" ");
			 }
	}

}
