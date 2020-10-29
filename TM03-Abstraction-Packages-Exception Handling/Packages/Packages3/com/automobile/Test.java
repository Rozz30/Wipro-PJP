package com.automobile;
import com.automobile.twowheeler.*;

public class Test {

	public static void main(String[] args) {
		Hero hero=new Hero("Hero Passion Pro","TN04RP4778","Vijay",90);
		System.out.println(hero.getModelName());
		System.out.println(hero.getRegistrationNumber());
		System.out.println(hero.getOwnerName());
		System.out.println(hero.getSpeed());
		hero.radio();
		
		System.out.println("");
		
		Honda honda=new Honda("Honda Shine","TN04ZE0003","Kumar",99);
		System.out.println(honda.getModelName());
		System.out.println(honda.getRegistrationNumber());
		System.out.println(honda.getOwnerName());
		System.out.println(honda.getSpeed());
		honda.cdplayer();
		

	}

}
