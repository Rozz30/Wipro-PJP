package HourPlanM1;

public class CreatePinUsingAlphaBetaGammaM1 {
	public int createPin(int input1,int input2,int input3) {
		int[] digits=new int[9];
		for(int i=0;i<3;i++){
			digits[i]=input1%10;
			input1/=10;
		}
		for(int i=3;i<6;i++){
			digits[i]=input2%10;
			input2/=10;
		}
		for(int i=6;i<9;i++){
			digits[i]=input3%10;
			input3/=10;
		}
		int ones=Math.min(digits[0],Math.min(digits[3],digits[6]));
		int tens=Math.min(digits[1],Math.min(digits[4],digits[7]));
		int hundreds=Math.min(digits[2],Math.min(digits[5],digits[8]));
		int thousands=0;
		for(int i=0;i<9;i++){
			thousands= Math.max(thousands,digits[i]);
		}

		return thousands*1000+hundreds*100+tens*10+ones;
	}
}
