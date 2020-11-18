
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
	public String toString() {
		return "Card [symbol=" + symbol + ", number=" + number + "]";
	}
	@Override
	public int compareTo(Card card2) {
		if(this.symbol<card2.symbol) {
			return -1;
		}else if(this.symbol>card2.symbol) {
			return 1;
		}else {
			return 0;
		}
			
	}
	
}
