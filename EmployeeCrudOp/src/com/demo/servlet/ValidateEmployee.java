package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.demo.beans.MyUser;
import com.demo.service.EmpService;
import com.demo.service.EmpServiceImpl;

public class ValidateEmployee extends HttpServlet{
   public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
	   res.setContentType("text/html");
	   PrintWriter out=res.getWriter();
	   String uname=req.getParameter("uname");
	   String pass=req.getParameter("pass");
	   
	   EmpService eservice= new EmpServiceImpl();
	   MyUser u=eservice.ValidateEmp(uname,pass);
	   
	   if(u!=null)
		{
			HttpSession session=req.getSession();
			session.setAttribute("user", u);
			RequestDispatcher rd=req.getRequestDispatcher("EmpDisplay");
			rd.forward(req, res);
		}
		else {
			out.println("credential are wrong...please reenter");
			RequestDispatcher rd=req.getRequestDispatcher("Login.jsp");
			rd.include(req, res);
		}
   }
}
