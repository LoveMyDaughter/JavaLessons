<<<<<<< HEAD
package lesson16;

/*	1. Ñîçäàòü êëàññ ÂÈÄÅÎÌÀÃÀÇÈÍ ñî ñëåäóþùèìè ïîëÿìè: 

Íàçâàíèå ôèëüìà		tittle 
Ðåæèññåð 			producer
Æàíð 				genre
Ðåéòèíã ïîïóëÿðíîñòè rating		 
Öåíà äèñêà			price

Ðåàëèçîâàòü ñëåäóþùèå âîçìîæíîñòè:
Ïîèñê ïî íàçâàíèþ 
Ïîèñê ïî æàíðó 
Ïîèñê ïî ðåæèññåðó 
Ñàìûé ïîïóëÿðíûé ôèëüì â æàíðå 
Ïîêàç âñåõ çàïèñåé è äîáàâëåíèå 
 * 
 */


public class VideoStore {
	// ïîëÿ
	private String tittle;
	private String producer;
	private String genre;
	private int rating;
	private double price;
	
	
	// êîíñòðóêòîð
	public VideoStore (String tittle, String producer, String genre, int rating, double price) {
		this.setTittle(tittle);
		this.setProducer(producer);
		this.setGenre(genre);
		this.setRating(rating);
		this.setPrice(price);
	}	
	
	// Ãåòòåðû-Ñåòòåðû
	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return this.getTittle() + "\t" + this.getProducer() + "\t" + this.getGenre() + "\t" + this.getRating() + "\t" + this.getPrice();
	}

}
=======
package lesson16;

/*	1. Ð¡Ð¾Ð·Ð´Ð°Ñ‚ÑŒ ÐºÐ»Ð°ÑÑ Ð’Ð˜Ð”Ð•ÐžÐœÐÐ“ÐÐ—Ð˜Ð ÑÐ¾ ÑÐ»ÐµÐ´ÑƒÑŽÑ‰Ð¸Ð¼Ð¸ Ð¿Ð¾Ð»ÑÐ¼Ð¸: 

ÐÐ°Ð·Ð²Ð°Ð½Ð¸Ðµ Ñ„Ð¸Ð»ÑŒÐ¼Ð°		tittle 
Ð ÐµÐ¶Ð¸ÑÑÐµÑ€ 			producer
Ð–Ð°Ð½Ñ€ 				genre
Ð ÐµÐ¹Ñ‚Ð¸Ð½Ð³ Ð¿Ð¾Ð¿ÑƒÐ»ÑÑ€Ð½Ð¾ÑÑ‚Ð¸ rating		 
Ð¦ÐµÐ½Ð° Ð´Ð¸ÑÐºÐ°			price

Ð ÐµÐ°Ð»Ð¸Ð·Ð¾Ð²Ð°Ñ‚ÑŒ ÑÐ»ÐµÐ´ÑƒÑŽÑ‰Ð¸Ðµ Ð²Ð¾Ð·Ð¼Ð¾Ð¶Ð½Ð¾ÑÑ‚Ð¸:
ÐŸÐ¾Ð¸ÑÐº Ð¿Ð¾ Ð½Ð°Ð·Ð²Ð°Ð½Ð¸ÑŽ 
ÐŸÐ¾Ð¸ÑÐº Ð¿Ð¾ Ð¶Ð°Ð½Ñ€Ñƒ 
ÐŸÐ¾Ð¸ÑÐº Ð¿Ð¾ Ñ€ÐµÐ¶Ð¸ÑÑÐµÑ€Ñƒ 
Ð¡Ð°Ð¼Ñ‹Ð¹ Ð¿Ð¾Ð¿ÑƒÐ»ÑÑ€Ð½Ñ‹Ð¹ Ñ„Ð¸Ð»ÑŒÐ¼ Ð² Ð¶Ð°Ð½Ñ€Ðµ 
ÐŸÐ¾ÐºÐ°Ð· Ð²ÑÐµÑ… Ð·Ð°Ð¿Ð¸ÑÐµÐ¹ Ð¸ Ð´Ð¾Ð±Ð°Ð²Ð»ÐµÐ½Ð¸Ðµ 
 * 
 */


public class VideoStore {
	// Ð¿Ð¾Ð»Ñ
	private String tittle;
	private String producer;
	private String genre;
	private int rating;
	private double price;
	
	
	// ÐºÐ¾Ð½ÑÑ‚Ñ€ÑƒÐºÑ‚Ð¾Ñ€
	public VideoStore (String tittle, String producer, String genre, int rating, double price) {
		this.setTittle(tittle);
		this.setProducer(producer);
		this.setGenre(genre);
		this.setRating(rating);
		this.setPrice(price);
	}	
	
	// Ð“ÐµÑ‚Ñ‚ÐµÑ€Ñ‹-Ð¡ÐµÑ‚Ñ‚ÐµÑ€Ñ‹
	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return this.getTittle() + "\t" + this.getProducer() + "\t" + this.getGenre() + "\t" + this.getRating() + "\t" + this.getPrice();
	}

}
>>>>>>> c0ad407ecd83aa6bee2290b638c63333c0e9ee07
