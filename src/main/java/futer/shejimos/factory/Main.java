package futer.shejimos.factory;


public class Main {

	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product card =  factory.create("ะกร๗");
		card.use();
		
		IDCard card2 = new IDCard("ddd");
		
	}

}
