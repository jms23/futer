package futer.base.innerClass;

public class Sequence {
	private Object[] items;
	
	private int next = 0;
	public Sequence(int size) {
		items = new Object[size];
	}
	
	public void add(Object x) {
		if (next < items.length) {
			items[next++] = x;
		}
	}
	
	public Selector selector() {
		return new SequenceSelector();
	}
	
	// 内部类
	private class SequenceSelector implements Selector {
		private int i = 0;
		public Object current() {
			// TODO Auto-generated method stub
			return items[i];
		}
		
		public boolean end() {
			// TODO Auto-generated method stub
			return i == items.length;
		}
		
		public void next() {
			// TODO Auto-generated method stub
			if (i < items.length) {
				i++;
			}
			
			
		}
		
		
		
		
	}
}
