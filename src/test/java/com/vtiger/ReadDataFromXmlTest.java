package com.vtiger;

import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class ReadDataFromXmlTest {
	@Test
	public void readData(XmlTest xmlTest) {
		String uRl=xmlTest.getParameter("url");
		System.out.println(uRl);
	}

}
