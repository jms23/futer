package futer.thread.immutable;

public class Main {

	public static void main(String[] args) {
		Persion persion = new Persion("Alice", "shmzhen-futiao");
		
		
		new PrintPersonThread(persion).start();
		new PrintPersonThread(persion).start();
		new PrintPersonThread(persion).start();

	}

}
