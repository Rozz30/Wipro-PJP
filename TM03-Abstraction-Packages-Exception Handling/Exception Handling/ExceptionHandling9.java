/* Write a program that accepts 2 integers a and b as input and finds the quotient of a/b.

This program may generate an Arithmetic Exception. Use exception handling mechanisms to handle this exception. 

In the catch block, print the message as shown in the sample output.
Also illustrate the use of finally block. Print the message “Inside finally block”.

Example1)
Enter the 2 numbers
5
2
The quotient of 5/2 = 2
Inside finally block

Example2)
Enter the 2 numbers
5
DivideByZeroException caught
Inside finally block*/

import java.util.Scanner;
import java.io.InputStreamReader;

public class ExceptionHandling9 {
	public static void main(String[] args) {
		Scanner input=new Scanner(new InputStreamReader(System.in));
		try {
			System.out.println("Enter the 2 numbers");
			int a=input.nextInt();
			int b=input.nextInt();
			System.out.println("The quotient of "+a+"/"+b+" = "+a/b);
		}catch(ArithmeticException e) {
			System.out.println("DivideByZero Exception caught");
		}finally {
			System.out.println("Inside finally block");
		}

	}

}
