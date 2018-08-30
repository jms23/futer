package futer.shejimos.builder;

public class Main {
	public static void main(String[] args) {
		TextBuilder builder = new TextBuilder();
		
		Director director = new Director(builder);
		director.construct();
		
		String result = builder.getResult();
		
		System.out.println(result);
	}
}
