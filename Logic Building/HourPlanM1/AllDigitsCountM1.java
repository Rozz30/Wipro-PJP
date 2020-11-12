package HourPlanM1;

public class AllDigitsCountM1 {
	public int allDigitsCount(int input1) {
		int count=0;
		while(input1!=0){
			input1/=10;
			++count;
		}
		return count;
	}
}
