package pgm7;
import java.sql.*;

public class pgm7{ public static void main(String args[])
	{
	try
	{
	Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("Driver loaded successfully");
	Connection con = DriverManager.getConnection("jdbc:mysql:"+"//localhost:3306/student","root","root@123");
	System.out.println("Connection established Suceessfully");
	Statement stmt = con.createStatement();
	stmt.executeUpdate("insert into Student (Name,USN,Sem)" + "values('megha','4vv23cs121',3)");
	ResultSet rs = stmt.executeQuery("Select * from Student");
	System.out.println("Name\tUSN\t\tSem");
	while(rs.next())
	{
		System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t");
		
	}
	con.close();
	
	
		
	}
	catch(Exception e){
		System.out.println(e);
	}
	}

}
