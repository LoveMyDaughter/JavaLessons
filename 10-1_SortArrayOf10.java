//_� ��� ������ ����� ������������ 10 ���������. �������� �������, ������� ��������� ������
// �� ����������� ��� �� ��������, � ����������� �� �������� ��������� �������. ���� �� ����� 1,
//���������� ���� �� ��������, ���� 0, �� �� �����������. ������ 2 ��������� ������� - ��� ������
//� ��� ������, ������ �������� �� ��������� ����� 1. 


package lesson10;

public class SortArrayOf10 {
		
        //_� ����� ����������
		public static<T> void sortArray(T [] array, int sizeOfArray, int param) {
								
			int length = sizeOfArray;	//_� ����� ������� �������� ��� ������ ������
			
			//_� ������� ������ ���� Double, � ������� ����� ����������� ����������
			Double[] doubleArray = new Double[length];	
			
			for (int i=0; i<length; i++) {
				
				//_� ��������� ������ Double ���������� �������� �������
				doubleArray[i] = Double.parseDouble(array[i].toString());
				
				//System.out.print(doubleArray[i] + " ");
			}
			
			//_� ����������
			for (int i=0; i<length; i++) {
				
				int k = i;
				double x = doubleArray[i];
				
				for (int j=i+1; j<length; j++) {
					
					//_� ����� ����������� ���������� � ����������� �� ==param==
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
				
				//System.out.print(x + " ");	//_� ����� ��������� ���������������� �������
				
				//_� ��������� �������� ������ � ������ ��� (��� ��������)
				//_� � ������� �������� ���������������� �������
				if (array instanceof Integer[]) System.out.print((int)x + " ");
				if (array instanceof Byte[]) System.out.print((byte)x + " ");
				if (array instanceof Double[]) System.out.print(x + " "); 
				if (array instanceof Long[]) System.out.print((long)x + " ");
				if (array instanceof Short[]) System.out.print((short)x + " ");
				
			}	
		
		System.out.println("");
	}
	
	public static void main(String[] args) {
		
		//_� ������ Integer
		Integer[] intArray = {1, 1, 100, -2, 17, 8, 32, -15, 3, 66};	
			
		//_� ������ Byte
		Byte[] byteArray = {2, 3, 0, -3, 8, 8, 0, -5, 12, 27, -40, 65, 33, 2};
			
		//_� ������ Double
		Double[] doubleArray = {2.21, 0.123, 271.44, -71.4, -21.98675, 43.98, 12890.44, -34.0, 30.12};
			
		//_� ������ Long
		Long[] longArray = {-21800L, 12976L, -12345L, 3400L, 8790L, 12599L, 690211L, -2340L, 20535L};
		
		//_� ������ Short
		Short[] shortArray = {-10000, -2010, 7342, -390, 0, 680, - 23, 40, 2200, 555};	
			
		
		//_� ����� ������� � ����������� 
		sortArray(intArray, 7, 0);
		sortArray(byteArray, 4, 0);
		sortArray(doubleArray, 9, 0);
		sortArray(longArray, 5, 1);
		sortArray(shortArray, 10, 1);
		

	}

}
