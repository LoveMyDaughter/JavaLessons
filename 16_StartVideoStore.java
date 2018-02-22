package lesson16;

public class StartVideoStore {

	public static void main(String[] args) {

		Logic logic = new Logic();
		
		logic.addDisk("Властелин колец", "Питер Джексон", "Фантастика", 4, 12.80);
		logic.addDisk("Страсти Христовы", "Мел Гибсон", "Драма", 9, 10.50);
		logic.addDisk("Один дома", "Крис Коламбус", "Комедия", 6, 14.0);
		logic.addDisk("Крепкий орешек", "Джон МакТирнан", "Боевик", 5, 13.10);
		logic.addDisk("Поводырь", "Олесь Санин", "Драма", 7, 14.90);
		logic.addDisk("Титаник", "Джеймс Камерон", "Драма", 8, 21.50);
		logic.addDisk("Операция ы", "Леонид Гайдай", "Комедия", 7, 19.40);
		logic.addDisk("Семьянин", "Бретт Рэтнер", "Мелодрама", 3, 9.90);
		logic.addDisk("Миссис Даутфайер", "Крис Коламбус", "Комедия", 2, 8.20);
		logic.addDisk("Армагедон", "Майкл Бэй", "Фантастика", 5, 13.00);
		logic.addDisk("Бриллиантовая рука", "Леонид Гайдай", "Комедия", 6, 13.50);
		logic.addDisk("Кавказская пленница", "Леонид Гайдай", "Комедия", 5, 12.50);
		logic.addDisk("Пятый элемент", "Люк Бессон", "Боевик", 4, 11.20);		

//		logic.showByTitle("Властелин колец");
		
//		logic.showByGenre("Фантастика");

//		logic.showByProducer("Мел Гибсон");
		
//		logic.showMaxRatingInGenre("Комедия");
		
		logic.showAll();

	}

}
