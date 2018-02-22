package lesson16;

/* ���� ����� ��������� ������ ������, ���������� � ������ ������
 * ����� �� ��������
 * ����� �� �����
 * ����� �� ���������
 * ����� ���������� ����� � �����
 * ����� ���� ������� � ���������� 
*/

import java.util.ArrayList;

public class Logic {
	
	// � ��������� ������ ��� ������ � ������
	ArrayList <VideoStore> disks = new ArrayList<>();
	
	
	// ����� ���� ������
	public void showAll () {
		System.out.println("��� �����:");
		for (VideoStore disk : disks) {
			System.out.println(disk);
		}		
	}
	
	// ���������� �����
	public void addDisk (String tittle, String producer, String genre, int rating, double price) {
		disks.add(new VideoStore(tittle, producer, genre, rating, price));
	}
	
	// ����� �� ��������
	public void showByTitle (String title) {
		boolean exist = false;
		for (VideoStore disk : disks) {
			if (disk.getTittle() == title) {				
				System.out.println(disk);
				exist = true;
			}	
		}
		if (! exist) System.out.println("\"" + title + "\"" + " - ��� ������ ������.");
	}
	
	// ����� �� �����
	public void showByGenre (String genre) {
		boolean exist = false;
		for (VideoStore disk : disks) {
			if (disk.getGenre() == genre) {
				System.out.println(disk);
				exist = true;
			}	
		}
		if (! exist) System.out.println("\"" + genre + "\"" + " - ��� ������ �����.");
	}

	
	// ����� �� ��������
	public void showByProducer (String producer) {
		boolean exist = false;
		for (VideoStore disk : disks) {
			if (disk.getProducer() == producer) {
				System.out.println(disk);
				exist = true;
			}	
		}
		if (!exist) System.out.println("\"" + producer + "\"" + " - ��� ������ ��������.");
	}
	
	// ����� ���������� ����� � �����
	public void showMaxRatingInGenre (String genre) {
		boolean existGenre = false;
		VideoStore maxRaitingDisk = null;
		for (VideoStore disk : disks) {
			if (disk.getGenre() == genre) {
				existGenre = true;
				maxRaitingDisk = disk;
				break;
			}
		}
		if (existGenre) {
			for (VideoStore disk : disks) {
				if (disk.getGenre() == genre) {
					if (disk.getRating() > maxRaitingDisk.getRating()) {
						maxRaitingDisk = disk;
					}
				}
			}
		}	
		if (! existGenre) {
			System.out.println("\"" + genre + "\"" + " - ��� ������ �����.");
		} else System.out.println(maxRaitingDisk);
	}
	
}
