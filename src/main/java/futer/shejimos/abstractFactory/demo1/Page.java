package futer.shejimos.abstractFactory.demo1;

import java.util.ArrayList;

/**
 * 这个是主要来干活的类， 定义N多要子类实现的方法
 * @author Administrator
 *
 */
public abstract class Page {
	protected String title;
	protected String author;
	
	protected ArrayList content = new ArrayList();
	
	public Page(String title, String author) {
		this.author = author;
		this.title = title;
	}
	
	public void add(Item item){
		content.add(item);
	}
	
	public void outPut(){
		//this.makeHtml();
		System.out.println("编写完成" + this.makeHtml());
	}
	
	public abstract String makeHtml();
}
