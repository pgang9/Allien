import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class RetriveExample {

	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
Statement stmt = connection.createStatement();
ResultSet rs=stmt.executeQuery("select * from Emp");
while(rs.next()) {
	System.out.print(rs.getString("id"));
	System.out.print(rs.getString("name"));
	System.out.print(rs.getString("sal"));
	System.out.println(rs.getString("dept"));
	
}


		
	}

}
