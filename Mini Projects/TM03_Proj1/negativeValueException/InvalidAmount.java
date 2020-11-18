package negativeValueException;

public class InvalidAmount extends Exception{
	public InvalidAmount(){
		System.out.println("Invalid amount. Cant be negative value.");
	}
}
