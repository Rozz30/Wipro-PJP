import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class UniqueCards {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		Set<Card> uniqueSet=new TreeSet<Card>();
		ArrayList<Character> list=new ArrayList<Character>();
		int count =0;
		while(uniqueSet.size()<4){
			System.out.println("Enter a card:");
			char symbol=scan.next().charAt(0);
			int number= scan.nextInt();
			Card card= new Card(symbol,number);
			count++;
			if(!list.contains(symbol)) {
				list.add(symbol);
				uniqueSet.add(card);
			}		
		}
		System.out.println("Four symbols gathered from "+count+" cards:");	
		for(Card c:uniqueSet) {
			System.out.println(c.getSymbol()+" "+c.getNumber());
		}	
		scan.close();	
	}

}
