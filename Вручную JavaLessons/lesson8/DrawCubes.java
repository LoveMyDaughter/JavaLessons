//_� � ���� ������ ������ 6 �������

package lesson8;

public class DrawCubes {

	//Cubes cubes = new Cubes();
	
	//_� ������ ����� "1"
	void drawCube1() {
		System.out.print(" -------\n" + "|       |\n" + "|   .   |\n" + "|       |\n" + " -------\n");
	}
	
	//_� ������ ����� "2"
	void drawCube2() {
		System.out.print(" -------\n" + "|     . |\n" + "|       |\n" + "| .     |\n" + " -------\n");
	}
	
	//_� ������ ����� "3"
	void drawCube3() {
		System.out.print(" -------\n" + "|   .   |\n" + "|       |\n" + "| .   . |\n" + " -------\n");	
	}
	
	//_� ������ ����� "4"
	void drawCube4() {
		System.out.print(" -------\n" + "| .   . |\n" + "|       |\n" + "| .   . |\n" + " -------\n");
	}
	
	//_� ������ ����� "5"
	void drawCube5() {
		System.out.print(" -------\n" + "| .   . |\n" + "|   .   |\n" + "| .   . |\n" + " -------\n");
	}
	
	//_� ������ ����� "6"
	void drawCube6() {
		System.out.print(" -------\n" + "| .   . |\n" + "| .   . |\n" + "| .   . |\n" + " -------\n");
	}
	
	//_�
	int getCube(int number) {
		
		switch (number) {
			case 1: drawCube1();
				break;
			case 2: drawCube2();
				break;
			case 3: drawCube3();
				break;
			case 4: drawCube4();
				break;
			case 5: drawCube5();
				break;
			case 6: drawCube6();
				break;
		}
	
		return number;
	
	}
	
}
