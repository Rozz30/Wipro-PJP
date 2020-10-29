
/*Write a Program with a division method which receives two integer numbers and performs the division operation. 

The method should declare that it throws ArithmeticException. This exception should be handled in the main method.*/


import java.util.Scanner;
import java.io.InputStreamReader;

public class ExceptionHandling5 {
	public static void main(String[] args) {
		Scanner input=new Scanner(new InputStreamReader(System.in)) ;
		System.out.println("Enter two integers:");
		int a=input.nextInt();
		int b=input.nextInt();
		try {
			int c= divison(a,b);
			System.out.println("Division="+c);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage()+" arithmetic exception occured.");
		}

	}
	public static int divison(int a,int b) throws ArithmeticException {
		return a/b;
	}
}
