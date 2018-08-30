package futer.shejimos.adapter;

import java.io.IOException;

public class Main {

	/**
	 * 适配器模式
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		/**
		 * 通过继承的方式来达到目的，简单的说这种叫做类适配器
		 */
		/*Print print = new PrintBanner("test");
		print.printStrong();
		print.printWeak();*/
		
		
		/** 
		 * 委托模式（对象适配器）PrintBanner() 利用构造方法适配了对象 Banner
		 */
		Print1 print = new PrintBanner("test");
		
		print.printStrong();
		print.printWeak();
		
		// 抽象类无法生成其子类
		//Print1 test = new Print1();
		
		
		/** 练习题 **/
		FileIO file = new FileProperties();
		file.readFromFile("c://file.txt");
		file.setValue("month", "4");
		file.setValue("day", "30");
		
		file.wirteToFile("D://new_file.txt");
		
		
	}

}
