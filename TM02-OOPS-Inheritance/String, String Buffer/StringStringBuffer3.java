/*Given a string, return a new string made of 'n' copies of the first 2 chars of the original string 
 where 'n' is the length of the string.
Example1)
i/p:Wipro
o/p:WiWiWiWiWi
*/


import java.util.Scanner;
import java.io.InputStreamReader;
public class StringStringBuffer3 {

	public static void main(String[] args) {
		Scanner input= new Scanner(new InputStreamReader(System.in));
		String str1=input.next();
		int n=str1.length();
		str1=str1.substring(0, 2);
		for(int i=0;i<n;i++) {
			System.out.print(str1);
		}
		input.close();
	}

}
