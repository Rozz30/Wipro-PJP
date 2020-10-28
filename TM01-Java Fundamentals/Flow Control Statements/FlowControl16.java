/*Write a program to print * in Floyds format (using for and while loop)
*
*  *
*  *   *
Example1)
C:\>java Sample 
O/P: Please enter an integer number
Example2)
C:\>java Sample 3
O/P :
*
*  * 
*  *  *
--------------------------------------------------------------------------
*/


public class FlowControl16 {

	public static void main(String[] args) {
		if(args.length==0) {
			System.out.println("Please enter an integer number");
		}
		int num=Integer.parseInt(args[0]);
		for(int i=0;i<num;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
			