package com.prowings.Java2025.Exception;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CheckedExDemo2 {
	public static void main(String[] args) throws SQLException {
		System.out.println("Main method started!!");
		m1();
		System.out.println("Main method ended!!");
	}
	public static void m1() throws SQLException {
		System.out.println("m1 method started!!");
		m2();
		System.out.println("m1 method ended!!");
	}
	public static void m2() throws SQLException {
		System.out.println("m2 method started!!");
		Connection con = DriverManager.getConnection("");
		System.out.println("m2 method ended!!");
	}

}
