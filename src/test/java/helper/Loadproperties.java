package helper;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;


public class Loadproperties {


	
public static Properties userdata= loadproperties(System.getProperty("user.dir")+"\\src\\test\\java\\helper\\data.properties");

private static Properties loadproperties(String string) 
{

	Properties pro = new Properties();
	try {
		FileInputStream stream = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\helper\\data.properties");
		pro.load(stream);
	}
	       catch (IOException e) {
	   		System.out.println("Error"+e.getMessage());
		}
	
	return pro;
}	
	

	
	
	
	
	
	
	
}
