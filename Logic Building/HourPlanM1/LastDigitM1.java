package HourPlanM1;

public class LastDigitM1 {
	public int lastDigit(int input1) {
		int a=input1%10;
		if(a<0) {
			a*=-1;
		}
		return a;
	}
}
