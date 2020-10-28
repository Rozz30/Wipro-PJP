/*Write a program to print the sum of all the digits of a given number.
Example1) 
I/P:1234
O/P:10
*/



import java.util.Scanner;

public class FlowControl15 {

	public static void main(String[] args) {
		
		System.out.println("Enter a number:");
		Scanner input= new Scanner(System.in);
		int num=input.nextInt();
		input.close();
		int sum;
		for(sum=0;num>0;num/=10) {
			sum+=(num%10);
		}
		System.out.println(sum);
		
	}
	
}
