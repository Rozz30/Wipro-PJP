/*Write a java program that will return the first half of the string, if the length of the string is even.
 It should return null for odd length string.
Example1)
i/p:TomCat
o/p:Tom
Example2)
i/p:Apron
o/p:null
*/

import java.util.Scanner;
import java.io.InputStreamReader;
public class StringStringBuffer4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(new InputStreamReader(System.in));
		String str1=input.next();
		if(str1.length()%2!=0) {
			System.out.println("null");
		}else {
			System.out.println(str1.substring(0, str1.length()/2));
		}
	}

}
