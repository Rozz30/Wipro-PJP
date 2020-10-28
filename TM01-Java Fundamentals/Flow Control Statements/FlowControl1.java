//Write a program to check if a given integer number is Positive, Negative, or Zero.

import java.util.Scanner;
public class FlowControl1 {

	
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("Enter a Integer number -->");
		int num= input.nextInt();
		if(num>0)  System.out.println("Positive");
		else if(num<0)  System.out.println("Negative");
		else System.out.println("Zero");
		
		input.close();
		
		
	}

}
