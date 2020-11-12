package HourPlanM1;

public class NthPrimeM1 {
	public int nthPrime(int input1) {
		int n=2;
		int[] primes=new int[input1];
		if(input1==1){
			return 2;
		}else if(input1==2){
			return 3;
		}
		for(int i=4;;i++){
			int flag=1;
			for(int j=2;j<i;j++){
				if(i%j==0){
					flag=0;
					break;
				}
			}
			if(flag==1){
				primes[n++]=i;
			}
			if(n==input1){
				break;
			}
		}
		return primes[input1-1];
	}
}
