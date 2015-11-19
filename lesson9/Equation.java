//_а Написать перегруженные шаблоны функций для нахождения корней линейного (a*x + b = 0)
//и квадратного (a*x2+b*x + c = 0) уравнений. Замечание: в функции передаются коэффициенты
//уравнений. 

package lesson9;

public class Equation {
	
	//_а Метод для линейного уравнения
	//_а 	a*x + b = 0
	public static  void linear (double a, double b) {
		System.out.println( -b/a ); 
	}
	
	//_а Метод для квадратного уравнения
	//_а 	a*x2 + b*x + c = 0
		public static  void quadratic (double a, double b, double c) {
			
			System.out.println( (-b-Math.sqrt(b*b - 4*a*c))/(2*a) );
			System.out.println( (-b+Math.sqrt(b*b - 4*a*c))/(2*a) ); 
		}
	

	public static void main(String[] args) {
		
		//_а Вызов метода для линейного уравнения
		linear(-0.12, -0.3);
		
		//_а Вызов метода для квадратного уравнения
		quadratic(2, 1, 0);

	}

}
