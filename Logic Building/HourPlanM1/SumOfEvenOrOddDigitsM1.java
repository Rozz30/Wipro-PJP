package HourPlanM1;

public class SumOfEvenOrOddDigitsM1 {
	public int evenOddDigitsSum(int input1,String input2) {
		int sum=0;
		if(input2.equals("odd")){
			while(input1!=0){
				if(input1%10%2!=0)
					sum+=input1%10;
				input1/=10;
			}
		}else if(input2.equals("even")){
			while(input1!=0){
				if(input1%10%2==0)
					sum+=input1%10;
				input1/=10;
			}
		}
		return sum;
	}
}
