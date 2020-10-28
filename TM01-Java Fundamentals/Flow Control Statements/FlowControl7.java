/*Initialize a character variable with an alphabhet in a program.
If the character value is in lowercase, the output should be displayed in uppercase in the following format.
Example1)
i/p:a
o/p:a->A
If the character value is in uppercase, the output should be displayed in lowercase in the following format.
Example2)
i/p:A
o/p:A->a
*/


public class FlowControl7 {

	public static void main(String[] args) {
		//char var='A';
		char var='a';
		if(Character.isUpperCase(var)) {
			System.out.println(Character.toLowerCase(var));
		}else {
			System.out.println(Character.toUpperCase(var));
		}
	}

}
