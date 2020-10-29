
import test.Foundation;
public class Packages1NotSamePack {

	public static void main(String[] args) {
		Foundation f1=new Foundation();
		//f1.var1=1; //var1 is not accessible private - visible only to its class
		//f1.var2=2; //var2 not accessible 
		//f1.var3=3; //not accessible outside package- accessible to other class within same package
		f1.var4=4 ; //accessible anywhere
	}

}
