package lesson8;

import java.util.Random;
import java.util.Scanner;

public class Throws {

	DrawCubes draw = new DrawCubes();
	
	private Scanner readEnter = new Scanner(System.in);
	Random random = new Random();
	
	String gamerName = "user";
	int throwFirstCube, throwSecondCube;	//_� ���������� �������� ����� �������
	int sum = 0;
	
	//_� ������
	void throwling() {
		//_� ������� ������ �����
		throwFirstCube = random.nextInt(6)+1;
				
		//_� ������� ������ �����
		throwSecondCube = random.nextInt(6)+1;
				
		//_� ���������� ������ �����
		draw.getCube(throwFirstCube);
				
		//_� ���������� ������ �����
		draw.getCube(throwSecondCube);
		
		System.out.print("������ ����� = " + throwFirstCube + "  ");
		System.out.println("������ ����� = " + throwSecondCube);
		sum = throwFirstCube + throwSecondCube;
		//System.out.println();
				
	}
	
	//_� ������ ����������
	void pcThrow() {
				
		//_� ������� ������ �����
		throwFirstCube = random.nextInt(6)+1;
		
		//_� ������� ������ �����
		throwSecondCube = random.nextInt(6)+1;
		
		System.out.println("� ���������� ������:");
		
		//_� ���������� ������ �����
		draw.getCube(throwFirstCube);
		
		//_� ���������� ������ �����
		draw.getCube(throwSecondCube);
					
		System.out.print("������ ����� = " + throwFirstCube + "  ");
		System.out.println("������ ����� = " + throwSecondCube);
		
		//_� ���������� ����� ���� �������
		System.out.println("����� ����� = " + (throwFirstCube+throwSecondCube));
		
		System.out.println();
		
	}
	
	//_� ������ ������������
	void userThrow() {
		System.out.println("�������� ������ ! (������� Enter)");
		readEnter.nextLine();
		
		//_� ������� ������ �����
		throwFirstCube = random.nextInt(6)+1;
		
		//_� ������� ������ �����
		throwSecondCube = random.nextInt(6)+1;
		
		System.out.println("� ��� ������:");
		
		//_� ���������� ������ �����
		draw.getCube(throwFirstCube);
		
		//_� ���������� ������ �����
		draw.getCube(throwSecondCube);
					
		System.out.print("������ ����� = " + throwFirstCube + "  ");
		System.out.println("������ ����� = " + throwSecondCube);
		
		//_� ���������� ����� ���� �������
		System.out.println("����� ����� = " + sum);
		
		System.out.println();
	}
	
	
}
