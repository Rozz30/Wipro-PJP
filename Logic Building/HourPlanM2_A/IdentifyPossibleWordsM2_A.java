package HourPlanM2_A;

import java.util.ArrayList;

public class IdentifyPossibleWordsM2_A {
	public String identifyPossibleWords(String input1,String input2) {
		StringBuilder answer= new StringBuilder();
		input1=input1.toUpperCase();
		int index= input1.indexOf("_");
		String prefix=input1.substring(0, index);
		String suffix=input1.substring(index+1);
		String[] words=input2.trim().split(":");
		ArrayList<String> list=new ArrayList<>();
		for(String x:words){
			x=x.toUpperCase();
			if(x.length()==input1.length()){
				list.add(x);
			}
		}
		for(int i=0;i<list.size();i++){
			String pre=list.get(i).substring(0,index);
			String suf=list.get(i).substring(index+1);
			if(prefix.equals(pre) && suffix.equals(suf)){
				answer.append(list.get(i)+":");
			}
		}
		if(answer.length()==0){
			return "ERROR-009";
		}
		String str=answer.toString();
		str=str.substring(0, str.length()-1);
		return str;
	}
}
