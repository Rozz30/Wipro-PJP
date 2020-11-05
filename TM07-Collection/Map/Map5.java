/*Implement the assignment 1 using TreeMap*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

class CountryTreeMap{
	private TreeMap<String,String> M1= new TreeMap<String,String>();
	//String countryName;
	//String capital;
	
	public TreeMap<String,String> saveCountryCapital(String countryName,String capital) {
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
	
	public TreeMap<String,String> swapKV(){
		TreeMap<String, String> M2= new TreeMap<String,String>();
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


public class Map5 {
	public static void main(String[] args) {
		CountryTreeMap ctm=new CountryTreeMap();
		System.out.println(ctm.saveCountryCapital("India", "Delhi"));;
		System.out.println(ctm.saveCountryCapital("Japan", "Tokyo"));;
		System.out.println(ctm.saveCountryCapital("England", "London"));;
		
		System.out.println(ctm.getCountry("Delhi"));
		System.out.println(ctm.getCapital("Japan"));
		
		System.out.println(ctm.swapKV());
		System.out.println(ctm.arrayList());
	}
	
}
