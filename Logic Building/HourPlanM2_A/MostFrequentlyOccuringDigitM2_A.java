package HourPlanM2_A;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class MostFrequentlyOccuringDigitM2_A {
	public int mostFrequentlyOccurringDigit(int[] input1,int input2) {
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<input2;i++){
			while(input1[i]!=0){
				int last=input1[i]%10;
				if(!map.containsKey(last)){
					map.put(last,1);
				}else{
					int value=map.get(last);
					map.put(last,value+1);
				}
				input1[i]/=10;
			}
		}
		Set<Entry<Integer,Integer>> digitsSet=map.entrySet();
		Iterator<Entry<Integer,Integer>> digitItr=digitsSet.iterator();
		int max=0;
		int maxCount=0;
		while(digitItr.hasNext()){
			Entry<Integer,Integer> e=digitItr.next();
			if(e.getValue()>max){
				max=e.getValue();
			}
		}
		digitItr=digitsSet.iterator();
		while(digitItr.hasNext()){
			Entry<Integer,Integer> e=digitItr.next();
			if(e.getValue()==max){
				++maxCount;
			}
		}
		if(maxCount==1){
			digitItr=digitsSet.iterator();
			int key=0;
			while(digitItr.hasNext()){
				Entry<Integer,Integer> e=digitItr.next();
				if(e.getValue()==max){
					key= e.getKey();
					break;
				}
			}
			return key;
		}else{
			TreeSet<Integer> maxSet=new TreeSet<Integer>();
			digitItr=digitsSet.iterator();
			while(digitItr.hasNext()){
				Entry<Integer,Integer> e=digitItr.next();
				if(e.getValue()==max){
					maxSet.add(e.getKey());
				}
			}
			return maxSet.last();
		}
	}
}
