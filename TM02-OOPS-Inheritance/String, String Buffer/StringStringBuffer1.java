//Write a Program to check whether a given String is Palindrome or not.

import java.util.Scanner;
import java.io.InputStreamReader;
public class StringStringBuffer1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(new InputStreamReader(System.in));
		System.out.println("Enter a String:");
		String str1=input.next();
		str1=str1.toLowerCase();
		if(isPalindrome(str1)) {
			System.out.println("It is a Palindrome");
		}else {
			System.out.println("It is not a Palindrome");
		}
		input.close();
	}
	public static boolean isPalindrome(String str1) {
		int i=0;
		int j=str1.length()-1;
		while(i<j) {
			if(str1.charAt(i)!=str1.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	
}
