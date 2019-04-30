import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class CollectionMain {
	
	public static void main(String[] args) {
		
		
		try {
			MorseCode mc = new MorseCode();
			
			System.out.print(mc.encodeWord("BienveComoEstas"));
			
		} catch(LetterNotFoundExeception e) {
			System.out.println(e.toString());
		}
		CardDeck cd = new CardDeck();

		cd.addCard("Joker");
		cd.addCard("Queen");
		cd.addCard("King");
		cd.addCard("10");
		
		int ssize = cd.getStackSize();
		
		for(int i = 0; i < ssize; i++) {
			System.out.println("Card: " + cd.getStackCard() + ". Cards Left: " + cd.getStackSize());
		}
		
		System.out.println();
	
		int qsize = cd.getQueueSize();
		
		for(int i = 0; i < qsize; i++) {
			System.out.println("Card: " + cd.getQueueCard() + ". Cards Left: " + cd.getQueueSize());
		}
		
	}

}
