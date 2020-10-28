//Write a program to initialize an array and print them in a sorted order.



import java.util.Arrays;

public class Arrays6 {

	public static void main(String[] args) {
		int[] nums= {23,12,67,45,90,9,123,567,34,54,5,3};
		Arrays.sort(nums);
		for(int x:nums) {
			System.out.print(x+" ");
		}

	}

}
