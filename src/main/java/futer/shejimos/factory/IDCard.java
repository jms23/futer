package futer.shejimos.factory;


public class IDCard extends Product{
	private String owner;
	
	 IDCard(String owner) {
		this.owner = owner;
	}
	
	@Override
	public void use() {
		System.out.println("ʹ����" + owner + "�Ŀ�");
	}
	
	public String getOwner() {
		return this.owner;
	}

}
