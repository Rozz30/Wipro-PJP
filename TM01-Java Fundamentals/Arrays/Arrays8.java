/*Write a program to print the sum of the elements of an array following the given below condition.
If the array has 6 and 7 in succeeding orders, ignore the numbers between 6 and 7 and consider the other numbers for calculation of sum.
Eg1) Array Elements - 10,3,6,1,2,7,9
O/P: 22   
[i.e 10+3+9]
Eg2) Array Elements - 7,1,2,3,6
O/P:19
Eg3) Array Elements - 1,6,4,7,9
O/P:10
*/


public class Arrays8 {

	public static void main(String[] args) {
		int[] nums= {10,3,6,1,2,7,9};
		//int[] nums= {7,1,2,3,6};
		//int[] nums= {1,6,4,7,9};
		int sum=0;
		int left=0,right=0,flag=0;
		for(int i=0,j=nums.length-1;i<j;i++,j--) {
			if(nums[i]==6) {
				flag+=1;
				left=i;
			}
			if(nums[j]==7) {
				flag+=1;
			    right=j;
			}
		}
		if(flag==2) {
			for(int i=0;i<left;i++) {
				sum+=nums[i];
			}
			for(int j=right+1;j<nums.length;j++) {
				sum+=nums[j];
			}
		}else {
			for(int i=0;i<nums.length;i++) {
				sum+=nums[i];
			}
		}
		System.out.println("Sum = "+sum);


	}

}
