package futer.thread.immutable;

public final class Persion {
	private final String name;
	private final String address;
	
	public Persion(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}
	
	// 提供get方法
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "{ persion :name = " + name +  ", address = " + address + "}";
	}
	
}
