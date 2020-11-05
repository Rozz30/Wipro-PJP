/*Write a program that will have a Properties class object which is capable 
of storing some States of India and their Capital. Use an Iterator to list 
all the elements stored in the Properties.
*/

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class Map3 {

	public static void main(String[] args) {
		Properties properties = new Properties();
		
		properties.setProperty("TamilNadu", "Chennai");
		properties.setProperty("Maharastra","Mumbai");
		properties.setProperty("Telangana", "Hyderabad");
		properties.setProperty("Rajasthan", "Jaipur");
		properties.setProperty("West Bengal","Kolkata");
		properties.setProperty("Karnataka","Bangalore");
		properties.setProperty("Punjab","Chandigarh");
		

		Set<Entry<Object, Object>> set = properties.entrySet();
		Iterator<Entry<Object, Object>> itr = set.iterator();
		
		while (itr.hasNext()) {
			Entry<Object, Object> e = itr.next();
			System.out.println(e);
		}

	}

}
