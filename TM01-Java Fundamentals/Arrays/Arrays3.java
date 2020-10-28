/*Write a program to initialize an integer array with values and check if a given number is present in the array or not.
If the number is not found, it will print -1 else it will print the index value of the given  number in the array.
Example 1) If the Array elements are  {1,4,34,56,7} and the search element is 90, then the output expected is -1.
Example 2)If the Array elements are  {1,4,34,56,7} and the search element is 56, then the output expected is 3.
*/


import java.util.Scanner;
public class Arrays3 {

	public static void main(String[] args) {
		int[] nums= {1,4,34,56,7};
		System.out.println("Enter the search element:");
		Scanner input=new Scanner(System.in);
		int x=input.nextInt();
		int count=0;
		for(int i=0;i<nums.length;i++) {
			if(x==nums[i]) {
				System.out.println(i);
				count=1;
				break;
			}
		}
		if(count==0) System.out.println("-1");
		input.close();
	}

}
