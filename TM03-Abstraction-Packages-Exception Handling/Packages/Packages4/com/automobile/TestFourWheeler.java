/*Add the following ideas to the previous hands on: 
Create FourWheeler subpackage under automobile package
Logan class extends com.automobile.Vehicle class
public int speed()
– Returns the current speed of the vehicle.
public int gps() 
– provides facility to control the gps device 

Ford class extends  com.automobile.Vehicle class
public int speed()
– Returns the current speed of the vehicle.
public int tempControl() 
– provides facility to control the air conditioning device which is available in the car
Create objects of the relevant classes and test the various functionalities of the class.*/



package com.automobile;

import com.automobile.fourwheeler.*;
public class TestFourWheeler {

	public static void main(String[] args) {
		Logan logan=new Logan("Logan DLX BSIV","TN04RP4778","Bhuvan",90);
		System.out.println(logan.getModelName());
		System.out.println(logan.getRegistrationNumber());
		System.out.println(logan.getOwnerName());
		System.out.println(logan.getSpeed());
		logan.gps();
		
		System.out.println("");
		
		Ford ford=new Ford("Ford Endeavour","TN04ZE0003","Rajkumar",99);
		System.out.println(ford.getModelName());
		System.out.println(ford.getRegistrationNumber());
		System.out.println(ford.getOwnerName());
		System.out.println(ford.getSpeed());
		ford.tempControl();
		


	}

}
