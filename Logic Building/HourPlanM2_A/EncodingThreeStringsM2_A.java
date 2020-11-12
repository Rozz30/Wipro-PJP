package HourPlanM2_A;

public class EncodingThreeStringsM2_A {
	class Result{
		private final String output1;
		private final String output2;
		private final String output3;
		Result(String out1,String out2, String out3){
			output1=out1;
			output2=out2;
			output3=out3;
		}
	}
	public Result encodingThreeStrings(String input1, String input2,String input3) {
		String[] front=new String[3];
		String[] middle=new String[3];
		String[] end= new String[3];
        if(input1.length()%3==0){
			int len= input1.length()/3;
			front[0]=input1.substring(0, len);
			middle[0]=input1.substring(len,2*len);
			end[0]=input1.substring(2*len);
		}else if(input1.length()%3==1){
			int len=input1.length()/3;
			front[0]=input1.substring(0, len);
			middle[0]=input1.substring(len,2*len+1);
			end[0]=input1.substring(2*len+1);
		}else if(input1.length()%3==2){
			int len=input1.length()/3;
			front[0]=input1.substring(0, len+1);
			middle[0]=input1.substring(len+1,2*len+1);
			end[0]=input1.substring(2*len+1);
		}
		if(input2.length()%3==0){
			int len= input2.length()/3;
			front[1]=input2.substring(0, len);
			middle[1]=input2.substring(len,2*len);
			end[1]=input2.substring(2*len);
		}else if(input2.length()%3==1){
			int len=input2.length()/3;
			front[1]=input2.substring(0, len);
			middle[1]=input2.substring(len,2*len+1);
			end[1]=input2.substring(2*len+1);
		}else if(input2.length()%3==2){
			int len=input2.length()/3;
			front[1]=input2.substring(0, len+1);
			middle[1]=input2.substring(len+1,2*len+1);
			end[1]=input2.substring(2*len+1);
		}
		if(input3.length()%3==0){
			int len= input3.length()/3;
			front[2]=input3.substring(0, len);
			middle[2]=input3.substring(len,2*len);
			end[2]=input3.substring(2*len);
		}else if(input3.length()%3==1){
			int len=input3.length()/3;
			front[2]=input3.substring(0, len);
			middle[2]=input3.substring(len,2*len+1);
			end[2]=input3.substring(2*len+1);
		}else if(input3.length()%3==2){
			int len=input3.length()/3;
			front[2]=input3.substring(0, len+1);
			middle[2]=input3.substring(len+1,2*len+1);
			end[2]=input3.substring(2*len+1);
		}
		StringBuilder out1=new StringBuilder();
		for(String x:front){
			out1.append(x);
		}
		System.out.println(out1);
		StringBuilder out2=new StringBuilder();
		for(String x:middle){
			out2.append(x);
		}
		System.out.println(out2);
		StringBuilder out3=new StringBuilder();
		for(String x:end){
			out3.append(x);
		}
		System.out.println(out3);
		StringBuilder out4=new StringBuilder();
		for(int i=0;i<out3.length();i++){
				char letter=out3.charAt(i);
				if(letter>='A' && letter<='Z'){
					letter=Character.toLowerCase(letter);
					out4.append(letter);
				}else{
					letter=Character.toUpperCase(letter);
					out4.append(letter);
				}
					
		}
		System.out.println(out4);
		return new Result(out1.toString(),out2.toString(),out4.toString());
	}
}
