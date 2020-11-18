
public class RDAccount extends Account {
	double interestRate;
	double amount;
	int noOfMonths;
	double monthlyAmount;
	RDAccount(double monthlyAmount,int noOfMonths,int age){
		this.monthlyAmount=monthlyAmount;
		this.noOfMonths=noOfMonths;
		int Age=age;
		if(Age<60) {
			if(noOfMonths==6) {
				interestRate=7.50;
			}else if(noOfMonths==9) {
				interestRate=7.75;
			}else if(noOfMonths==12) {
				interestRate=8.00;
			}else if(noOfMonths==15) {
				interestRate=8.25;
			}else if(noOfMonths==18) {
				interestRate=8.50;
			}else if(noOfMonths==21) {
				interestRate=8.75;
			}
		}
		else {
			if(noOfMonths==6) {
				interestRate=8.00;
			}else if(noOfMonths==9) {
				interestRate=8.25;
			}else if(noOfMonths==12) {
				interestRate=8.50;
			}else if(noOfMonths==15) {
				interestRate=8.75;
			}else if(noOfMonths==18) {
				interestRate=9.00;
			}else if(noOfMonths==21) {
				interestRate=9.25;
			}
		}
		amount=12*monthlyAmount;
	}
	@Override
	double calculateInterest() {
		return amount*interestRate/100;
	}
	
	

}
