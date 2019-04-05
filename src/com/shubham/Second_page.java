package com.shubham;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Second_page extends HttpServlet{
	public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException{
		
		int c = Integer.parseInt(req.getParameter("c"));	
		PrintWriter out = res.getWriter();
		out.println("Addition is " +c);
		c=c*c;
		out.println("square of Addition " +c);
	}

}
