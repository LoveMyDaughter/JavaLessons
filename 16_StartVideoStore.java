package lesson16;

public class StartVideoStore {

	public static void main(String[] args) {

		Logic logic = new Logic();
		
		logic.addDisk("��������� �����", "����� �������", "����������", 4, 12.80);
		logic.addDisk("������� ��������", "��� ������", "�����", 9, 10.50);
		logic.addDisk("���� ����", "���� ��������", "�������", 6, 14.0);
		logic.addDisk("������� ������", "���� ���������", "������", 5, 13.10);
		logic.addDisk("��������", "����� �����", "�����", 7, 14.90);
		logic.addDisk("�������", "������ �������", "�����", 8, 21.50);
		logic.addDisk("�������� �", "������ ������", "�������", 7, 19.40);
		logic.addDisk("��������", "����� ������", "���������", 3, 9.90);
		logic.addDisk("������ ���������", "���� ��������", "�������", 2, 8.20);
		logic.addDisk("���������", "����� ���", "����������", 5, 13.00);
		logic.addDisk("������������� ����", "������ ������", "�������", 6, 13.50);
		logic.addDisk("���������� ��������", "������ ������", "�������", 5, 12.50);
		logic.addDisk("����� �������", "��� ������", "������", 4, 11.20);		

//		logic.showByTitle("��������� �����");
		
//		logic.showByGenre("����������");

//		logic.showByProducer("��� ������");
		
//		logic.showMaxRatingInGenre("�������");
		
		logic.showAll();

	}

}
