package lesson16;

/*	1. ������� ����� ������������ �� ���������� ������: 

�������� ������		tittle 
�������� 			producer
���� 				genre
������� ������������ rating		 
���� �����			price

����������� ��������� �����������:
����� �� �������� 
����� �� ����� 
����� �� ��������� 
����� ���������� ����� � ����� 
����� ���� ������� � ���������� 
 * 
 */


public class VideoStore {
	// ����
	private String tittle;
	private String producer;
	private String genre;
	private int rating;
	private double price;
	
	
	// �����������
	public VideoStore (String tittle, String producer, String genre, int rating, double price) {
		this.setTittle(tittle);
		this.setProducer(producer);
		this.setGenre(genre);
		this.setRating(rating);
		this.setPrice(price);
	}	
	
	// �������-�������
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
