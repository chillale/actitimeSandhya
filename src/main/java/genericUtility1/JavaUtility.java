package genericUtility1;

import java.util.Random;

import com.github.javafaker.Faker;

public class JavaUtility {
	public static int generateRandonNumber() {
		Random random = new Random();
		int randomNumber=random.nextInt(2000);
		return randomNumber;
	}
	public static String lastName() {
		Faker faker = new Faker();
		String lName=faker.name().lastName();
		return lName;
	}
	

}
