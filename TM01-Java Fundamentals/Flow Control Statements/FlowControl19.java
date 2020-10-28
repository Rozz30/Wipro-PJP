//Write a program to print first 5 values which are divisible by 2, 3, and 5.


public class FlowControl19 {

	public static void main(String[] args) {
		int count=5;
		int value=1;
		while(count!=0) {
			if(value%2==0 && value%3==0 && value%5==0) {
				System.out.println(value);
				count--;
			}
			value++;
		}

	}

}
