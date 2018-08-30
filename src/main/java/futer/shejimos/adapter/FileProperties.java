package futer.shejimos.adapter;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FileProperties extends Properties implements FileIO {

	public void readFromFile(String fileName) throws IOException {
		load(new FileInputStream(fileName));
	}

	public void wirteToFile(String fileName) throws IOException {
		// TODO Auto-generated method stub
		store(new FileOutputStream(fileName), "Im file");
	}

	public void setValue(String key, String value) {
		setProperty(key, value);
	}

	public void getValue(String key) {
		System.out.println(getProperty("year"));
	}

}
