/*Get an input String from user and parse it to integer, if it is not a number it will throw number format exception Catch it and print "Entered input is not a valid format for an integer." or else print the square of that number. (Refer Sample Input and Output). 

Sample input and output 1: 
Enter an integer: 12
The square value is 144
The work has been done successfully

Sample input and output 2:
Enter an integer: Java
Entered input is not a valid format for an integer.*/

import java.util.Scanner;
import java.io.InputStreamReader;
public class ExceptionHandling1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(new InputStreamReader(System.in));
		System.out.print("Enter an integer:");
		try {
			int val= Integer.parseInt(input.next());
			System.out.println("The square value is "+val*val);
			System.out.println("The work has been done successfully");
		}
		catch(NumberFormatException e) {
			System.out.println("Entered input is not a valid format for an integer");
		} 
		
	}

}
