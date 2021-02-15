package com.nit.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MarriageServlet extends HttpServlet{
@Override
public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	PrintWriter pw=res.getWriter();
	res.setContentType("text/html");
	String name=req.getParameter("pname");
	float age=Float.parseFloat(req.getParameter("page"));
	String address=req.getParameter("paddress");
	//write b logic or request..
	if(age<=20)
		pw.println("<h1 style='color:red;text-align='center'>Mr/Miss."+name+"u r not eligible to merriage.</h1>");
	else
		pw.println("<h1 style='color:red;text-align='center'>Mr/Miss."+name+"u r  eligible to merriage..</h1>");
	
	pw.println("<a href='http://localhost:2525/MarriageApp1/form.html'><img src='image/home.png'></a>");
	
	pw.close();
     }
}
