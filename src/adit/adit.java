package adit;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
public class adit {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		//Drive register
	DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
	Class.forName("com.mysql.cj.jdbc.Driver");
	//System.out.println("connected databases");
	
	
	 //-----------------show databases--------------//
	
	// Connection conn =DriverManager.getConnection("jdbc:mysql://localhost","root","");
    // System.out.println("Connected Established: " + conn);
// 
//     Statement st = conn.createStatement();
//	 ResultSet rs = st.executeQuery("show databases");
//    System.out.println("Databases are: " + rs);
//    while(rs.next()) {
//	 System.out.println(rs.getString(1));
// }
    
    
  //---------------create new database--------------//
//    Connection conn =DriverManager.getConnection("jdbc:mysql://localhost","root","");
//	System.out.println("successfuly connected" + conn);
//	Statement st = conn.createStatement();
//	st.executeUpdate("Create database shubh");
//
//	System.out.println("Database created");
	
	
	
	//------------------create table------------------//
	
//	Connection conn =DriverManager.getConnection("jdbc:mysql://localhost/shubh","root","");
//	String sql ="create table nsti(id int,name varchar(30),address varchar(50),mail varchar(45)primary key)";
//	Statement st = conn.createStatement();
//	st.executeUpdate(sql);
//	System.out.println("Table created ");
	
	
	
	//----------------------insert data---------------//
	
//     Connection conn =DriverManager.getConnection("jdbc:mysql://localhost/shubh","root","");
//	 String query ="insert into nsti values(01,'Trapti','Etawah','trapti@abc.com')";
//	 Statement st = conn.createStatement();
//	 st.executeUpdate(query);
//    System.out.println("Data inserted");
	 
	 
	//----------------------insert multi  data---------------//
//     Connection conn =DriverManager.getConnection("jdbc:mysql://localhost/shubh","root","");
//	 String query ="insert into nsti values (01,'abc','mau','p@abc.com'),(02,'abd','Mudera','aab@abc.com'),(03,'piu','mau','ap@abc.com'),(04,'lido','kolkata','a@abc.com')";
//	 Statement st = conn.createStatement();
//	 st.executeUpdate(query);
//	 System.out.println("Data inserted");
	 
	 
	 //--------------------show details---------------//
//	 Connection conn =DriverManager.getConnection("jdbc:mysql://localhost/shubh","root","");
//	 String query ="select * from nsti";
//	 Statement st = conn.createStatement();
//	 ResultSet res = st.executeQuery(query);
//	 
//	 while(res.next()) {
//		 System.out.println(res.getString("id") + " " + res.getString("name") + " " + res.getString("address") + " " + res.getString("mail"));
	
//	 }
	 
	//----------------------show select data detail---------//
	
//	 Connection conn =DriverManager.getConnection("jdbc:mysql://localhost/shubh","root","");
//	 String query ="select * from nsti where id = '3'";
//	 Statement st = conn.createStatement();
//	 ResultSet res = st.executeQuery(query);
//	 
//	 while(res.next()) {
//		 System.out.println(res.getString("id") + "-" + res.getString("name") + "-" + res.getString("address") + "-" + res.getString("mail"));
//	 }
	 

	 //--------------------data update-------------------------//
	
//	 Connection conn =DriverManager.getConnection("jdbc:mysql://localhost/shubh","root","");
//	 String query ="update nsti set name = 'pushpa' where name = 'anjali'"; 
//	 Statement st = conn.createStatement();
//	 st.executeUpdate(query);
//	 System.out.println("Data Updated");
	 
	 
	 //--------------------delete data through id-------------//
//	 Connection conn =DriverManager.getConnection("jdbc:mysql://localhost/shubh","root","");
//	 String query ="Delete from nsti where id = '3' " ;
//	 Statement st = conn.createStatement();
//	 st.executeUpdate(query);
//	 System.out.println("Data deleted");
	 
	 //--------------------delete table-------------//
//	 Connection conn =DriverManager.getConnection("jdbc:mysql://localhost/shubh","root","");
//	 String query ="Drop Table nsti " ;
//	 Statement st = conn.createStatement();
//	 st.executeUpdate(query);
//	 System.out.println("Table Deleted");
//	
	
	 
	 
	 //------------------add new column----------------//
//	 Connection conn =DriverManager.getConnection("jdbc:mysql://localhost/shubh","root","");
//	 String query ="Alter table nsti add column course int" ;
//	 Statement st = conn.createStatement();
//	 st.executeUpdate(query);
//	 System.out.println("New column added");
//	
	
	 //------------------delete column------------------//
	 
	 Connection conn =DriverManager.getConnection("jdbc:mysql://localhost/shubh","root","");
	 String query ="Alter table nsti drop course" ;
	 Statement st = conn.createStatement();
	 st.executeUpdate(query);
	 System.out.println("delete column");
	 }
	
	}


