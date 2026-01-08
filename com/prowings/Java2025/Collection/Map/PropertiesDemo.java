package com.prowings.Java2025.Collection.Map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
	public static void main(String[] args) {
		Properties props = new Properties();
		
		try {
			FileInputStream stream = new FileInputStream("C:\\Users\\Shrivardhan Patil\\eclipse-workspace\\Java_14_2025\\src\\com\\prowings\\Java2025\\Collection\\Map\\Application.properties");
		    props.load(stream);
		}
		catch(FileNotFoundException e){
			System.out.println("Error while loading application properties-- file not found!!!");
		}
		catch(IOException e) {
			System.out.println("Error while loading application properties!!!");
		}
		
		System.out.println("Username is :"+props.getProperty("username"));
		System.out.println("Passward is :"+props.getProperty("passward"));
		System.out.println("url is :"+props.getProperty("url"));
		
	}

}
