/*Write a program to remove the duplicate elements in an array and print the same.
Example)
I/P:{12,34,12,45,67,89}
O/P:{12,34,45,67,89}
*/

import java.util.ArrayList;
import java.util.List;

public class Arrays7{
	public static void main(String[] args) {
		int[] nums= {12,34,12,45,67,89};
		List<Integer> list= new ArrayList<Integer>();
		for(int i=0;i<nums.length;i++) {
			if(list.contains(nums[i])) {
				continue;
			}else {
				list.add(nums[i]);
			}
		}
		System.out.print(list);
	}
}