/*Given a string and an integer n, print a new string made of n repetitions of the last n characters of the string. 
You may assume that n is between 0 and the length of the string, inclusive. 
Example1)
i/p:Wipro,3
o/p:propropro
*/




import java.util.Scanner;
import java.io.InputStreamReader;
public class StringStringBuffer10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(new InputStreamReader(System.in));
		System.out.println("Enter a string:");
		String str=input.next();
		System.out.println("Enter value n:");
		int n=input.nextInt();
		for(int i=0;i<n;i++) {
			System.out.print(str.substring(str.length()-n));
		}
		input.close();
	}

}
