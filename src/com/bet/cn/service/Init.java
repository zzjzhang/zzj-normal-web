package com.bet.cn.service;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletInit
 */
@WebServlet(description = "Initialization", urlPatterns = { "/bet/init" })
public class Init extends HttpServlet {

	private static final long serialVersionUID = 1L;

    public Init() {
        super();
    }


	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}


	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}