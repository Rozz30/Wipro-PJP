package HourPlanM2_B;

public class CalculateSumOfNonPrimeIndexValuesM2_B {
	public int calculateSumOfNonPrimeIndexValues(int[] input1,int input2) {
		int sum=0;
		for(int i=0;i<input2;i++){
			if(i==0 || i==1){
				sum+=input1[i];
				continue;
			}
			if(i==2 ||i==3){
				continue;
			}
			boolean flag=false;
			for(int j=2;j<=i/2;j++){
				if(i%j==0){
					flag=true;
					break;
				}
			}
			if(flag==true){
				sum+=input1[i];
			}
		}
		return sum;
	}
}
