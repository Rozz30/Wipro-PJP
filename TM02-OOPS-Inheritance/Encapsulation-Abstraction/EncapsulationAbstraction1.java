/*Create a class Author with the following information.
Member variables : name (String), email (String), and gender (char)
Parameterized Constructor: To initialize the variables
Create a class Book with the following information.
Member variables : name (String), author (of the class Author you have just created), price (double), and qtyInStock (int)
[Assumption: Each book will be written by exactly one Author]
Parameterized Constructor: To initialize the variables
Getters and Setters for all the member variables
In the main method, create a book object and print all details of the book (including the author details)
*/



public class EncapsulationAbstraction1 {

	public static void main(String[] args) {
		Author author = new Author("K K Ramalingam","ramalingamkk@gmail.com",'M');
        Book book = new Book("Automobile Engineering", author, 499.25, 100);
        book.getDetails();

	}

}

class Author{
	String name,email;
	char gender;
	Author(String name,String email,char gender){
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
}
class Book{
	String name;
	Author author;
	double price;
	int qtyInStock;
	
	Book(String name,Author author,double price,int qtyInStock){
		this.name=name;
		this.author=author;
		this.price=price;
		this.qtyInStock=qtyInStock;
	}
	
	public void getDetails() {
		System.out.println("Book Details-->");
		System.out.print("Title:"+name+" Price:"+price+" In Stock:"+qtyInStock);
		System.out.println("");
		System.out.println("Author Details-->");
		System.out.print("Name:"+author.name+" Email:"+author.email+" Gender:"+author.gender);
	}
}