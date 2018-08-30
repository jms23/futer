package futer.base;

public class House {
	Window window1 = new Window(1);
	
	public House() {
		System.out.println("print house()");
		window3 = new Window(3454);
	}
	
	Window window2= new Window(2);
	
	
	void f(){
		System.out.println("f");
	}
	
	Window window3 = new Window(3);
}
