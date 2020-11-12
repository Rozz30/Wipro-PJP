package HourPlanM2_B;

public class UserIdGenerationM2_B {
	public String userIdGeneration(String input1,String input2,int input3,int input4) {
		String smallerN="";
		String longerN="";
		if(input1.length()>input2.length()){
			longerN=input1;
			smallerN=input2;
		}else if(input1.length()<input2.length()){
			smallerN=input1;
			longerN=input2;
		}else{
			for(int i=0;i<input1.length();i++){
				if(input1.charAt(i)<input2.charAt(i)){
					smallerN=input1;
					longerN=input2;
					break;
				}else if(input1.charAt(i)>input2.charAt(i)){
					smallerN=input2;
					longerN=input1;
					break;
				}
			}
		}
		StringBuilder ans=new StringBuilder();
		ans.append(smallerN.charAt(smallerN.length()-1));
		ans.append(longerN);
		System.out.println("NameAns:"+ans);
		StringBuilder answer=new StringBuilder();
		for(int i=0;i<ans.length();i++){
			char c=ans.charAt(i);
			if(c>='a' && c<='z'){
				c=Character.toUpperCase(c);
				answer.append(c);
			}else{
				c=Character.toLowerCase(c);
				answer.append(c);
			}
		}
		String pin=String.valueOf(input3);
		System.out.println("PIN:"+pin);
		answer.append(pin.charAt(input4-1));
		answer.append(pin.charAt(pin.length()-input4));
		System.out.println(answer);
		return answer.toString(); 
	}
}
