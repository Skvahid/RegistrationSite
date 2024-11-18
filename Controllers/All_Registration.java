package com.myproject.controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myproject.model.DAOServiceimpl;
@WebServlet("/allreg")
public class AllRegistrationcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public AllRegistrationcontroller() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	DAOServiceimpl service = new DAOServiceimpl();
	service.connectDB();
	ResultSet result = service.readAllRegistration();
	request.setAttribute("result", result);
	RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/all_registration.jsp");
	rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
