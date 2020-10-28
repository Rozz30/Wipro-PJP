 //Write a program to check if a given integer number is odd or even.


import java.util.Scanner;
public class FlowControl2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number:");
		int num=input.nextInt();
		if(num%2==0) System.out.println("Even");
		else System.out.println("Odd");
		input.close();
		
		
	}

}
