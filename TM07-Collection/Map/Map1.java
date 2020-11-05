/*1. Develop a java class with a instance variable M1 (HashMap)  create a method 
 * saveCountryCapital(String CountryName, String capital) , the method should add 
 * the passed country and capital as key/value in the map M1 and return the Map (M1).
Key- Country                          Value - Capital
India                                                   Delhi
Japan                                                Tokyo
2. Develop a method getCapital(String CountryName) which returns the capital for 
the country passed, from the Map M1 created in step 1.
3. Develop a method getCountry(String capitalName) which returns the country for 
the capital name, passed from the Map M1 created in step 1.
4. Develop a method which iterates through the map M1 and creates another map M2 
with Capital as the key and value as Country and returns the Map M2.
Key – Capital                    Value – Country
Delhi                                           India
Tokyo                                        Japan
5. Develop a method which iterates through the map M1 and creates an ArrayList with 
all the Country names stored as keys. This method should return the ArrayList.
NOTE: You can test the methods using a main method.
*/



import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

class CountryCapitals{
	private HashMap<String,String> M1= new HashMap<String,String>();
	//String countryName;
	//String capital;
	
	public HashMap<String, String> saveCountryCapital(String countryName,String capital) {
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
	
	public HashMap<String,String> swapKV(){
		HashMap<String,String> M2= new HashMap<String,String>();
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


public class Map1 {
	public static void main(String[] args){
		CountryCapitals cc=new CountryCapitals();
		System.out.println(cc.saveCountryCapital("India", "Delhi"));;
		System.out.println(cc.saveCountryCapital("Japan", "Tokyo"));;
		System.out.println(cc.saveCountryCapital("England", "London"));;
		
		System.out.println(cc.getCountry("Delhi"));
		System.out.println(cc.getCapital("Japan"));
		
		System.out.println(cc.swapKV());
		System.out.println(cc.arrayList());
	}	
}
