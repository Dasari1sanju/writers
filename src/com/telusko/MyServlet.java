package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MyServlet extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		PrintWriter out=res.getWriter();
		out.print("hi ");
		
		ServletContext ctx=getServletContext();
		String str= ctx.getInitParameter("name");
		//String str= ctx.getInitParameter("phone");

		out.println(str);
		
	}
}
