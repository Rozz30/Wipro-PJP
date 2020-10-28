/*Create  a base class Fruit with name ,taste and size as its attributes. 
Create a method called eat() which describes the name of the fruit and its taste. 
Inherit the same in 2 other classes Apple and Orange and override the eat() method to represent each fruit taste.
*/




class Fruit{
	String name,taste,size;
	void eat() {
		System.out.println("Eating fruits.");
	}
}
class Apple extends Fruit{
	Apple(){
		name="Apple";
		taste="sweet";
	}
	void eat() {
		System.out.println(name+" is "+taste+" in taste.");
	}
}
class Orange extends Fruit{
	Orange(){
		name="Orange";
		taste="tart";
	}
	void eat() {
		System.out.println(name+" is "+taste+" in taste.");
	}
}

public class OverridingPolymorphism1 {
	public static void main(String[] args) {
		Fruit f=new Fruit();
		Apple a=new Apple();
		Orange o=new Orange();
		f.eat();
		a.eat();
		o.eat();

	}

}
