package HourPlanM2_B;

public class FindTheOneDigitToBeRemovedToFormPalindromeM2_B {
	public int removeDigit_Palin(int input1) {
		String str=String.valueOf(input1);
		System.out.println("Str:"+str);
		for(int i=0,j=str.length()-1;i<j;){
			if(str.charAt(i)==str.charAt(j)){
				++i;
				--j;
				continue;
			}else{
				++i;
				if(str.charAt(i)==str.charAt(j)){
					System.out.print(str.charAt(i-1));
					return Character.getNumericValue(str.charAt(i-1));
				}else{
					--i;
					--j;
					if(str.charAt(i)==str.charAt(j)){
						System.out.print(str.charAt(j+1));
						return Character.getNumericValue(str.charAt(j+1));
					}
				}
			}
		}
		return -1;
	}
}
