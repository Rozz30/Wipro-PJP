package HourPlanM1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class IsPalindromePossibleM1 {
	public int isPalinNumPossible(int input1) {
		HashMap<Integer,Integer> map=new HashMap<>();
		while(input1!=0){
			int last=input1%10;
			if(!map.containsKey(last)){
				map.put(last, 1);
			}else{
				int val=map.get(last)+1;
				map.put(last, val);
			}
			input1/=10;
		}
		Set<Entry<Integer,Integer>> set= map.entrySet();
		int flag=1;
		if(map.size()%2==0){
			Iterator<Entry<Integer,Integer>> itr=set.iterator();
			while(itr.hasNext()){
				Entry<Integer,Integer> e=itr.next();
				if(e.getValue()%2!=0){
					flag=0;
					break;
				}
			}
		}else{
			Iterator<Entry<Integer,Integer>> itr=set.iterator();
			int even=0;
			int odd=0;
			while(itr.hasNext()){
				Entry<Integer,Integer> e=itr.next();
				if(e.getValue()%2==0){
					++even;
				}else{
					++odd;
				}
			}
			if(even%2!=0){
				flag=0;
			}else if(odd%2==0){
				flag=0;
			}
		}
		if(flag==1){
			return 2;
		}else{
			return 1;
		}
	}
}
