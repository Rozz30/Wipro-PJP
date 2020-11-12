package HourPlanM1;

public class WeightOfString {
	public int weightofString(String input1,int input2) {
		input1=input1.toLowerCase();
		int weight=0;
		if(input2==1){
			for(int i=0;i<input1.length();i++){
				if(input1.charAt(i)>='a'  && input1.charAt(i)<='z'){
					weight+=input1.charAt(i)-'a'+1;
					System.out.println(weight);
				}		
			}
		}else{
			for(int i=0;i<input1.length();i++){
				if(input1.charAt(i)>='b' && input1.charAt(i)<='z'){
					if(input1.charAt(i)!='a'&& input1.charAt(i)!='e' && input1.charAt(i)!='i'&& input1.charAt(i)!='o'&& input1.charAt(i)!='u'){
						weight+=input1.charAt(i)-'a'+1;
						System.out.println(weight);
					}
					
				}		
			}
		}
		return weight;
	}
}
