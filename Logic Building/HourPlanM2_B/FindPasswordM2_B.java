package HourPlanM2_B;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class FindPasswordM2_B {
	public int findPassword(int input1,int input2,int input3,int input4,int input5) {
		ArrayList<Integer> stable=new ArrayList<>();
		ArrayList<Integer> unstable= new ArrayList<>();
		int a=input1;
		HashMap<Integer,Integer> map1=new HashMap<Integer,Integer>();
		while(a!=0){
			int last=a%10;
			if(!map1.containsKey(last)){
				map1.put(last, 1);
			}else{
				int val=map1.get(last)+1;
				map1.put(last, val);
			}
			a/=10;
		}
		Set<Entry<Integer,Integer>> set1=map1.entrySet();
		Iterator<Entry<Integer,Integer>> itr1=set1.iterator();
		boolean flag1=true;
		while(itr1.hasNext() && flag1){
			int currVal=0;
			int nextVal=0;
			Entry<Integer,Integer> e1=itr1.next();
			currVal=e1.getValue();
			if(itr1.hasNext()) {
				Entry<Integer,Integer> e2=itr1.next();
				 nextVal=e2.getValue();
			}
			
			if(nextVal!=0 && currVal!=nextVal) {
				flag1=false;
				break;
			}
			
		}
		if(flag1==true){
			stable.add(input1);
			System.out.println("Stable");
		}else{
			unstable.add(input1);
			System.out.println("Unstable");
		}
		
		int b=input2;
		HashMap<Integer,Integer> map2=new HashMap<Integer,Integer>();
		while(b!=0){
			int last=b%10;
			if(!map2.containsKey(last)){
				map2.put(last, 1);
			}else{
				int val=map2.get(last)+1;
				map2.put(last, val);
			}
			b/=10;
		}
		Set<Entry<Integer,Integer>> set2=map2.entrySet();
		Iterator<Entry<Integer,Integer>> itr2=set2.iterator();
		boolean flag2=true;
		while(itr2.hasNext() && flag2){
			int currVal=0;
			int nextVal=0;
			Entry<Integer,Integer> e1=itr2.next();
			currVal=e1.getValue();
			if(itr2.hasNext()) {
				Entry<Integer,Integer> e2=itr2.next();
				 nextVal=e2.getValue();
			}
			
			if(nextVal!=0 && currVal!=nextVal) {
				flag2=false;
				break;
			}
			
		}
		if(flag2==true){
			stable.add(input2);
			System.out.println("Stable");
		}else{
			unstable.add(input2);
			System.out.println("Unstable");
		}
		
		int c=input3;
		HashMap<Integer,Integer> map3=new HashMap<Integer,Integer>();
		while(c!=0){
			int last=c%10;
			if(!map3.containsKey(last)){
				map3.put(last, 1);
			}else{
				int val=map3.get(last)+1;
				map3.put(last, val);
			}
			 c/=10;
		}
		Set<Entry<Integer,Integer>> set3=map3.entrySet();
		Iterator<Entry<Integer,Integer>> itr3=set3.iterator();
		boolean flag3=true;
		while(itr3.hasNext() && flag3){
			int currVal=0;
			int nextVal=0;
			Entry<Integer,Integer> e1=itr3.next();
			currVal=e1.getValue();
			if(itr3.hasNext()) {
				Entry<Integer,Integer> e2=itr3.next();
				 nextVal=e2.getValue();
			}
			
			if(nextVal!=0 && currVal!=nextVal) {
				flag3=false;
				break;
			}
			
		}
		if(flag3==true){
			stable.add(input3);
			System.out.println("Stable");
		}else{
			unstable.add(input3);
			System.out.println("Unstable");
		}
		
		
		int d=input4;
		HashMap<Integer,Integer> map4=new HashMap<Integer,Integer>();
		while(d!=0){
			int last=d%10;
			if(!map4.containsKey(last)){
				map4.put(last, 1);
			}else{
				int val=map4.get(last)+1;
				map4.put(last, val);
			}
			d/=10;
		}
		Set<Entry<Integer,Integer>> set4=map4.entrySet();
		Iterator<Entry<Integer,Integer>> itr4=set4.iterator();
		boolean flag4=true;
		while(itr4.hasNext() && flag4){
			int currVal=0;
			int nextVal=0;
			Entry<Integer,Integer> e1=itr4.next();
			currVal=e1.getValue();
			if(itr4.hasNext()) {
				Entry<Integer,Integer> e2=itr4.next();
				 nextVal=e2.getValue();
			}
			
			if(nextVal!=0 && currVal!=nextVal) {
				flag4=false;
				break;
			}
			
		}
		if(flag4==true){
			stable.add(input4);
			System.out.println("Stable");
		}else{
			unstable.add(input4);
			System.out.println("Unstable");
		}
		
		int e=input5;
		HashMap<Integer,Integer> map5=new HashMap<Integer,Integer>();
		while(e!=0){
			int last=e%10;
			if(!map5.containsKey(last)){
				map5.put(last, 1);
			}else{
				int val=map5.get(last)+1;
				map5.put(last, val);
			}
			e/=10;
		}
		Set<Entry<Integer,Integer>> set5=map5.entrySet();
		Iterator<Entry<Integer,Integer>> itr5=set5.iterator();
		boolean flag5=true;
		while(itr5.hasNext() && flag5){
			int currVal=0;
			int nextVal=0;
			Entry<Integer,Integer> e1=itr5.next();
			currVal=e1.getValue();
			if(itr5.hasNext()) {
				Entry<Integer,Integer> e2=itr5.next();
				 nextVal=e2.getValue();
			}
			
			if(nextVal!=0 && currVal!=nextVal) {
				flag5=false;
				break;
			}
			
		}
		if(flag5==true){
			stable.add(input5);
			System.out.println("Stable");
		}else{
			unstable.add(input5);
			System.out.println("Unstable");
		}
		
		System.out.println(stable);
		System.out.println(unstable);
		int sum=0;
		for(int i=0;i<stable.size();i++) {
			sum+=stable.get(i);
		}
		for(int i=0;i<unstable.size();i++) {
			sum-=unstable.get(i);
		}
		System.out.println(sum);
		return sum;
		
	}
}
