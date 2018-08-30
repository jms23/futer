package futer.base;

public class Table {
	static Bow1 bowl1 = new Bow1(1);
	
	{
		System.out.println("hh");
	}
	public Table() {
		System.out.println("table");
		
		bowl1.f1(1);
	}
	
	void f2(int marker){
		System.out.println("f2 marker..." + marker);
	}
	
	static Bow1 bow2 = new Bow1(2);
	
	static {
		System.out.println("hhhhhhh");
	}
}
