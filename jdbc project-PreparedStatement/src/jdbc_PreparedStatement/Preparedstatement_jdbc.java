package jdbc_PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Preparedstatement_jdbc
{
public static void main(String[] args) throws ClassNotFoundException, SQLException
{
Class.forName("oracle.jdbc.driver.OracleDriver");	
Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "tiger");
PreparedStatement preparedStatement = connection.prepareStatement("create table employee(eid number(10),ename varchar(10),esal number(10))");
preparedStatement.executeUpdate();
PreparedStatement preparedStatement2 = connection.prepareStatement("insert into employee values(?,?,?)");
preparedStatement2.setInt(1, 1673);
preparedStatement2.setString(2, "vijay");
preparedStatement2.setLong(3, 10098);
preparedStatement2.executeUpdate();
System.out.println("record is inserted & table created ");
connection.close();
	
	
	
}
}
