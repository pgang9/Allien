import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class InsertClass {

	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		Statement stmt =  con.createStatement();
		stmt.executeUpdate("insert into Emp values(102,'anil',90000,'net')");
		stmt.executeUpdate("insert into Emp values(103,'Sai',100000,'dbms')");
	
	
	}

}
