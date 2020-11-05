
/*Create a Collection “ContactList” using HashMap to store name and phone 
number of contacts added. The program should use appropriate generics 
(String, Integer) and have the following abilities:
a) Check if a particular key exists or not. 
b) Check if a particular value exists or not.
c) Use Iterator to loop through the map.
*/
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

class ContactList{
	HashMap<String,String> contacts=new HashMap<String,String>();
	
	public void addContact(String name, String number) {
		contacts.put(name,number);
	}
	
	public void chechName(String name) {
		Set<Entry<String,String>> set= contacts.entrySet();
		Iterator<Entry<String,String>> itr= set.iterator();
		while(itr.hasNext()) {
			Entry<String,String> entry= itr.next();
			if(entry.getKey().equals(name)) {
				System.out.println("Contact Name Exists.");
				break;
			}
		}
	}
	
	public void chechNumber(String number) {
		Set<Entry<String,String>> set= contacts.entrySet();
		Iterator<Entry<String,String>> itr= set.iterator();
		while(itr.hasNext()) {
			Entry<String,String> entry= itr.next();
			if(entry.getValue().equals(number)) {
				System.out.println("Contact Number Exists.");
				break;
			}
		}
	}
	
	public void listContacts() {
		Set <Entry<String,String>> set = contacts.entrySet();
		Iterator<Entry<String,String>> itr= set.iterator();
		while(itr.hasNext()) {
			Entry<String,String> entry= itr.next();
			System.out.println(entry);
		}
		
	}
	
}

public class Map4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContactList c= new ContactList();
		c.addContact("Rozario", "7448329090");
		c.addContact("Jaisankar", "9962177822");
		c.addContact("Henry", "9884469594");
		c.chechName("Rozario");
		c.chechNumber("7448329090");
		c.listContacts();
		

	}

}
