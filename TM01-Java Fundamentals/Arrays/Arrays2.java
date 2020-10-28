//Write a program to initialize an integer array and find the maximum and minimum value of the array.


import java.util.Arrays;

public class Arrays2 {

	public static void main(String[] args) {
		int[] nums= {23,1,0,9,76,100,15,89};
		Arrays.sort(nums);
		System.out.println("Min="+nums[0]);
		System.out.println("Max="+nums[nums.length-1]);

	}

}
