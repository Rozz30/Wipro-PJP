//Write a program to check if a given number is prime or not.

import java.util.Scanner;
public class FlowControl12 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number:");
		int num=input.nextInt();
		int flag=0;
	
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				flag++;;
			}
		}
		if(flag==0) {
			System.out.println("Prime number");
		}else {
			System.out.println("Not a prime number");
		}
		
	    input.close();
	}

}
