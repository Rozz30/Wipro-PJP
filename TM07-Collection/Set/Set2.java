/*Write a program to store a group of employee names into a HashSet, 
retrieve the elements one by one using an Iterator.
*/

import java.util.HashSet;
import java.util.Iterator;

public class Set2 {

	public static void main(String[] args) {
		HashSet<String> set= new HashSet<String>();
		set.add("Rozario");
		set.add("Jai");
		set.add("Alice");
		set.add("Sankar");
		set.add("Prince");
		set.add("Dhilip");
		
		Iterator<String> itr= set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
