import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectGroupCards {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		Map<Character,ArrayList<Card>> map=new TreeMap<Character,ArrayList<Card>>();
		System.out.println("Enter Number of Cards:");
		int noOfCards= scan.nextInt();
		for(int i=1;i<=noOfCards;i++) {
			System.out.println("Enter Card "+i+":");
			char symbol= scan.next().charAt(0);
			int number= scan.nextInt();
			Card card= new Card(symbol,number);
			//if map doesn't contain that symbol, create a new list of cards and add them to map
			//else if symbol i.e key already exists, get the list of cards of that key, add new card to list, then update map.
			if(!map.containsKey(symbol)) {
				ArrayList<Card> cardList= new ArrayList<Card>();
				cardList.add(card);
				map.put(symbol, cardList);
				
			}else {
				ArrayList<Card> cardList= map.get(symbol);
				cardList.add(card);
				map.put(symbol, cardList);
			}
		}
		//printing distinct keys
		System.out.println("Distinct Symbols are:");
		TreeSet<Character> keys= new TreeSet<Character>(map.keySet());
		for(char c:keys) {
			System.out.print(c+" ");
		}
		System.out.println("");
		//printing cardList(cards) in each key & sum 
		Set<Entry<Character,ArrayList<Card>>> set= map.entrySet();
		Iterator<Entry<Character,ArrayList<Card>>> itr= set.iterator();
		while(itr.hasNext()) {
			int sum=0;
			Entry<Character,ArrayList<Card>> e=itr.next();
			System.out.println("Cards in "+e.getKey()+" Symbol");
			for(Card c:e.getValue()) {
				System.out.println(c.getSymbol()+" "+c.getNumber());
				sum+=c.getNumber();
			}
			System.out.println("No of Cards: "+e.getValue().size());
			System.out.println("Sum of Numbers: "+sum);
		}
		scan.close();
	}

}
