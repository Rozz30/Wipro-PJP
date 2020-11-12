package HourPlanM2_A;

public class SimpleEncodedArrayM2_A {
	class Result{
		private int output1;
		private int output2;
		Result(int out1,int out2){
			output1=out1;
			output2=out2;
		}
	}
	
	////main content
	public Result findOriginalFirstAndSum(int[] input1,int input2) {
		int[] originalArr= new int[input2];
		originalArr[input2-1]=input1[input2-1];
		for(int i=input2-2;i>=0;i--){
			originalArr[i]=input1[i]-originalArr[i+1];
		}
		for(int x:originalArr){
			System.out.print(x+" ");
		}
		int sum=0;
		for(int x:originalArr){
			sum+=x;
		}
		Result result= new Result(originalArr[0],sum);
		return result;
	}
}
