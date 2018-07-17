package code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DBcon {
	public void testDb() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Properties properties = new Properties();
			properties.setProperty("user", "root");
			properties.setProperty("password", "password");
			properties.setProperty("useSSL", "false");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nay", properties);

			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from users");
			while (rs.next()) {
				System.out.println(rs.getString("name"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
