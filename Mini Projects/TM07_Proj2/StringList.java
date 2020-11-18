import java.util.ArrayList;
import java.util.List;

public class StringList {
	List<String> strList=new ArrayList<String>();
	public void insert(String item) {
		if(strList.contains(item)) {
			System.out.println("Item already exists");
		}else {
			strList.add(item);
			System.out.println("Inserted successfully");
		}
	}
	
	public void search(String item) {
		for(String str:strList) {
			if(str.equals(item)) {
				System.out.println("Item found in the list");
				return;
			}
		}
		System.out.println("Item not found in the list");
	}
	
	public void delete(String item) {
		for(String str:strList) {
			if(str.equals(item)) {
				strList.remove(item);
				System.out.println("Deleted successfully");
				return;
			}
		}
		System.out.println("Item does not exist");
	}
	
	public void display() {
		for(String str:strList) {
			System.out.println(str);
		}
	}
	
}
