package program;

import java.sql.Connection;

import db.DB;

public class Application {

	public static void main(String[] args) {

		Connection conn = DB.getConnection();
		
		DB.closeConnection();

	}

}
