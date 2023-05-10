package actitime;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.DataProvider;

public class ActitimeDataProvider {
	@DataProvider(name = "data")
	public Object[][] readData() throws IOException, ParseException{
		FileReader fr = new FileReader(ActitimeUtils.actitimeJson);
		JSONParser json = new JSONParser();
		Object obj = json.parse(fr);
		HashMap hp = (HashMap)obj;
		
		Object[][] object = new Object[1][3];
		object[0][0]=hp.get("url");
		object[0][1]=hp.get("username");
		object[0][2]=hp.get("password");
		
		return object;
		
	}

}
