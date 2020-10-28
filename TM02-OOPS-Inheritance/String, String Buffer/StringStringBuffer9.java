/*Given two strings, a and b, print a new string which is made of the following combination-first 
character of a, the first character of b, second character of a, second character of b and so on. 
Any characters left, will go to the end of the result.
Example1)
i/p:Hello,World
o/p:HWeolrllod
*/



import java.io.InputStreamReader;
import java.util.Scanner;
public class StringStringBuffer9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(new InputStreamReader(System.in));
		System.out.println("Enter two strings in new lines:");
		String str1=input.next();
		String str2=input.next();
		
		for(int i=0,j=0;i<str1.length() || j<str2.length();i++,j++) {
			try{
				System.out.print(str1.charAt(i));
			}catch(Exception e) {
				System.out.print("");
			}
			try {
				System.out.print(str2.charAt(j));
			}catch(Exception e) {
				System.out.print("");
			}
		}
	}

}
