/*Write a Program to take care of Number Format Exception if user enters values other than integer for calculating average marks of 2 students. The name of the students and marks in 3 subjects are taken from the user while executing the program.
In the same Program write your own Exception classes to take care of Negative values and values out of range (i.e. other than in the range of 0-100)*/


import java.util.Scanner;
import java.io.InputStreamReader;

class NegativeValuesException extends Exception{
	public NegativeValuesException() {
		System.out.println("Negative value exception occured");
	}
}
class ValuesOutOfRangeException extends Exception{
	public ValuesOutOfRangeException() {
		System.out.println("Values out of range exception occured");
	}
}

public class ExceptionHandling6 {

	public static void main(String[] args) {
		for(int i=0;i<2;i++) {
			Scanner input=new Scanner(new InputStreamReader(System.in));
			System.out.println("Enter Student"+(i+1)+" name and marks:");
			String name=input.next();
			int m1 = 0,m2 = 0,m3 = 0;
			try {
				 m1=Integer.parseInt(input.next());
				 m2=Integer.parseInt(input.next());
				 m3=Integer.parseInt(input.next());
				if(m1<0 ||m2<0|| m3<0) {
					throw new NegativeValuesException();
				}
				if(m1>100 ||m2>100|| m3>100) {
					throw new ValuesOutOfRangeException();
				}
				System.out.println("Average marks of "+name+" is "+((m1+m2+m3)/3));
				
			}
			catch(NumberFormatException e) {
				System.out.println(e.getClass());
			} catch (NegativeValuesException e) {
				System.out.println(e.getClass());
				
			} catch (ValuesOutOfRangeException e) {
				System.out.println(e.getClass());
			}
			
			
		}
		

	}

}
