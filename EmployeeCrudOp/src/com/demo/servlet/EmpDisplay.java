package com.demo.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.beans.Employee;
import com.demo.service.EmpService;
import com.demo.service.EmpServiceImpl;

public class EmpDisplay extends HttpServlet{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		EmpService eservice =new EmpServiceImpl();
		List<Employee> elist=eservice.getallEmp();
		request.setAttribute("elist", elist);
		System.out.println(elist);
		RequestDispatcher rd=request.getRequestDispatcher("displayemployee.jsp");
		rd.forward(request, response);
	}
}
