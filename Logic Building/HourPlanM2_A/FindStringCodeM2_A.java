package HourPlanM2_A;


public class FindStringCodeM2_A {
	public int stringCode(String input1) {
		StringBuilder answer= new StringBuilder();
		   String[] str=input1.trim().split(" ");
		   int[] sum=new int[str.length];
		   for(int i=0;i<str.length;i++){
			   String word= str[i].toLowerCase();
			   int diffSum=0;
			   int diff=0;
			   if(word.length()%2==0){
				   for(int j=0,k=word.length()-1;j<k;j++,k--){
					diff= (word.charAt(j)-'a'+1)-(word.charAt(k)-'a'+1);
					diff=Math.abs(diff);
					diffSum+=diff;
			   		}
			   }else{
				   for(int j=0,k=word.length()-1;j<k;j++,k--){
					diff= (word.charAt(j)-'a'+1)-(word.charAt(k)-'a'+1);
					diff=Math.abs(diff);
					diffSum+=diff;
			   		}
					diff=word.charAt(word.length()/2)-'a'+1;
					diff=Math.abs(diff);
					diffSum+=diff;
			   }
			   sum[i]=diffSum;
		   }
		   for(int x:sum){
			   answer.append(x);
		   }
		   return Integer.parseInt(answer.toString());
	}
}
