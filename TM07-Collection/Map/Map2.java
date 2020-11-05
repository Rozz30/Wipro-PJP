/*Create a Collection called HashMap which is capable of storing String objects. The program should have the following abilities
a) Check if a particular key exists or not.
b) Check if a particular value exists or not.
c) Use Iterator to loop through the map.
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

class CountryMap{
	HashMap<String,String> M1= new HashMap<String,String>();
	
	public void saveCountryCapital(String countryName,String capital) {
		if(!M1.containsKey(countryName)) {
			M1.put(countryName, capital);
		}
	}
	
	public void checkKey(String countryName) {
		if(M1.containsKey(countryName)) {
			System.out.println("Key :"+countryName+" exist");
		}else {
			System.out.println("Key :"+countryName+" doesn't exist");
		}
		
	}
	
	public void checkValue(String capitalName) {
		if(M1.containsValue(capitalName)){
			System.out.println("Value :"+capitalName+" exist");
		}else {
			System.out.println("Value :"+capitalName+" doesn't exist");
		}
	}
	
	public void EntryIterator() {
		Set<Entry<String,String>> set=M1.entrySet();
		Iterator<Entry<String,String>> itr= set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}

public class Map2 {
	public static void main(String[] args) {
		CountryMap cm=new CountryMap();
		cm.saveCountryCapital("India", "Delhi");
		cm.saveCountryCapital("Japan", "Tokyo");
		cm.saveCountryCapital("England", "London");
		cm.saveCountryCapital("US", "Washington DC");
		
		cm.checkKey("Japan");
		cm.checkValue("Delhi");
		System.out.println("\n***Iterator***");
		cm.EntryIterator();
	}

}
