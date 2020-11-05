/*Create an ArrayList that can store only Strings. 
Create a printAll method that will print all the elements of the ArrayList using an Iterator.*/

import java.util.ArrayList;
import java.util.Iterator;

public class List3 {

	public static void main(String[] args) {
		ArrayList<String> names =new ArrayList<String>();
		names.add("Rozario");
		names.add("Jaisankar");
		names.add("Prince");
		names.add("Manuel");
		names.add("Dhilip");
		printAll(names);
	}

	private static void printAll(ArrayList<String> names) {
		Iterator<String> itr= names.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
