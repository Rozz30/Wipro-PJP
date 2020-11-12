package HourPlanM1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MostFrequentDigitM1 {
	public int mostFrequentDigit(int input1,int input2, int input3, int input4) {
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		if(input1<0){
			input1*=-1;
		}
		if(input2<0){
			input2*=-1;
		}
		if(input3<0){
			input3*=-1;
		}
		if(input4<0){
			input4*=-1;
		}
		while(input1!=0){
			int last=input1%10;
			if(!map.containsKey(last)){
				map.put(last, 1);
			}else{
				int val= map.get(last)+1;
				map.put(last, val);
			}
			input1/=10;
		}
		while(input2!=0){
			int last=input2%10;
			if(!map.containsKey(last)){
				map.put(last, 1);
			}else{
				int val= map.get(last)+1;
				map.put(last, val);
			}
			input2/=10;
		}
		while(input3!=0){
			int last=input3%10;
			if(!map.containsKey(last)){
				map.put(last, 1);
			}else{
				int val= map.get(last)+1;
				map.put(last, val);
			}
			input3/=10;
		}
		while(input4!=0){
			int last=input4%10;
			if(!map.containsKey(last)){
				map.put(last, 1);
			}else{
				int val= map.get(last)+1;
				map.put(last, val);
			}
			input4/=10;
		}
		Set<Entry<Integer,Integer>> set1= map.entrySet();
		Iterator<Entry<Integer,Integer>> itr1= set1.iterator();
		int max=-1;
		int maxCount=0;
		while(itr1.hasNext()){
			Entry<Integer,Integer> e1= itr1.next();
			if(e1.getValue()==max){
				++maxCount;
			}
			if(e1.getValue()>max){
				max=e1.getValue();
				maxCount=1;
			}
		}
		if(maxCount==1){
			Iterator<Entry<Integer,Integer>> itr2= set1.iterator();
			int val=-1;
			while(itr2.hasNext()){
				Entry<Integer,Integer> e2=itr2.next();
				if(e2.getValue()==max){
					val= e2.getKey();
					break;
				}
			}
			return val;
		}else{
			HashSet<Integer> setMax= new HashSet<Integer>();
			Iterator<Entry<Integer,Integer>> itr3= set1.iterator();
			while(itr3.hasNext()){
				Entry<Integer,Integer> e3=itr3.next();
				if(e3.getValue()==max){
					setMax.add(e3.getKey());
				}
			}
			int val=-1;
			Iterator<Integer> itr=setMax.iterator();
			while(itr.hasNext()){
				val=Math.max(val, (int)itr.next());
			}
			return val;
		}
	}
}
