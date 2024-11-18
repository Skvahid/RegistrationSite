package com.myproject.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myproject.model.DAOServiceimpl;
@WebServlet("/createregistration")
public class createRegistrationcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public createRegistrationcontroller() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/createRegistration.jsp");
		rd.forward(request, response);
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String name = request.getParameter("name");
	String course = request.getParameter("course");
	String email = request.getParameter("email");
	String mobile = request.getParameter("mobile");
	DAOServiceimpl service = new DAOServiceimpl();
	service.connectDB();
	service.createRegistration(name, course, email, mobile);
	request.setAttribute("msg", "Record is Saved");
	RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/createRegistration.jsp");
	rd.forward(request, response);
	}

}
