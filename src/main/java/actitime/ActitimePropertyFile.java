package actitime;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ActitimePropertyFile {
	public String readDataFromPropertyFile(String key) throws IOException {
		FileInputStream fileInputStream = new FileInputStream("./Actitime.properties");
		Properties properties = new Properties();
		properties.load(fileInputStream);
		return properties.getProperty(key);
		
	}
	public static void main(String []args) throws IOException {
		ActitimePropertyFile actitimePropertyFile = new ActitimePropertyFile();
		System.out.println(actitimePropertyFile.readDataFromPropertyFile("url"));
		System.out.println(actitimePropertyFile.readDataFromPropertyFile("username"));
	}

}
