package com.prowings.Java2025.Exception;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CheckedExDemo3 {
	public static void main(String[] args) {
		
		try {
			Connection con = DriverManager.getConnection("");
		}
		catch(SQLException e) {
			System.out.println("can not obtain DB connection");
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
