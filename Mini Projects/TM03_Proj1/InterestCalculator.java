import java.util.Scanner;
import negativeValueException.*;
import java.io.InputStreamReader;

public class InterestCalculator {
	 

	public static void main(String[] args) {
		Scanner input=new Scanner(new InputStreamReader(System.in));
		Account a1;
		int choice;
		int noOfDays;
		int age;
		double amount;
		do {
			System.out.println("\nMAIN MENU");
			System.out.println("---------");
			System.out.println("\t1. Interest Calculator - SB");
			System.out.println("\t2. Interest Calculator - FB");
			System.out.println("\t3. Interest Calculator - RB");
			System.out.println("\t4. Exit");
			System.out.print("Enter your option (1..4) : ");
			choice=input.nextInt();
			//System.out.println("");
			
			switch(choice) {
			case 1:
				try {
					System.out.print("Enter the Average amount in your account: ");
					amount=input.nextDouble();
					if(amount<0)
						throw new InvalidAmount();
					a1=new SBAccount(amount);
					System.out.println("Interest Gained : Rs. "+a1.calculateInterest());
					
				}
				catch(InvalidAmount e) {}
				break;
				
			case 2:
				try {
					System.out.print("Enter the FD amount: ");
					amount=input.nextDouble();
					if(amount<0)
						throw new InvalidAmount();
					System.out.print("Enter the number of days: ");
					noOfDays=input.nextInt();
					if(noOfDays<0)
						throw new InvalidNoOfDays();
					System.out.print("Enter your age: ");
					age=input.nextInt();
					if(age<0)
						throw new InvalidAge();
					
					a1=new FDAccount(amount,noOfDays,age);
					System.out.println("Interest Gained : Rs. "+a1.calculateInterest());
					
				}
				catch(InvalidAmount e) {}
				catch(InvalidNoOfDays e) {}
				catch(InvalidAge e) {}
				break;
				
			case 3:
				try {
					System.out.print("Enter monthly amount: ");
					amount=input.nextDouble();
					if(amount<0)
						throw new InvalidAmount();
					System.out.print("Enter the number of months: ");
					int months=input.nextInt();
					if(months<0)
						throw new InvalidNoOfMonths();
					System.out.print("Enter your age: ");
					age=input.nextInt();
					if(age<0)
						throw new InvalidAge();
					a1=new RDAccount(amount,months,age);
					System.out.println("Interest Gained : Rs. "+a1.calculateInterest());
					
				}
				catch(InvalidAmount e) {}
				catch(InvalidNoOfMonths e) {}
				catch(InvalidAge e) {}
				break;
				
				
			case 4:
				System.out.println("Exiting...! Thanks for using the application.");
				break;
			default:
				System.out.println("Please enter a valid option.");
			}
			
		}while(choice!=4);

	}

}
