package futer.shejimos.bridge;



public class CountDisplay extends Display{
	public CountDisplay(DisplayImpl displayImpl) {
		// TODO Auto-generated constructor stub
		super(displayImpl);
	}
	
	public void muitiDisplay(int times){
		open();
		
		for (int i = 0; i < times; i++) {
			print();
		}
		
		close();
	}
	
	public final static void test(){
		
	}
}
