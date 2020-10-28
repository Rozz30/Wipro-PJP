/*Given two strings a and b, return a new string, following the rules given below. 
If string b occurs in string a, then the new string should concatenate the characters that appear before 
and after of String b.
Ignore cases where there is no character before or after the word, 
and a character may be included twice if it is in between two string b's.
Example1)
i/p:abcXY123XYijk,XY
o/p:c13i
Example2)
i/p:XY123XY,XY
o/p:13
Example3)
i/p:XY1XY,XY
o/p:11
*/


import java.util.Scanner;
import java.io.InputStreamReader;
public class StringStringBuilder11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder(32);
		System.out.println("Enter two strings in seperate lines.");
		String a=input.next();
		String b=input.next();
		for(int i=0;i<a.length();i++) {
			int bIndex=0;
			int flag=0;
			for(int j=i;j<i+b.length();j++) {
				if(a.charAt(j)==b.charAt(bIndex)) {
					flag++;
					bIndex++;
				}else {
					break;
				}
				if(flag==b.length()) {
					if(j-b.length()>0)
						sb.append(a.charAt(j-b.length()));
					if(j+1<a.length())
						sb.append(a.charAt(j+1));
				}
			}
		}
		System.out.print(sb);
	}

}
