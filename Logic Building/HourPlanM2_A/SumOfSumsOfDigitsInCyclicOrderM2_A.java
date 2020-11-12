package HourPlanM2_A;

import java.util.ArrayList;
import java.util.Collections;

public class SumOfSumsOfDigitsInCyclicOrderM2_A {
	public int sumOfSumsOfDigits(int input1) {
		ArrayList<Integer> digits=new ArrayList<Integer>();
		while(input1!=0){
			digits.add(input1%10);
			input1/=10;
		}
		Collections.reverse(digits);
		int sum=0;
		for(int i=0;i<digits.size();i++){
			for(int j=i;j<digits.size();j++){
				sum+=digits.get(j);
			}
		}
		return sum;
	}
}
