import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class CollectionMain {
	
	public static void main(String[] args) {
		
		SortedSet<String> setA = new TreeSet<String>(new Comparator<String> () {
			public int compare(String a, String b) {
				return -a.compareTo(b);
			}
		});
		
		setA.addAll(Arrays.asList("A", "B", "C"));
		SortedSet<String> setB = new TreeSet<String>(Arrays.asList("B", "C", "D"));
		
		System.out.println("A="+setA);
		System.out.println("B="+setB);
		
		Set<String> setC = new HashSet<String>(setA);
		setC.addAll(setB);
		System.out.println("A U B="+setC);
		
		Set<String> setD = new HashSet<String>(setA);
		setD.retainAll(setB);
		System.out.println("A intersected with B="+setD);
		
		System.out.println("First in A is:"+setA.first());
		System.out.println("Last in A is:"+setA.last());
		
	}

}
