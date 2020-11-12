package HourPlanM1;

public class SumOfOddDigitsInNM1 {
	public int oddDigitsSum(int input1) {
		int sum=0;
		while(input1!=0){
			if(input1%10%2!=0)
				sum+=input1%10;
			input1/=10;
		}
		return sum;
	}
}
