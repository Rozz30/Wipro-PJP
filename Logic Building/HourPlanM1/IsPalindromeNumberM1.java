package HourPlanM1;

public class IsPalindromeNumberM1 {
	public int isPalinNum(int input1) {
		String str=Integer.toString(input1);
		for(int i=0,j=str.length()-1;i<j;i++,j--){
			if(str.charAt(i)!=str.charAt(j)){
				return 1;
			}
		}
		return 2;
	}
}
