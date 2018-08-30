package futer.shejimos.abstractFactory.demo1;

public abstract class Factory {
	public static Factory getFactory(String classname) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		Factory factory = null;
		factory = (Factory) Class.forName(classname).newInstance();
		return factory;
	}
	
	/** 定义创建抽象的零件等方法 **/
	public abstract Link createLink(String caption, String url); // 抽象的零件 连接
	
	public abstract Tray createTray(String caption);  // 抽象的零件 托胖
	
	public abstract Page createPage(String title, String author); // 抽象的产品 
	
	
}
