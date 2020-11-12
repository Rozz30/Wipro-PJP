package HourPlanM1;

public class IsPalindromeM1 {
	public int isPalindrome(String input1) {
		input1=input1.toLowerCase();
		for(int i=0,j=input1.length()-1;i<j;i++,j--){
			if(input1.charAt(i)!=input1.charAt(j)){
				return 1;
			}
		}
		return 2;
	}
}
