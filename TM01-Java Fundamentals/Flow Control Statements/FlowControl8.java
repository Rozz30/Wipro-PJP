/*Write a program to receive a color code from the user (an Alphabhet). 
The program should then print the color name, based on the color code given. 
The following are the color codes and their corresponding color names.
R->Red, B->Blue, G->Green, O->Orange, Y->Yellow, W->White. 
If color code provided by the user is not valid then print "Invalid Code".
*/


import java.util.Scanner;

public class FlowControl8 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter ColorCode:");
		char code=input.next().charAt(0);
		switch(code) {
			case 'R':System.out.println("Red");
					break;
			case 'B':System.out.println("Red");
					break;
			case 'G':System.out.println("Red");
					break;
			case 'O':System.out.println("Red");
					break;
			case 'Y':System.out.println("Red");
					break;
			case 'W':System.out.println("Red");
					break;
			default: System.out.println("Invalid Code");
		}
		input.close();
	}

}
