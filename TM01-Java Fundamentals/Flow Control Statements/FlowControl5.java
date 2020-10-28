/*Initialize a character variable in a program and 
print 'Alphabhet' if the initialized value is an alphabhet, 
print 'Digit' if the initialized value is a number, and 
print 'Special Character', if the initialized value is anything else.
*/

public class FlowControl5 {

	public static void main(String[] args) {
		char input='A';
		//char input='1';
		//char input='#';
		if(Character.isAlphabetic(input)) {
			System.out.println("Alphabet");
		}else if(Character.isDigit(input)) {
			System.out.println("Digit");
		}else {
			System.out.println("Special Character");
		}

	}

}
