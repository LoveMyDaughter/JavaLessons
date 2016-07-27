package lesson25;

// ����� 1 ������ = 

import java.util.ArrayList;
import java.util.Random;

public class BlackJack {
	
	// ��� ������
	public String playerName;
	
	// ��� ������: ������� ��� ��������
	public boolean isHuman = false;
		
	// ������� ������ ����
	public static ArrayList<Integer> cardPack = new ArrayList<>();
	
	// ���� �� ����� � ������ 
	int scores = 0;
	
	// ��������� ��������
	Random random = new Random();
	
	// �����������
	public BlackJack(boolean isHuman) {
		this.isHuman = isHuman;
		this.playerName = "���������";
	}	
	
	// �����������
	public BlackJack(boolean isHuman, String name ) {
		this.isHuman = isHuman;
		this.playerName = name;
	}
	

	// ��������� ������
	public static ArrayList<Integer> createCardPack() {		
		
		// ��������� ������ ������� �� 2 �� ����
		for (int i = 0; i < 4; i++) {	// ������ �����
			for (int j = 2; j < 12; j++) {	// ���� �����
				cardPack.add(j);	// 
				if (j == 10) {
					cardPack.add(j);	// +J �����
					cardPack.add(j);	// +Q ����
					cardPack.add(j);	// +K ������
				}
			}
		}
		
		return cardPack;
	}
	
	// ����� ����� �����
	public void getCard() {
		System.out.println(this.playerName + " : ����� �����: ");
		
		int card = selectCard();		
		scoreCount(card);	// �������� ����� � ����� �����
		cardPack.remove(card);	// ������� ����� �� ������		
		
		// �������� ������ ����� � ���� ������ ��� ������ ������
		if (this.isHuman == true) {
			System.out.println(card);
			System.out.println("����� �����: " + this.scores);
		}		
		
//		// ����� ���� ������
//		ArrayList<Integer> playerCards = new ArrayList<>();
//		playerCards.add(card);
		
	}
	
	// ����� ����� �� ������
	public int selectCard() {
		int randomPosition = random.nextInt(cardPack.size());
		int card = cardPack.get(randomPosition);	// ��������� ����� � ������	
		
		return card;
	}
	
	
	// �������
	public static void deal(BlackJack player1, BlackJack player2) {
		System.out.println("����� �������!");
		player1.getCard();
		player2.getCard();
		player1.getCard();
		player2.getCard();
	}
	
	// ����� ������� �����
	public int scoreCount(int card) {
		scores += card;
		//System.out.println("������� �����: " + scores);
		return scores;
	}
	

	
	
}

















