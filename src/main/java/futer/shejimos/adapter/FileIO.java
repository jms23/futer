package futer.shejimos.adapter;

import java.io.IOException;

public interface FileIO {
	public void readFromFile(String fileName) throws IOException;
	
	public void wirteToFile(String fileName) throws IOException;
	
	public void setValue(String key, String value);
	
	public void getValue(String key);
	
}
