package com.demo.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.service.EmpService;
import com.demo.service.EmpServiceImpl;

@WebServlet("/registerUser")
public class UserRegisteration extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id=Integer.parseInt(request.getParameter("uid"));
		String name=request.getParameter("nm");
		String uname=request.getParameter("uname");
		String gender=request.getParameter("gen");
		String email=request.getParameter("email");
		String city=request.getParameter("city");
		String pass=request.getParameter("pass");
		String role=request.getParameter("role");
		
		EmpService eservice = new EmpServiceImpl();
		
		eservice.registerNewUser(id,name,uname,gen,email,city,pass,role);
	}

}
