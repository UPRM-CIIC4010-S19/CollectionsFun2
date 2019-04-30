import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CardDeck {
		
	Stack<String> sdeck;
	Queue<String> qdeck;	
	
	public CardDeck() {
		sdeck = new Stack<>();
		qdeck = new LinkedList<>(); 
	}
	
	public void addCard(String card) {
		sdeck.add(card);
		qdeck.add(card);
	}
	
	public String getStackCard() {
		return sdeck.pop();
	}
	
	public String getQueueCard() {
		return qdeck.poll();
	}
	
	public int getStackSize() {
		return sdeck.size();
	}
	
	public int getQueueSize() {
		return qdeck.size();
	}

}
