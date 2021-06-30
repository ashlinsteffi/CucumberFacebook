package org.utilities;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	
	public static void generateJvmReport(String jsonpath) {
		File f=new File("C:\\Users\\ASHLINSHILIN\\Documents\\Selenium\\New folder\\CucumberFacebook\\src\\test\\resources\\Reports\\JvmReports");
		
		Configuration con=new Configuration(f, "Facebook web app");
		con.addClassifications("platform name", "windows 10");
		con.addClassifications("Browser name", "Chrome");
		con.addClassifications("Browser version", "89.0");
		con.addClassifications("Sprint number", "23");
		
		List<String> list=new ArrayList<String>();
		list.add(jsonpath);
		
		ReportBuilder r=new ReportBuilder(list, con);
		r.generateReports();
	}

}
