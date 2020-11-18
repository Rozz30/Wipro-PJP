
public class Card implements Comparable<Card> {
	char symbol;
	int number;

	public Card(char symbol, int number) {
		super();
		this.symbol = symbol;
		this.number = number;
	}

	public char getSymbol() {
		return symbol;
	}

	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public int compareTo(Card card2) {
		if(this.getSymbol()<card2.getSymbol()) {
			return -1;
		}else {
			return 1;
		}
	}
	
//	@Override
//	public int compareTo(Card card2) {
//		if(this.getNumber()<card2.getNumber()) {
//			return -1;
//		}else {
//			return 1;
//		}
//	}

	
	  
	

}
