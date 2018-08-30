package futer.shejimos.builder;

public class Director {
	private Builder builder;
	
	// ����
	public Director(Builder builder) {
		this.builder = builder;
	}
	
	public void construct() {
		builder.makeTitle("getting");
		builder.makeString("�����ϵ�����");
		builder.makeItems(new String[]{
				"���Ϻ�",
				"�����",
		});
		
		builder.makeString("�����絽����");
		builder.makeItems(new String[]{
				"���Ϻ�",
				"��",
				"�ټ�",
		});
		
		builder.close();
		
		
	}
}
