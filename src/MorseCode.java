import java.util.Map;
import java.util.TreeMap;

public class MorseCode {
	
	private static Map<Character,String> letterToMorse;

	public MorseCode() {
		
		letterToMorse = new TreeMap<Character,String>();
		
		letterToMorse.put('A', "._");
		letterToMorse.put('B', "_...");
		letterToMorse.put('E', ".");
		letterToMorse.put('I', "..");
		letterToMorse.put('L', "._..");
		letterToMorse.put('N', "_.");
		letterToMorse.put('O', "._.");
		letterToMorse.put('R', "._.");
		letterToMorse.put('T', "._.");
		letterToMorse.put('V', "..._");
	}
	
	public String encodeWord(String word) {		
		return "";
	}
	
}
