/* Write a program that takes as input the size of the array and the elements in the array. The program then asks the user to enter a particular index and prints the element at that index.

This program may generate Array Index Out Of Bounds Exception. Use exception handling mechanisms to handle this exception. In the catch block, print the class name of the exception thrown.

Sample Input and Output 1:
Enter the number of elements in the array
3
Enter the elements in the array
20
90
4
Enter the index of the array element you want to access
2
The array element at index 2 = 4
The array element successfully accessed

Sample Input and Output 2:
Enter the number of elements in the array
3
Enter the elements in the array
20
90
4
Enter the index of the array element you want to access
6
java.lang.ArrayIndexOutOfBoundsException*/



import java.util.Scanner;
import java.io.InputStreamReader;
public class ExceptionHandling2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(new InputStreamReader(System.in));
		System.out.println("Enter the number of elements in array");
		int size = input.nextInt();
		System.out.println("Enter the elements in array");
		int[] array=new int[size];
		for(int i=0;i<size;i++) {
			array[i]=input.nextInt();
		}
		System.out.println("Enter the index of the array element you want to access");
		int index=input.nextInt();
		try {
			System.out.println("The array element at index "+index+" = "+array[index]);
			System.out.println("The array element successfully accessed");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getClass());
		}
	}

}
