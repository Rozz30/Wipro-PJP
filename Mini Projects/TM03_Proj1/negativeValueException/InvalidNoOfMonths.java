package negativeValueException;

public class InvalidNoOfMonths extends Exception {
	public InvalidNoOfMonths(){
		System.out.println("Invalid no of months. Cant be negative value.");
	}
}
