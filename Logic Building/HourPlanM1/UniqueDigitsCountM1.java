package HourPlanM1;

import java.util.HashSet;
import java.util.Set;

public class UniqueDigitsCountM1 {
	public int uniqueDigitsCount(int input1) {
		Set<Integer> uniqueDigits= new HashSet<Integer>();
		while(input1!=0){
			uniqueDigits.add(input1%10);
			input1/=10;
		}
		return uniqueDigits.size();
	}
}
