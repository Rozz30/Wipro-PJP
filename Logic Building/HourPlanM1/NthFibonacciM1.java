package HourPlanM1;

public class NthFibonacciM1 {
	public int nthFibonacci(int input1) {
		int a=0;
		int b=1;
		if(input1==1){
			return a;
		}else if(input1==2){
			return b;
		}
		for(int i=3;i<=input1;i++){
			int temp=b;
			b=a+b;
			a=temp;
		}
		return b;
	}
}
