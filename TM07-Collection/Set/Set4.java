/*Implement the assignment 1 using TreeSet*/

import java.util.Scanner;
import java.util.TreeSet;

class CountryTreeSet{
	TreeSet<String> H1=new TreeSet<String>();
	
	public  TreeSet<String> saveCountryNames(String countryName) {
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

public class Set4 {

	public static void main(String[] args) {
		CountryTreeSet s1=new CountryTreeSet();
		Scanner scan = new Scanner (System.in);		
		String countryName;
		int choice;
		do {
			System.out.println("\n1. Add Country to the TreeSet H1");
			System.out.println("2. Check if Country is present in the TreeSet H1");
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
