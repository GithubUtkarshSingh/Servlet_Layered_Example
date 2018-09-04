package com.ut.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.xml.internal.ws.wsdl.writer.document.Service;
import com.ut.Dto.StudentDto;
import com.ut.Vo.StudentVO;


//@WebServlet(name = "St", urlPatterns = { "/St" })
public class StudentControllerServlet extends HttpServlet 
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		StudentVO vo=null;
		String no=null,name=null,m1=null,m2=null,m3=null;
		StudentDto dto=null;
		Service service=null;
		String result=null;
		PrintWriter pw=null;
		ServletOutputStream sos=null;
		//read form data
		no=req.getParameter("no");
		name=req.getParameter("name");
		m1=req.getParameter("m1");
		m2=req.getParameter("m2");
		m3=req.getParameter("m3");
		//Create VO class object having form data
	   // vo=new StudentDto();
	    dto.setSno(Integer.parseInt(vo.getSno()));
	    dto.setSname(vo.getSname());
	    dto.setM1(Integer.parseInt(vo.getM1()));
	    dto.setM2(Integer.parseInt(vo.getM2()));
	    dto.setM3(Integer.parseInt(vo.getM3()));
	    //use Service class
	  //  service=new Service();
	   // result=service.generateResult(dto);
	    //display Result
	    sos=res.getOutputStream();
	    pw=res.getWriter();
	    res.setContentType("text/html");
	    pw.println("<h1>Result"+result+"<h1>");
	    //add hyperlink
	    pw.println("<a href='home.html'>home</a>");
	    //close steams
	    pw.close();
	}//doGet(-'-)
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}//doPost(-,-)
}//class