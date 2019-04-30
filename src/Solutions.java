import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solutions {
	
	// Main
	
//	MorseCode mc = new MorseCode();
//	try {
//		System.out.println(mc.encodeWord("BIENVENIDO VELEZ"));
//	} catch(LetterNotFoundExeception e) {	
//		System.out.println(e.toString());
//	}
//	CardDeck cd = new CardDeck();
//	
//	cd.addCard("Joker");
//	cd.addCard("Queen");
//	cd.addCard("King");
//	
//	int ssize = cd.getStackSize();
//	for(int i = 0; i < ssize; i++) {
//		System.out.println("Card:" + cd.getStackCard() + ". Cards Left: " + cd.getStackSize());
//	}
//	
//	System.out.println();
//	
//	int qsize = cd.getQueueSize();
//	for(int i = 0; i < qsize; i++) {
//		System.out.println("Card:" + cd.getQueueCard() + ". Cards Left: " + cd.getQueueSize());
//	}
	
	// Morse Code
	public String encodeWord(String word) { //throws LetterNotFoundExeception {
		String result = "";
		
		for (int i=0; i<word.length(); i++) {
			
//			if(letterToMorse.containsKey(word.charAt(i))) {
//				result += letterToMorse.get(word.charAt(i)) + "   ";
//			} else {
//				throw new LetterNotFoundExeception(word.charAt(i));
//				//result += word.charAt(i) + "   ";
//			}
			
		}
		
		return result;
	}

	// Stack/Queue
	
	//Basic Application of stack? System Stack, Undo.
	
		Stack<String> sdeck;
		Queue<String> qdeck;	
		
//		public CardDeck() {
//			sdeck = new Stack<>(); // Stack is a class (add, peek, pop)
//			qdeck = new LinkedList<>(); //Queue is an interface, you can use LinkedLists (add, peek, poll)
//		}
		
		public void addCard(String card) {
			sdeck.add(card);
			qdeck.add(card);
		}
		
		public String getStackCard() {
//			Stack<String> sdeckNew = new Stack<>(); // For each does not work on this approach
//			while(sdeck.size() > 0) {
//				sdeckNew.add(sdeck.pop());
//			}
//			String result = sdeckNew.pop();
//			while(sdeckNew.size() > 0) {
//				sdeck.add(sdeckNew.pop());
//			}
			
			return sdeck.pop();
		}
		
		public String getQueueCard() {
//			int size = qdeck.size()-1;
//			for(int i = 0; i < size; i++) {
//				qdeck.add(qdeck.poll());
//			}
			return qdeck.poll();
		}
		
		public int getStackSize() {
			return sdeck.size();
		}
		
		public int getQueueSize() {
			return qdeck.size();
		}
	
	
	//Exception
	
	private static final long serialVersionUID = 1L;
	char letter;
	
//	public LetterNotFoundExeception(char letter) {
//		this.letter = letter;
//	}
//	
	public String toString() {
		return "Letter " + letter + " does not exist in map.";
	}
}
