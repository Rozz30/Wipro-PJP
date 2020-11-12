package HourPlanM1;

public class SumOfAllDigitsInNM1 {
	public int digitSum(int input1) {
		int flag=0;
		if(input1<0){
			input1*=-1;
			flag=1;
		}
		int sum=0;
		while(input1!=0){
			sum+=input1%10;
			input1/=10;
			if(input1==0 && sum>9){
				input1=sum;
				sum=0;
			}
		}
		return flag==1?sum*-1:sum;
	}
}
