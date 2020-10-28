/*Design a class that can be used by a health care professional to keep track of a patient’s vital statistics. The following are the details.
Name of the class - Patient
Member Variables - patientName(String),height(double),width(double)
Member Function - double computeBMI()
The above method should compute the BMI and return the result. The formula for computation of BMI  is weight (in kg) ÷ height*height(in metres).
Create an object of the Patient class and check the results.
*/


public class ClassesAndObjects3 {

	public static void main(String[] args) {
		Patient P1=new Patient("Raja",165,61);
		System.out.println(P1.patientName+"'s BMI for his height "+P1.height+" and weight "+P1.weight+":" );
		System.out.println(P1.computeBMI());
	}

}

class Patient{
	String patientName;
	double height,weight;
	Patient(String name,double h,double w){
		patientName=name;
		height=h/100;
		weight=w;
	}
	public double computeBMI() {
	    return weight/(height*height);
	}
}
