/*Create a class called compartment which represents the ship compartments with attributes like height, width and breadth. 
Take care it should not conflict with the compartment class you have created in Abstract class exercise 2.
To avoid conflict create this class in a new package called com.wipro.automobile.ship*/

package com.wipro.automobile.ship;

public class Compartment {
	
	public double height;
	public double width;
	public double breadth;
	
	public Compartment(double height, double width, double breadth) {
		super();
		this.height = height;
		this.width = width;
		this.breadth = breadth;
	}

	@Override
	public String toString() {
		return "Compartment [height=" + height + ", width=" + width + ", breadth=" + breadth + "]";
	}
	
	
}
