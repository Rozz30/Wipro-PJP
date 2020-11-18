
public class SBAccount extends Account{
	double interestRate;
	double amount;
	SBAccount(double amount){
		this.amount=amount;
		interestRate=4;
	}
	@Override
	double calculateInterest() {
		double intGain;
		intGain=amount*1*interestRate/100;
		return intGain;
	}
	

}
