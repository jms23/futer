package futer.base;

public class StaticIntialization {

	/**
	 * 静态类的加载顺序 以及构造方法的执行
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("-------------");
		System.out.println("createing new Cupboard() in main");
		new Cupboard();
		
		System.out.println();
		
		System.out.println();System.out.println();
		System.out.println("createing new Cupboard() in main");
		new Cupboard();
		
		System.out.println("-------------");
		
		table.f2(1);
		
		cupboard.f3(1);
		
	}
	
	static Table table = new Table();
	
	static Cupboard cupboard = new Cupboard();
}
