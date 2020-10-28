/*Write a Java program that accepts a string (with * in it). The program should return a new string 
in which the following characters are removed-*, the characters that are to the left and right of *
Example1)
i/p:ab*cd
o/p:ad
*/



import java.util.Scanner;
import java.io.InputStreamReader;
public class StringStringBuffer8 {

	public static void main(String[] args) {
		Scanner input=new Scanner(new InputStreamReader(System.in));
		System.out.println("Enter a string");
		String str=input.next();
		int index=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='*') {
				index=i;
				break;
			}
		}
		System.out.println(str.substring(0, index-1)+str.substring(index+2));

	}

}
