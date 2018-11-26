import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Factory {
	public static Connection getConnection() {
		final String url = "jdbc:postgresql://ec2-54-204-36-249.compute-1.amazonaws.com:5432/d4aqkun5f4ti4l?sslmode=require";
		final String login = "acpzqjsseuwyir";
		final String senha = "26ba92e7e7eb1092c810d147dc4cae0fd45df79a238b4ccd5a7849348c560dc5";
		DriverManager.setLoginTimeout(99999);
		try {
			return DriverManager.getConnection(url, login, senha);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(";;;");
			e.printStackTrace();
			return null;
		}
	}
}
