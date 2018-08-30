package futer.base;

public class OrderOfInitializetion {
	public static void main(String[] args) {
		
		// 初始化顺序， 类的内部会按照先后顺序决定初始化的顺序，会在构造器调用之前得到初始化
		House house = new House();
		house.f();
		
		// 静态数据的初始化
		
		
	}
}
