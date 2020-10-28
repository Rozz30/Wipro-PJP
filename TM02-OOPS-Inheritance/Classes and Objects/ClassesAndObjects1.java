/*Create a class Box that uses a parameterized constructor to initialize the dimensions of a box.
The dimensions of the Box are width, height, depth. 
The class should have a method that can return the volume of the box. 
Create an object of the Box class and test the functionalities.
*/


public class ClassesAndObjects1 {
	public static void main(String[] args) {
		Box box1=new Box(3,4,5);
		box1.getVolume();
	}
}

class Box{
	int width,height,depth;
	Box(int width,int height,int depth){
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	void getVolume() {
		System.out.println("Volume of the Box = "+width*height*depth);
	}
	
}