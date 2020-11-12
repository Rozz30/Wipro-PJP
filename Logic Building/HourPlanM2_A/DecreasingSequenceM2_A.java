package HourPlanM2_A;

public class DecreasingSequenceM2_A {
	class Result{
		private final int output1;
		private final int output2;
		Result(int out1,int out2){
			output1=out1;
			output2=out2;
		}
	}
	public Result decreasingSeq(int[] input1,int input2) {
		int noOfSeq=0;
		int longestSeq=1;
		for(int i=0;i<input2;i++){
			int count=1;
			while(i+1<input2 && input1[i+1]<input1[i]){
				++count;
				++i;
			}
			if(count!=1){
				++noOfSeq;
			}
			longestSeq=Math.max(longestSeq,count);
		}
		if(input2==1 || input2==0){
			return new Result(0,0);
		}

		return new Result(noOfSeq,longestSeq);
	}
}
