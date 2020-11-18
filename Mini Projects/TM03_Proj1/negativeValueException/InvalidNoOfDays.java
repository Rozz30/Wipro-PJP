package negativeValueException;

public class InvalidNoOfDays extends Exception {
	public InvalidNoOfDays(){
		System.out.println("Invalid no of days. Cant be negative value.");
	}
}
