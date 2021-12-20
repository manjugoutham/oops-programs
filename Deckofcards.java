package deckofcards;


import java.util.Arrays;
import java.util.Random;

public class Deckofcards {
	
	final static int cards = 52;
	static String[] deckcards = new String[cards];
	static Random ran = new Random();
	static String[] suit_card = { "Spades", "Hearts", "Diamonds", "Clubs" };
	static String[] rank_cards = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
	static String[][] arrayofcards= new String[4][9];
	
	public void shuffle() {

//		for (int a = 0; a < cards.length; a++) {
//			cards[a] = a;
//		}
		for (int i = 0; i < deckcards.length; i++) {
			int index = (int) (Math.random() * deckcards.length);
			String temp = deckcards[i];
			deckcards[i] = deckcards[index];
			deckcards[index] = temp;
		}
		
		for (int i = 0; i < 4; i++) {
			for (int n = 0; n < arrayofcards.length; n++) {
				for (int m = 0; m < arrayofcards[n].length; m++) {
					arrayofcards[n][m] = deckcards[n + m * 4];
				}
			}
		}
		
//		for (int i = 0; i < deckcards.length; i++) {
//			System.out.print(deckcards[i] + " ");
//		}
	}

	public void  deckdata2d(String[][] data)
    {
        System.out.println(Arrays.deepToString(data));
    }
	
	public void arraycard() {
		
		int n = suit_card.length * rank_cards.length;
		
		for (int i = 0; i < rank_cards.length; i++) {
			for (int j = 0; j < suit_card.length; j++) {
				deckcards[suit_card.length * i + j] = rank_cards[i] + " of " + suit_card[j];
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deckofcards de = new Deckofcards();
//		String[] suit_card = { "Spades", "Hearts", "Diamonds", "Clubs" };
//		String[] rank_cards = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
		de.arraycard();
		de.shuffle();
		de.deckdata2d(arrayofcards);
	}


}