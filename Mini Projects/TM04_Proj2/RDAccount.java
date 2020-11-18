
public class RDAccount extends Account {
	int age;
	int noOfMonths;
	double monthlyAmount;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getNoOfMonths() {
		return noOfMonths;
	}

	public void setNoOfMonths(int noOfMonths) {
		this.noOfMonths = noOfMonths;
	}

	public double getMonthlyAmount() {
		return monthlyAmount;
	}

	public void setMonthlyAmount(double monthlyAmount) {
		this.monthlyAmount = monthlyAmount;
	}

	@Override
	double calculateInterest() {
		if(age<60) {
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
		return amount*interestRate/100;
	}

	public void setInterestRate(int i) {
		this.interestRate=i;
		
	}

	public double getInterestRate() {
		// TODO Auto-generated method stub
		return interestRate;
	}
	
	

}
