package HourPlanM2_B;

import java.util.ArrayList;
import java.util.Collections;

public class TheNambiarNumberGeneratorM2_B {
	public int nnGenerator(String input1) {
		ArrayList<Integer> digits=new ArrayList<>();
		long input=Long.parseLong(input1);
		while(input!=0){
			long last=input%10;
			digits.add((int)last);
			input/=10;
		}
		Collections.reverse(digits);
		System.out.println(digits);
		StringBuilder answer=new StringBuilder();
		
		for(int i=0;i<digits.size();i++){
			if(digits.get(i)%2==0){
				long sum=digits.get(i);
				while(sum%2==0 && i+1<digits.size()){
					sum+=digits.get(++i);
				}
				System.out.println(sum);
				answer.append(sum);
			}else if(digits.get(i)%2!=0){
				long sum=digits.get(i);
				while(sum%2!=0 && i+1<digits.size()){
					sum+=digits.get(++i);
				}
				System.out.println(sum);
				answer.append(sum);
			}
		}
		System.out.println("Answer:"+answer);
		String str=answer.toString();
		return Integer.parseInt(str);
	}
}
