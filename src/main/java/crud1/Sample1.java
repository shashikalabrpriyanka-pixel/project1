package crud1;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Sample1 {
		

			public static void main(String[] args) throws ClassNotFoundException, SQLException {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee2","root","root");
		        Statement s= c.createStatement ();
		        
//		        s.execute("create database employee2");
//		        System.out.println("database created");
		        
//		        s.execute("create table employee_details(id int primary key,ename varchar(30))");
			     Scanner sc=new Scanner(System.in);
			     
//			     insert
//				CallableStatement cs=c.prepareCall("{call insert_emp(?,?)}");
//				
//				System.out.println("enter id:");
//				int id1=sc.nextInt();
//				cs.setInt(1, id1);
//				
//				System.out.println("enter name:");
//				String name=sc.next();
//				cs.setString(2, name);
//				
//				cs.execute();
//				System.out.println("inserted");
				
//				update
//			   CallableStatement cs1=c.prepareCall("{call update_emp(?,?)}");
//			   
//				
//				System.out.println("enter name:");
//				String name1=sc.next();
//				cs1.setString(1, name1);
//				
//				System.out.println("enter id");
//				   int id2=sc.nextInt();
//					cs1.setInt(2, id2);
//					
//				 cs1.execute();
//				 System.out.println("updated");
//				
						
			     
//			     delete
//			     CallableStatement cs2=c.prepareCall("{call delete_emp(?)}");
//			     System.out.println("enter id");
//			     int id3=sc.nextInt();
//			     cs2.setInt(1, id3);
//			     
//			     cs2.execute();
//			     System.out.println("deleted");
			     
//			     fetch
			     
			     CallableStatement cs3=c.prepareCall("{call select_emp()}");
			     ResultSet rs=cs3.executeQuery();
			    
				 while(rs.next()) {
			     System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}}
}
