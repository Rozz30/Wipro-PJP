package HourPlanM1;

public class NoOfPrimesInARangeM1 {
	public int countPrimesInRange(int input1,int input2) {
		int count=0;
		for(int i=input1;i<=input2;i++){
			int flag=1;
			if(i==2){
				++count;
				//System.out.println(i);
				continue;
			}
			if(i==3){
				++count;
				//System.out.println(i);
				continue;
			}
			for(int j=2;j<=i/2;j++){
				if(i%j==0){
					flag=0;
					break;
				}
			}
			if(flag==1){
				//System.out.println(i);
				++count;
			}
		}
		return count;
	}
}
