/*Write a Java program to find if the given number is palindrome or not
Example1)
C:\>java Sample 110011
O/P: 110011 is a palindrome
Example2)
C:\>java Sample 1234
O/P: 1234 is not a palindrome
*/


public class FlowControl18 {

	public static void main(String[] args) {
		if(args.length==0) {
			System.out.println("Pleas enter Command Line Argument");
		}
		int num=Integer.parseInt(args[0]);
		int dum=num;
		int rev=0;
		while(dum>0) {
			rev=(rev*10)+(dum%10);
			dum/=10;
		}
		if(rev==num) {
			System.out.println(num+" is a palindrome");
		}else {
			System.out.println(num+" is not a palindrome");
		}
	}

}
