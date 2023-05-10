package collectionsRepository;

import java.util.HashMap;

import com.github.javafaker.Faker;

public class HashMapTest {
	public static HashMap<String,String> readDataFromHashMap() {
		Faker faker = new Faker();
		HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("firstNameType", "Mr.");
		hashMap.put("firstName", "Rajesh"+faker.name().lastName());
		hashMap.put("organizationNameSearchTf", "Testyantra");
		hashMap.put("leadSourceType", "Employee");
		hashMap.put("titleTf", "creatingContact");
		hashMap.put("department", "Development");
		return hashMap;
	}

}
