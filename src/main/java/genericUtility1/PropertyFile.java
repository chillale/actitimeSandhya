package genericUtility1;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFile {
	public static String readDataFromPropertyFile(String key) throws Throwable {
		FileInputStream fileInputStream = new FileInputStream("./VtigerCommonData.properties");
		Properties properties = new Properties();
		properties.load(fileInputStream);
		String value = properties.getProperty(key);
		return value;
	}

}
