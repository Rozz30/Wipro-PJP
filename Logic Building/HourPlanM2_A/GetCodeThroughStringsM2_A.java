package HourPlanM2_A;

public class GetCodeThroughStringsM2_A {
	public int getCodeThroughStrings(String input1) {
		String[] str= input1.trim().split(" ");
		int len=0;
		for(String x:str){
			len+=x.length();
		}
		int pin=0;
		while(len>9){
			int last=len%10;
			pin+=last;
			len/=10;
		}
		pin+=len;
		return pin;
	}
}
