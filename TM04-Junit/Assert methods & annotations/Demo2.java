/* i) Create the following class and implement the method to check whether the given string is a palindrome and return the result.

Class Name : Demo2
Method : palindromeCheck(String):boolean

(Hint: A String is palindrome,  If the reversed string is equal to the actual string. Ex: madam, mom, dad, malayalam )
ii) Create a Junit test class to test the above class.*/


public class Demo2 {
	public boolean palindromeCheck(String str) {
		str.toLowerCase();
		for(int i=0,j=str.length()-1;i<j;i++,j--) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
		}
		return true;
	}
}
