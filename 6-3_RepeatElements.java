//_� ���������, ������� ������� � ������� ��������, ������������� ��� � ����� ���, � ���������� �� �� �����.

package Lesson6;

public class RepeatElements {

	public static void main(String[] args) {
		
		//_� ������ �������:	 1,2,3,4,5,6,7,8,9,10
		Integer [] inputArray = {1,1,14,1,3,7,1,7,17,14};	//_� ������ ������� �����
		
		boolean isRepeat = false;	//_� ���� ������������� ��������� ���
				
		for (int i=0; i<inputArray.length; i++) {
			
			int count = 0;	//_� ������� ��������
			
			for (int j=0; j<inputArray.length; j++) {
				
				if (inputArray[i] == inputArray[j]) {
					count ++;
					if (count>1) break;		//_� ���� ������� ����������� ���� �� 1 ���
				}	
				
			}
			if (count==2) {
				System.out.println(inputArray[i] + " ");
				isRepeat = true;
			}
			 
		}
		if (!isRepeat) System.out.println("������������� ��������� ���");
		
		
	}

}
