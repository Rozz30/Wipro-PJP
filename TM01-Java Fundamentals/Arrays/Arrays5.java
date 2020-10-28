//Write a program to find the largest 2 numbers and the smallest 2 numbers in the given array.


import java.util.Arrays;

public class Arrays5 {

	public static void main(String[] args) {
		int[] nums= {23,12,67,45,90,9,123,567,34,54,5,3};
		Arrays.parallelSort(nums);
		System.out.println("Smallest 2 numbers: "+nums[0]+" "+nums[1]);
		System.out.println("Largest 2 numbers: "+nums[nums.length-1]+" "+nums[nums.length-2]);

	}

}
