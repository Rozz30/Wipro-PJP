/*Write a java program that accepts a string and 
returns a new string without the first and last character of the input string.
Example1)
i/p:Suman
o/p:uma
*/


import java.util.Scanner;
import java.io.InputStreamReader;
public class StringStringBuffer5 {

	public static void main(String[] args) {
		Scanner input= new Scanner (new InputStreamReader(System.in));
		System.out.println("Enter a String:");
		String str1=input.next();
		System.out.println(str1.substring(1, str1.length()-1));
		input.close();
	}

}
