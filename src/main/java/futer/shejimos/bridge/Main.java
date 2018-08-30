package futer.shejimos.bridge;

public class Main {
	
	
	public static void main(String[] args) { 
		Display display1=  new Display(new StringDisplayImpl("hello,china."));
		
		display1.open();
		display1.print();
		display1.close();
		
		display1.display();
		
		// -------------
		
		RandomDisplay randomDisplay = new RandomDisplay(new StringDisplayImpl("hei"));
		randomDisplay.randomDis(19);

	}
}
