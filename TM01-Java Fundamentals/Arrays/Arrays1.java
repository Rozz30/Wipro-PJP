//Write a program to initialize an integer array and print the sum and average of the array.

public class Arrays1 {

	public static void main(String[] args) {
		int[] nums= {2,6,8,10,15};
		int sum=0;
		float avg=0;
		for(int i=0;i<nums.length;i++) {
			sum+=nums[i];
			avg=(float)sum/nums.length;
		}
		System.out.println("Sum="+sum);
		System.out.println("Average="+avg);

	}

}
