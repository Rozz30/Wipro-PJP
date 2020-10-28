/*Given a string, if the first or last chars are 'x', return the string without those 'x' chars, 
 otherwise return the string unchanged. 
If the input is "xHix", then output is "Hi".
If the input is "America", then the output is "America".
*/

import java.util.Scanner;
import java.io.InputStreamReader;
public class StringStringBuffer7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(new InputStreamReader(System.in));
		System.out.println("Enter a string:");
		String str=input.next();
		if(str.charAt(0)=='x' && str.charAt(str.length()-1)=='x') {
			System.out.println(str.substring(1, str.length()-1));
		}else {
			System.out.println(str);
		}
		input.close();
	}

}
