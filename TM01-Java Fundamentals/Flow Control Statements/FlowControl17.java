/*Write a program to reverse a given number and print
Example1)
I/P: 1234
O/P:4321
Example2)
I/P:1004
O/P:4001
*/

import java.util.Scanner;
public class FlowControl17 {

	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		int rev=0;
		while(num>0) {
			rev=(rev*10)+num%10;
			num/=10;
		}
		System.out.println(rev);
	input.close();
	}
	

}
