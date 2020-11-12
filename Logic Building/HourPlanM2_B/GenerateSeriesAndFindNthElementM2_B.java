package HourPlanM2_B;

import java.util.ArrayList;

public class GenerateSeriesAndFindNthElementM2_B {
	public int seriesN(int input1,int input2,int input3,int input4) {
		int diff1=input1-input2;
		int diff2=input2-input3;
		ArrayList<Integer> series=new ArrayList<>();
		series.add(input1);
		series.add(input2);
		series.add(input3);
		int val=0;
		for(int i=3;i<input4;i++){
			if(i%2!=0){
				val=series.get(i-1)-diff1;
				series.add(val);
			}else{
				val=series.get(i-1)-diff2;
				series.add(val);
			}
		}
		for(int x:series){
			System.out.print(x+" ");
		}
		return series.get(input4-1);
	}
}
