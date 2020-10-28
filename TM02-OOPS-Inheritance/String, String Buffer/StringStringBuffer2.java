/*Write a java program that will concatenate 2 strings and return the result. 
The result should be in lowercase.
Note:If the concatenation creates a double-char, then one of the characters need to be omitted.
Example1)
i/p:Sachin,Tendulkar
o/p:sachin tendulkar
Example2)
i/p:Mark,kate
o/p:markate
*/



import java.util.Scanner;
import java.io.InputStreamReader;
public class StringStringBuffer2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(new InputStreamReader(System.in));
		System.out.println("Enter first string:");
		String str1=input.next().toLowerCase();
		System.out.println("Enter second string:");
		String str2=input.next().toLowerCase();
		int flag=0;
		if(str1.charAt(str1.length()-1)==str2.charAt(0)) {
			flag=1;
		}
		if(flag==1) {
			str2=str2.substring(flag);
			System.out.println("Concatenated Strings:"+"\n"+str1+str2);
		}else {
			System.out.println("Concatenated Strings:"+"\n"+str1+" "+str2);
		}

	}

}
