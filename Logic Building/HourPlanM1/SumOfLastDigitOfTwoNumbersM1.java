package HourPlanM1;

public class SumOfLastDigitOfTwoNumbersM1 {
	public int sumOfLastDigit(int input1,int input2) {
		if(input1<0){
			input1*=-1;
		}
		if(input2<0){
			input2*=-1;
		}
		return input1%10+(input2%10);
	}
}
