package futer.ioc.constructor;

public class Myconstructor {
	public Myconstructor1 myconstructor1;
	
	public Myconstructor(Myconstructor1 myconstructor1) {
		this.myconstructor1 = myconstructor1;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

	public Myconstructor1 getMyconstructor1() {
		return myconstructor1;
	}
	
	
}
