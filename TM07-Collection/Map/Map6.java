/* Implement the assignment 1 using HashTable*/

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

class CountryHashTable{
	private Hashtable<String,String> M1= new Hashtable<String,String>();
	//String countryName;
	//String capital;
	
	public Hashtable<String,String> saveCountryCapital(String countryName,String capital) {
		if(!M1.containsKey(countryName)) {
			M1.put(countryName, capital);
		}
		return M1;
	}
	
	public String getCapital(String countryName) {
		if(M1.containsKey(countryName)) {
			return M1.get(countryName);
		}
		return null;
	}
	
	public String getCountry(String capitalName) {
		if(M1.containsValue(capitalName)){
			Set <Entry<String,String>> set =M1.entrySet();
			Iterator<Entry<String, String>> itr=set.iterator();
			while(itr.hasNext()) {
				Entry<String,String> entry= itr.next();
				if(entry.getValue().equals(capitalName)) {
					return entry.getKey();
				}
			}
		}
		return null;
	}
	
	public Hashtable<String,String> swapKV(){
		Hashtable<String, String> M2= new Hashtable<String,String>();
		Set <Entry<String,String>> set= M1.entrySet();
		Iterator<Entry<String,String>> itr=set.iterator();
		while(itr.hasNext()) {
			Entry<String,String> entry= itr.next();
			M2.put(entry.getValue(), entry.getKey());
		}
		return M2;
	}
	
	public ArrayList<String> arrayList() {
		ArrayList<String> list=new ArrayList<String>();
		Set<Entry<String,String>> set= M1.entrySet();
		Iterator<Entry<String,String>> itr=set.iterator();
		while(itr.hasNext()) {
			list.add(itr.next().getKey());
		}
		
		return list;
	}
}


public class Map6 {
	public static void main(String[] args) {
		CountryHashTable cht=new CountryHashTable();
		System.out.println(cht.saveCountryCapital("India", "Delhi"));;
		System.out.println(cht.saveCountryCapital("Japan", "Tokyo"));;
		System.out.println(cht.saveCountryCapital("England", "London"));;
		
		System.out.println(cht.getCountry("Delhi"));
		System.out.println(cht.getCapital("Japan"));
		
		System.out.println(cht.swapKV());
		System.out.println(cht.arrayList());
	}
	
}
