package futer.shejimos.abstractFactory.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象类的意义 定义 变量和接口， 让子类去实现
 * @author Administrator
 *
 */
public abstract class Item {
	protected String caption;
	
	private List<String> captions = new ArrayList<String>();
	
	public Item(String caption) {
		this.caption = caption;
	}
	
	/**
	 * 只有子类也是抽象类才会不强制实现方法
	 * @return
	 */
	public abstract String makeHtml();
}
