package lesson16;

/* этот класс реализует методы поиска, добавления и показа дисков
 * Поиск по названию
 * Поиск по жанру
 * Поиск по режиссеру
 * Самый популярный фильм в жанре
 * Показ всех записей и добавление 
*/

import java.util.ArrayList;

public class Logic {
	
	// в коллекции храним все данные о дисках
	ArrayList <VideoStore> disks = new ArrayList<>();
	
	
	// показ всех дисков
	public void showAll () {
		System.out.println("Все диски:");
		for (VideoStore disk : disks) {
			System.out.println(disk);
		}		
	}
	
	// добавление диска
	public void addDisk (String tittle, String producer, String genre, int rating, double price) {
		disks.add(new VideoStore(tittle, producer, genre, rating, price));
	}
	
	// показ по названию
	public void showByTitle (String title) {
		boolean exist = false;
		for (VideoStore disk : disks) {
			if (disk.getTittle() == title) {				
				System.out.println(disk);
				exist = true;
			}	
		}
		if (! exist) System.out.println("\"" + title + "\"" + " - Нет такого фильма.");
	}
	
	// показ по жанру
	public void showByGenre (String genre) {
		boolean exist = false;
		for (VideoStore disk : disks) {
			if (disk.getGenre() == genre) {
				System.out.println(disk);
				exist = true;
			}	
		}
		if (! exist) System.out.println("\"" + genre + "\"" + " - Нет такого жанра.");
	}

	
	// показ по режисеру
	public void showByProducer (String producer) {
		boolean exist = false;
		for (VideoStore disk : disks) {
			if (disk.getProducer() == producer) {
				System.out.println(disk);
				exist = true;
			}	
		}
		if (!exist) System.out.println("\"" + producer + "\"" + " - Нет такого режисера.");
	}
	
	// Самый популярный фильм в жанре
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
			System.out.println("\"" + genre + "\"" + " - Нет такого жанра.");
		} else System.out.println(maxRaitingDisk);
	}
	
}
