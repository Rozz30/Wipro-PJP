/*Create a Collection called TreeSet which is capable of storing String objects. 
 * Then try these following operations :
a) Reverse the elements of the Collection.
b) Iterate the elements of the TreeSet using Iterator.
c) Check if a particular element exists or not.
*/

import java.util.Iterator;
import java.util.TreeSet;

public class Set3 {

	public static void main(String[] args) {
		TreeSet<String> set =new TreeSet<String>();
		set.add("Rozario");
		set.add("Jaisankar");
		set.add("Jessy");
		set.add("Romeo");
		set.add("Dhilip");
		System.out.println("Original TreeSet:\n"+set);
		Iterator<String> itr1= set.descendingIterator();
		System.out.println("\nReversed TreeSet:");
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		String check="Rozario";
		boolean result=false;
		Iterator<String> itr2= set.iterator();
		while(itr2.hasNext()) {
			if(itr2.next().equals(check)) {
				result = true;
				break;
			}	
		}
		if(result) {
			System.out.println("\n"+check+" exists...");
		}else {
			System.out.println("\n"+check +" doesnt exists...");
		}

	}

}
