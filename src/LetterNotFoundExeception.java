
public class LetterNotFoundExeception extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	char letter;
	
	public LetterNotFoundExeception(char letter) {
		this.letter = letter;
		
	}
	
	public String toString() {
		return "The letter " + letter + " is not in the Morse code map.";
	}
}
