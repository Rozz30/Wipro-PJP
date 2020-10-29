/* Write a class MathOperation which accepts 5 integers through command line. 
 Create an array using these parameters. Loop through the array and obtain the sum and average of all the elements and display the result. 
 Various exceptions that may arise like ArithmeticException, NumberFormatException, and so on should be handled.
*/


public class MathOperation {

	public static void main(String[] args) {
		int[] arr=new int[5];
		int sum=0;
		double avg=0;
		if(args.length!=5) {
			System.out.println("Enter 5 command line integers.");
		}else {
			try {
				for(int i=0;i<5;i++) {
					arr[i]=Integer.parseInt(args[i]);
				}
				for(int j=0;j<5;j++) {
					sum+=arr[j];
				}
				avg=(double)sum/5;
				System.out.println("Sum="+sum);
				System.out.println("Average="+avg);
			}
			catch(NumberFormatException n) {
				System.out.println(n.getClass());
			}
			catch(ArithmeticException a) {
				System.out.println(a.getClass());
			}

		}
	}

}
