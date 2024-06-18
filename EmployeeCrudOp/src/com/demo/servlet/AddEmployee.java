package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.beans.Employee;
import com.demo.service.EmpService;
import com.demo.service.EmpServiceImpl;


@WebServlet("/InsertEmp")
public class AddEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		
		 int id=Integer.parseInt(request.getParameter("eid"));
		 String name=request.getParameter("ename");
		 String gender=request.getParameter("gender");
		 double sal=Double.parseDouble(request.getParameter("salary"));
		 String email=request.getParameter("email");
		 String pos=request.getParameter("position");
		 EmpService eservice= new EmpServiceImpl();
		Employee e =new Employee(id,name,gender,sal,email,pos);
		 boolean result=eservice.insertEmp(e);
		 if(result)
		 {
			 RequestDispatcher rd = request.getRequestDispatcher("/EmpDisplay");
			 rd.forward(request, response);
		 }else
		 {
			 out.println("Employee details not added........Try again");
			 RequestDispatcher rd = request.getRequestDispatcher("AddEmp.jsp");
			 rd.include(request, response);
		 }
		 
		 
	}

}
