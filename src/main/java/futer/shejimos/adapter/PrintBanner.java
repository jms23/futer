package futer.shejimos.adapter;

public class PrintBanner extends Print1 {

	private Banner banner;
	
	public PrintBanner(String banner) {
		this.banner = new Banner(banner);
	}
	
	@Override
	public void printWeak() {
		// TODO Auto-generated method stub
		banner.showWithAster();
	}

	@Override
	public void printStrong() {
		// TODO Auto-generated method stub
		banner.showWithParen();
	}

	@Override
	void test() {
		// TODO Auto-generated method stub
		
	}
	
	

}
