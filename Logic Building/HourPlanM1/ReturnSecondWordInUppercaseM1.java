package HourPlanM1;

public class ReturnSecondWordInUppercaseM1 {
	public String secondWordUpperCase(String input1) {
		int a=0;
		int b=0;
		String sWord=null;
		for(int i=0;i<input1.length();i++){
			if(input1.charAt(i)==' ' && a==0){
				a=i;
				continue;
			}
			if(input1.charAt(i)==' ' && b==0){
				b=i;
				break;
			}
		}
		if(a!=0 && b!=0){
			sWord=input1.substring(a+1, b);
		}else if(a!=0 && b==0){
			sWord=input1.substring(a+1);
		}else if(a==0 && b==0){
			return "LESS";
		}

		return sWord.toUpperCase();
	}
}
