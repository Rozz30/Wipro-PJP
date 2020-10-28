
public class TM01_Proj1 {
	
	private static int[] empId= {1001,1002,1003,1004,1005,1006,1007};
	private static String[] empName= {"Ashish","Sushma","Rahul","Chahat","Ranjan","Suman","Tanmay"};
	private static char[] desCode= {'e','c','k','r','m','e','c'};
	private static String[] dept= {"R&D","PM","Acct","Front Desk","Engg","Manufacturing","PM"};
	private static int[] basic= {20000,30000,10000,12000,50000,23000,29000};
	private static int[] hra= {8000,12000,8000,6000,20000,9000,12000};
	private static int[] it= {3000,9000,1000,2000,20000,4400,10000};
	
	public static void main(String[] args) {
		int index=-1;
		if(args.length!=1) {
			System.out.println("Enter valid Employee ID...");
		}
		else if(args.length==1) {
			int id=Integer.parseInt(args[0]);
			for(int i=0;i<empId.length;i++) {
				if(id==empId[i]) {
					 index=i;
				}
			}
			if(index!=-1) {
				System.out.println("Emp No.     Emp Name     Department     Designation     Salary");
				System.out.printf("%-12d",empId[index]);
				System.out.printf("%-13s", empName[index]);
				System.out.printf("%-15s", dept[index]);
				System.out.printf("%-16s", getDesignation(desCode[index]));
				System.out.printf("%-6d", basic[index]+hra[index]+getDA(desCode[index])-it[index]);
				
			}else {
				System.out.println("There is no employee with empid :"+args[0]);
			}
			
		}
		

	}

	private static int getDA(char c) {
		int DA = 0;
		switch(c) {
		case 'e': DA=20000;
		break;
		case 'c': DA=32000;
		break;
		case 'k': DA=12000;
		break;
		case 'r': DA=15000;
		break;
		case 'm': DA=40000;
		
		}
		return DA;
	}

	private static String getDesignation(char c) {
		String designation = null;
		switch(c) {
		case 'e': designation= "Engineer";
		break;
		case 'c': designation= "Consultant";
		break;
		case 'k': designation= "Clerk";
		break;
		case 'r': designation= "Receptionist";
		break;
		case 'm': designation= "Manager";
		}
		return designation;
	}

}
