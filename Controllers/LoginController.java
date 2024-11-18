package com.myproject.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myproject.model.DAOServiceimpl;
@WebServlet("/logincontroller")
public class Logincontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Logincontroller() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	String email = request.getParameter("email");
	String password = request.getParameter("password");
	DAOServiceimpl service = new DAOServiceimpl();
	service.connectDB();
	boolean status = service.verifylogin(email, password);
	if(status) {
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/createRegistration.jsp");
		rd.forward(request,response);
		
	}else {
		request.setAttribute("errormsg", "Invalid username/password");
		RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
		rd.forward(request,response);
	}
	}

}
