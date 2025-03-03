package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class jdbcDemo1 {
	public static void main(String[] args) throws ClassNotFoundException,SQLException
	{	
		Connection con;
		Statement st;
		ResultSet rs;
		try { 
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ig","root","root");
			System.out.println("connection success");
			 st=con.createStatement();
		 //BL
			st.executeUpdate("create table product(id int primary key,name varchar(20))");
		//	st.executeUpdate("insert into product values(4,'box')");
			//st.executeUpdate("insert into product values(5,'bag')");
		//	st.executeUpdate("insert into product values(3,'box3')");
			//st.execute("update product set name='table' where id=2");
			//st.execute("delete from product where id=3");
			
		//	ResultSet rs=st.executeQuery("select * from product");
			//while(rs.next()) {
			//	System.out.println(rs.getString(1)+  "  "+rs.getString(2));
			//}
			//System.out.println("table creation success");
			
					
		}
		catch(ClassNotFoundException | SQLException e) {
			
		}
		/*
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			rs.close();
			st.close();
			con.close();
		}
		
*/
	}

}


/*

<dependency>
<groupId>mysql</groupId>
<artifactId>mysql-connector-java</artifactId>
<version>8.0.28</version>
</dependency>



*/