package com.httputil;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet{
private static final long serialVersionUID = 608264666035201733L;
	
	public void doGet(HttpServletRequest request,HttpServletResponse response){
		
	}
	
	public void doPost(HttpServletRequest request,HttpServletResponse response){
		try {
			PrintWriter pw = response.getWriter();
			pw.println("test");
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
