package com.myproject.model;

import java.sql.ResultSet;

import com.mysql.cj.protocol.Resultset;

public interface DAOService {
	
	public void connectDB();
	public boolean verifylogin(String email,String password);
	public void createRegistration(String name,String course,String email,String mobile);
	public void updateRegistration();
	public void deleteRegistration();
	public ResultSet readAllRegistration();

}
