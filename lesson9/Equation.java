//_� �������� ������������� ������� ������� ��� ���������� ������ ��������� (a*x + b = 0)
//� ����������� (a*x2+b*x + c = 0) ���������. ���������: � ������� ���������� ������������
//���������. 

package lesson9;

public class Equation {
	
	//_� ����� ��� ��������� ���������
	//_� 	a*x + b = 0
	public static  void linear (double a, double b) {
		System.out.println( -b/a ); 
	}
	
	//_� ����� ��� ����������� ���������
	//_� 	a*x2 + b*x + c = 0
		public static  void quadratic (double a, double b, double c) {
			
			System.out.println( (-b-Math.sqrt(b*b - 4*a*c))/(2*a) );
			System.out.println( (-b+Math.sqrt(b*b - 4*a*c))/(2*a) ); 
		}
	

	public static void main(String[] args) {
		
		//_� ����� ������ ��� ��������� ���������
		linear(-0.12, -0.3);
		
		//_� ����� ������ ��� ����������� ���������
		quadratic(2, 1, 0);

	}

}
