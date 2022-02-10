package com.csscorp.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementDemo {

	public static void main(String[] args) {
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "welcome@123");
		} catch (SQLException e) {

			e.printStackTrace();
		}
		Statement stmt = null;
		try {
			stmt = con.createStatement();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		ResultSet rs = null;
		try {
			rs = stmt.executeQuery("SELECT iemi,model,brand,cost FROM MOBILE");

		} catch (SQLException e) {

			e.printStackTrace();
		}
		try {
			while (rs.next()) {
				System.out.print(rs.getInt(1));
				System.out.print("   "+rs.getString("model"));
				System.out.print("   "+rs.getString(3));
				System.out.println("   "+rs.getDouble("cost"));
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}
}
