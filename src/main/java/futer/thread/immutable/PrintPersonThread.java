package futer.thread.immutable;

public class PrintPersonThread extends Thread{
	
	private Persion persion; 
	public PrintPersonThread(Persion persion) {
		this.persion = persion;
	
	}
	
	@Override
	public void run() {
		// 如方法只是创建线程实例， 并没有启动线程， 由客户端程序发起动作
		
		while (true) {
			System.out.println(Thread.currentThread().getName() + " : prints " +  persion);
		}
	}
}
