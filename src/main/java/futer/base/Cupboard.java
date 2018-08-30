package futer.base;

public class Cupboard {
	Bow1 bow3 = new Bow1(3);
	
	static Bow1 bow4 = new Bow1(4);
	
	public Cupboard() {
		System.out.println("cupboard ...()");
		
		bow4.f1(2);
	}
	
	
	void f3(int marker){
		System.out.println("f3.marker..." + marker);
	}
	
	static Bow1 bow5 = new Bow1(5);
	
	
}
