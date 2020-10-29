/*Create an abstract class Instrument which is having the abstract function play. 
Create three more sub classes from Instrument which is Piano, Flute, Guitar. 
Override the play method inside all three classes printing a message 
“Piano is playing  tan tan tan tan  ”  for Piano class
“Flute is playing  toot toot toot toot”  for Flute class
“Guitar is playing  tin  tin  tin ”  for Guitar class 
Create an array of 10 Instruments.
Assign different type of instrument to Instrument reference.
Check for the polymorphic behavior of  play method.
Use the instanceof operator to print which object is stored at which index of instrument array.
*/



import java.util.Random;

abstract class Instrument{
	public  abstract void play(); 
}

class Piano extends Instrument{
	public void play() {
		System.out.println("Piano is playing tan tan tan tan");
	}
}
class Flute extends Instrument{
	public void play() {
		System.out.println("Flute is playing toot toot toot toot");
	}
}
class Guitar extends Instrument{
	public void play() {
		System.out.println("Guitar is playing tin tin tin");
	}
}

public class AbstractClasses3 {

	public static void main(String[] args) {
		Instrument[] instrument=new Instrument[10];
		Random random=new Random();
		for (int i=0;i<10;i++) {
			int num= random.nextInt(3)+1;
			if(num==1) {
				instrument[i]= new Piano();
			}else if(num==2) {
				instrument[i]= new Flute();
			}else if(num==3) {
				instrument[i]= new Guitar();
			}
		}
		for(int i=0;i<10;i++) {
			if(instrument[i] instanceof Piano) {
				System.out.println("Instrument "+(i+1)+" is Piano");
			}else if(instrument[i] instanceof Flute) {
				System.out.println("Instrument "+(i+1)+" is Flute");
			}else if(instrument[i] instanceof Guitar) {
				System.out.println("Instrument "+(i+1)+" is Guitar");
			}
			instrument[i].play();
		}
		
	}

}
