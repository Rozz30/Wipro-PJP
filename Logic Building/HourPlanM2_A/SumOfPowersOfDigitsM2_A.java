package HourPlanM2_A;

import java.util.ArrayList;
import java.util.Collections;

public class SumOfPowersOfDigitsM2_A {
	public int sumOfPowerOfDigits(int input1) {
		int sum=0;
		int power=0;
		ArrayList<Integer> digits=new ArrayList<Integer>();
		while(input1!=0){
			digits.add(input1%10);
			input1/=10;
		}
		Collections.reverse(digits);
		System.out.print(digits);
		for(int i=0;i<digits.size();i++){
			if(i+1<digits.size()){
				power=(int)Math.pow(digits.get(i), digits.get(i+1));
				sum+=power;				
			}	
		}
		sum+=1;
		return sum;
	}
}
