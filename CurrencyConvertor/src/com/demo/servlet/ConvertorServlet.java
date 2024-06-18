package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConvertorServlet  extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private float drate,prate,erate;
	
	public void init(ServletConfig config) {
		drate = Float.parseFloat(config.getInitParameter("dollar"));
		prate = Float.parseFloat(config.getInitParameter("pound"));
		erate = Float.parseFloat(config.getInitParameter("euro"));
	}
 public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
 {
	 res.setContentType("text/html");
	 PrintWriter out= res.getWriter();
	 
	 double amount = Double.parseDouble(req.getParameter("amount"));
		String currency = req.getParameter("cur");
		double amt = 0;
		float rate = 0;
		switch(currency) {
			case "dollar":
				amt = amount/drate;
				rate = drate;
				break;
			case "pound":
				amt = amount/prate;
				rate = prate;
				
				break;
			case "euro" :
				amt = amount/erate;
				rate = erate;
				break;
		}
		out.println("Amount in Rs: "+ amount + " Rs.");
		out.println(currency+ " Rate: "+ rate);
		out.println("Converted Amount: "+Math.round(amt));

		out.println("<a href='CurrencyConvertor.html'>Calculate Again Click Here</a>");
	}

	
 }
 

