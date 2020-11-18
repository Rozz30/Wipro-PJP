
public class StringOperations {
	StringBuilder sb;
	int count=0;
	public StringBuilder firstOp(String s1,String s2) {
		sb=new StringBuilder("");
		for(int i=0;i<s1.length();i++) {
			if(i%2==0) {
				sb.append(s2);
			}else {
				sb.append(s1.charAt(i));
			}
		}
		return sb;
	}
	
	public StringBuilder secondOp(String s1,String s2) {
		sb= new StringBuilder("");
		for(int i=0;i<s1.length();i++) {
			if(s1.substring(i, i+(s2.length())).equals(s2)) {
				count+=1;
				i+=s2.length()-1;
			}
		}
		if(count<1) {
			sb.append(s1).append(s2);
			
		}else if(count>1) {
			int sIndex=s1.lastIndexOf(s2);
			for(int i=0;i<sIndex;i++) {
				sb.append(s1.charAt(i));
			}
			for(int j=s2.length()-1;j>=0;j--) {
				sb.append(s2.charAt(j));
			}
		}
		if(sb.length()!=s1.length()) {
			for(int k=sb.length();k<s1.length();k++) {
				sb.append(s1.charAt(k));
			}
		}
		return sb;
	}
	
	public StringBuilder thirdOp(String s1,String s2) {
		sb= new StringBuilder("");
		if(count>1) {
			int sIndex= s1.indexOf(s2);
			for(int i=0;i<sIndex;i++) {
				sb.append(s1.charAt(i));
			}
			for(int j=sIndex+s2.length();j<s1.length();j++) {
				sb.append(s1.charAt(j));
			}
		}else {
			sb.append(s1);
		}
		return sb;
	}
	
	public StringBuilder fourthOp(String s1,String s2) {
		sb= new StringBuilder("");
		String firstHalf;
		String secondHalf;
		if(s2.length()%2==0) {
			firstHalf=s2.substring(0, s2.length()/2);
			secondHalf=s2.substring(s2.length()/2);
		}else {
			firstHalf=s2.substring(0, s2.length()/2+1);
			secondHalf=s2.substring(s2.length()/2+1);
		}
		sb.append(firstHalf).append(s1).append(secondHalf);
		return sb;
	}
	
	public StringBuilder fifthOp(String s1,String s2) {
		sb= new StringBuilder("");	
		//String s1Dummy= s1;
		for(int i=0;i<s1.length();i++) {
			boolean check=false;
			for(int j=0;j<s2.length();j++) {
				if(s1.charAt(i)==s2.charAt(j)) {
					check=true;
					break;
				}
			}	
			if(check) {
				sb.append('*');
			}else {
				sb.append(s1.charAt(i));
			}
			
		}
		return sb;
	}
}
