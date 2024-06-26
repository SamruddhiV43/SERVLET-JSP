package com.demo.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.beans.Employee;
import com.demo.service.EmpService;
import com.demo.service.EmpServiceImpl;

@WebServlet("/updateEmpDetails")
public class UpdateEmp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("eid"));
		String name=request.getParameter("nm");
		String gen=request.getParameter("gen");
		double sal=Double.parseDouble(request.getParameter("sal"));
		String email=request.getParameter("email");
		String pos=request.getParameter("pos");
		
		Employee e = new Employee(id,name,gen,sal,email,pos);
		EmpService eservice = new EmpServiceImpl();
		boolean result =eservice.updateEmp(e);
		if(result) {
			RequestDispatcher rd = request.getRequestDispatcher("/EmpDisplay");
			rd.forward(request, response);
		}
	}

}
