package futer.shejimos.adapter;

import java.io.IOException;

public class Main {

	/**
	 * ������ģʽ
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		/**
		 * ͨ���̳еķ�ʽ���ﵽĿ�ģ��򵥵�˵���ֽ�����������
		 */
		/*Print print = new PrintBanner("test");
		print.printStrong();
		print.printWeak();*/
		
		
		/** 
		 * ί��ģʽ��������������PrintBanner() ���ù��췽�������˶��� Banner
		 */
		Print1 print = new PrintBanner("test");
		
		print.printStrong();
		print.printWeak();
		
		// �������޷�����������
		//Print1 test = new Print1();
		
		
		/** ��ϰ�� **/
		FileIO file = new FileProperties();
		file.readFromFile("c://file.txt");
		file.setValue("month", "4");
		file.setValue("day", "30");
		
		file.wirteToFile("D://new_file.txt");
		
		
	}

}
