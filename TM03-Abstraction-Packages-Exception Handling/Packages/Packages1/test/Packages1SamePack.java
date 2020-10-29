package test;


public class Packages1SamePack {

	public static void main(String[] args) {
		Foundation f1=new Foundation();
		//f1.var1=1; //private var1 is not accessible-visible only to its class
		f1.var2=2; //var2  accessible 
		f1.var3=3; //protected -var3not accessible outside package- accessible to other class within same package
		f1.var4=4 ; //public var4- accessible anywhere
	}

}
