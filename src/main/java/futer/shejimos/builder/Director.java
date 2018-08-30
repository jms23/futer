package futer.shejimos.builder;

public class Director {
	private Builder builder;
	
	// 构造
	public Director(Builder builder) {
		this.builder = builder;
	}
	
	public void construct() {
		builder.makeTitle("getting");
		builder.makeString("从早上到下午");
		builder.makeItems(new String[]{
				"早上好",
				"下午好",
		});
		
		builder.makeString("从下午到晚上");
		builder.makeItems(new String[]{
				"晚上好",
				"晚安",
				"再见",
		});
		
		builder.close();
		
		
	}
}
