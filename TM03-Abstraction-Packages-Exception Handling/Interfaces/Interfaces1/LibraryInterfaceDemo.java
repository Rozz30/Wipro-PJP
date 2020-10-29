/*An online library application need to be created for two types of users/roles-Adults and children. Both of these users should be able to register an account. 

Any user who is less than 12 years of age will be registered as a child and they can borrow a “Kids” category book for 10 days, whereas an adult can borrow “Fiction” category books which need to be returned within 7 days. 



Note: In future, more users/roles might be added to the library where similar rules will be enforced. 

Develop Interfaces and classes for the categories mentioned above. 


1. Create an interface LibraryUser with the following methods 
void registerAccount()

void requestBook
()

2. Create 2 classes “KidUsers” and “AdultUser” which implements the LibraryUser interface.



3.  Both the classes should have two instance variables - age(int),bookType(String)

4. The methods in the KidUser class should perform the following logic. 

registerAccount():

if age < 12, a message displaying “You have successfully registered under a Kids Account” should be displayed in the console. 

If(age>12), a message displaying, “Sorry, Age must be less than 12 to register as a kid” should be displayed in the console. 


requestBook():

if bookType is “Kids”, a message displaying “Book Issued successfully, please return the book within 10 days” should be displayed in the console,else, a message displaying, “Oops, you are allowed to take only kids books” should be displayed in the console.


5. The methods in the AdultUser class should perform the following logic. 


registerAccount():

if age > 12, a message displaying “You have successfully registered under an Adult Account” should be displayed in the console.

If age<12, a message displaying, “Sorry, Age must be greater than 12 to register as an adult” should be displayed in the console.


requestBook function:

if bookType is “Fiction”, a message displaying “Book Issued successfully, please return the book within 7 days” should be displayed in the console., else, a message displaying, “Oops, you are allowed to take only adult Fiction books” should be displayed in the console.


6. Create a class “LibraryInterfaceDemo.java” with a main method and test the functionalities by creating objects of KidUser and AdultUser classes.
*/

package Interfaces1;

interface LibraryUser{
	void registerAccount();
	void requestBook();
	
}
class KidUser implements LibraryUser{
	int age;
	String bookType;
	public void setAge(int age) {
		this.age = age;
	}
	public void setBookType(String book) {
		this.bookType = book;
	}
	
	@Override
	public void registerAccount() {
		if(age<12) {
			System.out.println("You have registered successfully under a Kids Account");
		}else {
			System.out.println("Sorry, Age must be under 12 to register as a Kid");
		}
		
	}

	@Override
	public void requestBook() {
		if(bookType.equals("Kids")) {
			System.out.println("Book issued successfully, please return the book within 10 days");
		}else {
			System.out.println("Oops, you are allowed to take only kids books");
		}
	}
	
}

class AdultUser implements LibraryUser{
	int age;
	String bookType;
	public void setAge(int age) {
		this.age = age;
	}
	public void setBookType(String book) {
		this.bookType = book;
	}
	
	@Override
	public void registerAccount() {
		if(age>12) {
			System.out.println("You have registered successfully under an Adult Account");
		}else {
			System.out.println("Sorry, Age must be greater than 12 to register as an Adult");
		}
		
	}

	@Override
	public void requestBook() {
		if(bookType.equals("Fiction")) {
			System.out.println("Book issued successfully, please return the book within 7 days");
		}else {
			System.out.println("Oops, you are allowed to take only adult fiction books");
		}
	}
	
}

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		KidUser k1=new KidUser();
		k1.setAge(9);
		k1.setBookType("Kids");
		k1.registerAccount();
		k1.requestBook();
		System.out.println("");
		KidUser k2=new KidUser();
		k2.setAge(13);
		k2.setBookType("Kids");
		k2.registerAccount();
		k2.requestBook();
		System.out.println("");
		KidUser k3=new KidUser();
		k3.setAge(11);
		k3.setBookType("Fiction");
		k3.registerAccount();
		k3.requestBook();
		System.out.println("");
		
		AdultUser a1=new AdultUser();
		a1.setAge(13);
		a1.setBookType("Fiction");
		a1.registerAccount();
		a1.requestBook();
		System.out.println("");
		AdultUser a2=new AdultUser();
		a2.setAge(8);
		a2.setBookType("Fiction");
		a2.registerAccount();
		a2.requestBook();
		System.out.println("");
		AdultUser a3=new AdultUser();
		a3.setAge(18);
		a3.setBookType("Kids");
		a3.registerAccount();
		a3.requestBook();
		System.out.println("");
		

	}

}
