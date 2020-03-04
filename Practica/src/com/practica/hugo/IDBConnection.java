package com.practica.hugo;

import java.sql.Connection;
import java.sql.DriverManager;

import static com.practica.hugo.Database.*;

public interface IDBConnection {
	
	default Connection connectToDB() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(URL+DB, USER, PASSWORD);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			return connection;
		}
		
	}
}
