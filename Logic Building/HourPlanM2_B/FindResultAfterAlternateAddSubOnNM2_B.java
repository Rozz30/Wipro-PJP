package HourPlanM2_B;

public class FindResultAfterAlternateAddSubOnNM2_B {
	public int addSub(int input1,int input2) {
		int result=input1;
		if(input2==1){
			for(int i=1;i<input1;i++){
				if(i%2!=0){
					result-=input1-i;
				}else{
					result+=input1-i;
				}
			}
		}else if(input2==2){
			for(int i=1;i<input1;i++){
				if(i%2!=0){
					result+=input1-i;
				}else{
					result-=input1-i;
				}
			}
		}
		return result;
	}
}
