package HourPlanM1;

public class SecondLastDigitM1 {
	public int secondLastDigitOf(int input1) {
		if(input1<9 && input1>-9){
			return -1;
		}else{
			input1/=10;
			input1%=10;
			if(input1<0){
				return	input1*=-1;
			}else{
				return input1;
			}
		}
	}
}
