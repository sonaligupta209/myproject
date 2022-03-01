package jdbcdemo;
import java.sql.*;
public class JDBCDemo
{
public static void main(String[] args) {
	try{
		Class.forName("com.mysql.jdbc.driver");

	    Connection con=DriverManager.getConnection("jdbc:mysql://localhost::3306/college","root","sonali@123");
	    Statement st =con.createStatement();
	    System.out.println("inserting records");
	    String sql ="Insert into college values(53,'sonu')";
	    st.executeUpdate(sql);	
       }
	catch(Exception e) {
		
		 System.out.println(e);
}
}
}