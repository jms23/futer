package futer.shejimos.abstractFactory.demo1;

public class ListLink extends Link{

	public ListLink(String caption, String url) {
		super(caption, url);
	}

	@Override
	public String makeHtml() {
		return "我是listlink的 caption" + caption + "\n";
	}

}
