
import java.sql.*;

public class jdbc {
	
	public static void main(String [] args) throws Exception {
		
		String query="insert into students values(104,`zsd`,45)";
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","123456");
		Statement st = con.createStatement();
		int count = st.executeUpdate(query);
		
		System.out.println(count + "Don");
		
		st.close();
		con.close();
		
		
		
		
	}

}
