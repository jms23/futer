package futer.shejimos.builder;

public class TextBuilder extends Builder{
	
	private StringBuffer buffer = new StringBuffer();

	@Override
	public void makeTitle(String title) {
		 buffer.append("==============================\n");          // 装饰线
	        buffer.append("『" + title + "』\n");                       // 为标题添加『』
	        buffer.append("\n");                 
		
	}

	@Override
	public void makeString(String str) {
		 buffer.append('■' + str + "\n");                       // 为字符串添加■
	        buffer.append("\n");            
	}

	@Override
	public void makeItems(String[] items) {
		 for (int i = 0; i < items.length; i++) {
	            buffer.append("　・" + items[i] + "\n");            // 为条目添加・
	        }
	        buffer.append("\n");       
	}

	@Override
	public void close() {
		buffer.append("==============================\n"); 
	}
	
	public String getResult() {                                 // 完成的文档
        return buffer.toString();                               // 将StringBuffer变换为String
    }

}
