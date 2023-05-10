package sandhyaUtility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.DataProvider;

public class JsonFile {
	public String readDataFromJson(String key) throws IOException, ParseException {
		FileReader fr = new FileReader(ConstantUtility.jsonLoc);
		JSONParser json = new JSONParser();
		Object obj = json.parse(fr);
		HashMap hp = (HashMap)obj;
		return (String) hp.get(key);
		
	}
	public String readDataFromJsonArray(String key) throws IOException, ParseException {
		FileReader fr = new FileReader(ConstantUtility.orgLoc);
		JSONParser json = new JSONParser();
		Object obj = json.parse(fr);
		JSONArray jsonArray = (JSONArray)obj;
		HashMap hp = null;
		for(int i=0;i<jsonArray.size();i++) {
			 hp=(HashMap)jsonArray.get(i);
			
		}
		return (String)hp.get(key);
	}
	@DataProvider(name = "readDa")
	public Object[][] readDa() throws IOException, ParseException{
		FileReader fr = new FileReader(ConstantUtility.jsonLoc);
		JSONParser json = new JSONParser();
		Object obj = json.parse(fr);
		HashMap hp = (HashMap)obj;
		Object[][] ob = new Object[1][3];
		ob[0][0]=hp.get("url");
		ob[0][1]=hp.get("un");
		ob[0][2]=hp.get("pw");
		return ob;
	}

}
