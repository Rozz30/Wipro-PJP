package HourPlanM1;

import java.util.ArrayList;

public class NonRepeatedDigitsCountM1 {
	public int nonRepeatDigitsCount(int input1) {
		ArrayList<Integer> digitsList= new ArrayList<Integer>();
		while(input1!=0){
			digitsList.add(input1%10);
			input1/=10;
		}
		int count=0;
		for(int i=0;i<digitsList.size();i++){
			int flag=1;
			for(int j=0;j<digitsList.size();j++){
				if(i!=j && digitsList.get(i)==digitsList.get(j)){
					flag=0;
					break;
				}
			}
			if(flag==1){
				++count;
			}
		}
		return count;
	}
}
