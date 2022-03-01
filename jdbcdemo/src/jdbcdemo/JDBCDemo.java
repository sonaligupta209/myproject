package jdbcdemo;
import java.sql.*;
public class JDBCDemo
{
public static void main(String[] args)throws Exception {
	
		Class.forName("com.mysql.cj.jdbc.Driver");

	    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","Sonali@123");
	    Statement st =con.createStatement();
	    System.out.println("inserting records");
	    //String sql ="CREATE TABLE CUSTOMER(ID INT,NAME VARCHAR(20))";
	   // String sql1 ="INSERT INTO CUSTOMER(ID,NAME)VALUES (1, 'Ramesh' );";
	      //String sql2 ="INSERT INTO CUSTOMER(ID,NAME)VALUES (2, 'sona' );";
	      String sql3 ="DELETE  FROM CUSTOMER WHERE ID=1";  
	    st.executeUpdate(sql3);	
       
	

	st.close();
	con.close();
}
}