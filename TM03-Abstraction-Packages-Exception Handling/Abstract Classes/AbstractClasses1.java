/*Create a class called GeneralBank that acts as base class for all banks. 
 This class has getSavingsInterestRate and getFixedDepositInterestRate methods, 
 which returns the savings account interest rate and fixed deposit account interest rate that the specific bank gives. 
 Since GeneralBank cannot say what percentage which bank would give, make these methods abstract.
Create two subclasses of GeneralBank called ICICIBank and KotMBank. Override the inherited methods from the base class. The following are the interest rates of these banks.
ICICIBank - Savings 4% Fixed 8.5% and 
KotMBank - Savings 6% Fixed 9%.
Create a main method to test the above classes and their methods. Try one by one and observe your findings
a) ICICIBank i=new ICICIBank();
b) KotMBank k=new KotMBank();
c) GeneralBank g=new KotMBank();
d) GeneralBank g=new ICICIBank();
*/



abstract class GeneralBank{
	public abstract double getSavingsInterestRate();
	public abstract double getFixedDepositInterestRate();
}
class ICICIBank extends GeneralBank{
	double sRate;
	double fdRate;
	ICICIBank(){
		sRate=4;
		fdRate=8.5;
	}
	public double getSavingsInterestRate() {
		return sRate;
	}
	public double getFixedDepositInterestRate() {	
		return fdRate;
	}
	
}
class KotMBank extends GeneralBank{
	double sRate;
	double fdRate;
	KotMBank(){
		sRate=6;
		fdRate=9;
	}
	public double getSavingsInterestRate() {
		return sRate;
	}
	public double getFixedDepositInterestRate() {	
		return fdRate;
	}
	
}
public class AbstractClasses1 {

	public static void main(String[] args) {
		ICICIBank i=new ICICIBank();
		System.out.println("Savings:"+i.getSavingsInterestRate()+"\tFixedDeposit:"+i.getFixedDepositInterestRate());
		KotMBank k=new KotMBank();
		System.out.println("Savings:"+k.getSavingsInterestRate()+"\tFixedDeposit:"+k.getFixedDepositInterestRate());
		GeneralBank g1=new KotMBank();
		System.out.println("Savings:"+g1.getSavingsInterestRate()+"\tFixedDeposit:"+g1.getFixedDepositInterestRate());
		GeneralBank g2=new ICICIBank();
		System.out.println("Savings:"+g2.getSavingsInterestRate()+"\tFixedDeposit:"+g2.getFixedDepositInterestRate());

	}

}
