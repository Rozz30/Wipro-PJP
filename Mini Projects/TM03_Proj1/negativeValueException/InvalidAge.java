package negativeValueException;

public class InvalidAge extends Exception{
	public InvalidAge(){
		System.out.println("Invalid age. Cant be negative values.");
	}
}
