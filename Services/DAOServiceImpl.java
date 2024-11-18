package com.myproject.model;

import java.sql.*;

import com.mysql.cj.protocol.Resultset;

public class DAOServiceimpl implements DAOService {
	private Connection con;
     private Statement stmnt;
     
	@Override
	public void connectDB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		 con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/nov_reg_db","root","Vahid@123");
		stmnt = con.createStatement();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean verifylogin(String email,String password) {
		try {
			ResultSet result =stmnt.executeQuery("select * from login where email='"+email+"' and password='"+password+"'");
			return result.next();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
@Override
	public void createRegistration(String name,String course,String email,String mobile) {
try {
	stmnt.executeUpdate("insert into Registration values('"+name+"','"+course+"','"+email+"','"+mobile+"')");
		
}catch(Exception e) {
	e.printStackTrace();
}
	
	}

	public ResultSet readAllRegistration() {
		
		try {
			ResultSet result =stmnt.executeQuery("select * from Registration ");
			return result;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
