/*Develop a java class with a instance variable H1 (HashSet)  add a method 
 * saveCountryNames(String CountryName) , the method should add the passed
 * country to a HashSet (H1) and return the added HashSet(H1).
   Develop a method getCountry(String CountryName) which iterates through the 
   HashSet and returns the country if exist else return null. 
   NOTE: You can test the methods using a main method.*/



import java.util.HashSet;
import java.util.Scanner;

class CountryHashSet{
	HashSet<String> H1=new HashSet<String>();
	
	public  HashSet<String> saveCountryNames(String countryName) {
		H1.add(countryName);
		return H1;
	}
	
	public  String getCountry(String countryName) {
		for(String name:H1) {
			if(name.equals(countryName)) {
				return name;
			}
		}
		return null;
	}

}

public class Set1 {

	public static void main(String[] args) {
		CountryHashSet s1=new CountryHashSet();
		Scanner scan = new Scanner (System.in);		
		String countryName;
		int choice;
		do {
			System.out.println("\n1. Add Country to the HashSet H1");
			System.out.println("2. Check if Country is present in the HashSet H1");
			System.out.println("3. Exit");
			System.out.println("Enter your choice:");
			choice= scan.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter Country Name:");
				countryName= scan.next();
				System.out.println(s1.saveCountryNames(countryName));
				break;
			case 2:
				System.out.println("Enter County Name:");
				countryName= scan.next();
				System.out.println(s1.getCountry(countryName));
				break;
			case 3:
				System.out.println("Exiting....");
			}
		}while(choice!=3);	
		
		scan.close();
	}

}
