/*Given 2 strings, a and b, return a new string of the form short+long+short, 
with the shorter string on the outside and the longer string on the inside.
The strings will not be the same length, but they may be empty (length 0).
If input is "hi" and "hello", then output will be "hihellohi".
*/


import java.util.Scanner;
import java.io.InputStreamReader;
public class StringStringBuffer6 {

	public static void main(String[] args) {
		Scanner input=new Scanner(new InputStreamReader(System.in));
		System.out.println("Enter two Strings");
		String[] str=input.nextLine().split(" ");
		String a=str[0];
		String b=str[1];
		if(a.length()<b.length()) {
			System.out.println(a+b+a);
		}else {
			System.out.println(b+a+b);
		}
		input.close();
	}

}
