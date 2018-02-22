//_� �������� ������ ������ ��� ������ �������� ��������������� �������� �������. 
//_� ����������:	�������� �������� ���� �������� ������� 


package lesson9;

import java.lang.reflect.Array;

public class AverageTemplate {
		
	//_� �����-������
			static <T> void getAverageOfArray (T array) {	//_� �� ���� �������� ������ (��� ���� �� ������) ������ ����
				
				//_� ��������, �������� �� �������� ������ ��������
				if (! array.getClass().isArray()) {
					System.out.println(String.valueOf(array));
	            } 
				else {
				
					Object element;	//_� ������� ������� ������ ����
					double sum = 0;
					double average;	//_� ������� ��������������
					double doubleElement;
					String stringElement;
					
					int length = Array.getLength(array);	//_� ����� �������
					//System.out.println("����� ������� = " + length);
					
					for (int i=0; i<length; i++) {
						element = Array.get(array, i);
						System.out.println(element);	//_� ����� ��������� ��� �����������
						
						stringElement = element.toString();
						doubleElement = Double.parseDouble(stringElement);
											
						sum += doubleElement;	//_� ����� ��������� �������
					}
					average = sum/length;
					System.out.println("������� �������������� = " + average);
				}
			}
				
	public static void main(String[] args) {
		//_� ������ ������ �����
			Integer[] intArray = {1,1,100, 2, 17, 8, 32, 15, 3};	//_� average 22
			String[] stringArray ={"����", "���", "���", "������", "����"};
			Byte[] byteArray = {2,3,0,3,8,8,0,5,12,27,40,65,33,2};	//_� average 14.857
			Double[] doubleArray = {2.21, 0.123, 271.44};	//_� average 91.258
			Double[] doubleArrayTest = {};	//_� �������� �����
		//	
		
		//_� ����� ������
			getAverageOfArray(intArray);
			//getAverageOfArray(stringArray);
			//getAverageOfArray(byteArray);
			//getAverageOfArray(doubleArray);
			//getAverageOfArray(12);
		
	}

}
