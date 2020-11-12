package HourPlanM2_A;

public class AdditionUsingStringsM2_A {
	public String addNumberStrings(String input1,String input2) {
		StringBuilder input1Rev=new StringBuilder();
		StringBuilder input2Rev=new StringBuilder();
		StringBuilder answer= new StringBuilder();
		input1Rev.append(input1);
		input1Rev.reverse();
		input2Rev.append(input2);
		input2Rev.reverse();
		if(input1.length()>input2.length()){
			for(int i=input2.length();i<input1.length();i++){
				input2Rev.append("0");
			}
		}else{
			for(int i=input1.length();i<input2.length();i++){
				input1Rev.append("0");
			}
		}
		System.out.println(input1Rev);
		System.out.println(input2Rev);
		
		int carry=0;
		int i=0;
		while(i<input1Rev.length()){
			int sum=0;
			sum=Integer.parseInt(String.valueOf(input1Rev.charAt(i)))+Integer.parseInt(String.valueOf(input2Rev.charAt(i)))+carry;
			carry=sum/10;
			sum=sum%10;
			System.out.println(sum);
			answer.append(sum);
			++i;
		}
		if(carry!=0){
			answer.append(carry);
		}
		answer.reverse();
		System.out.println(answer);
		return answer.toString();
	}
}
