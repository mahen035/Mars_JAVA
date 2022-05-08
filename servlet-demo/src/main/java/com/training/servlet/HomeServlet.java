package com.training.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.service.HomeService;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/home")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    String name = null;
    
    public void init() {
    	name = "Jacob";
    }
      
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Inside doGet method..");
		/*
		 * response.setContentType("text/html"); PrintWriter out = response.getWriter();
		 * out.println("<HTML>");
		 * out.println("<HEAD><TITLE>Servlet demo</TITLE></HEAD>");
		 * out.println("<BODY"); out.println("<H1>Hello from Servlet: </H1>"+name);
		 * out.println("</BODY></HTML>");
		 */
		
		//response.sendRedirect("home.jsp");
		
		//request.setAttribute("userName", name);
		
		String userName = request.getParameter("uname");
		
		String password = request.getParameter("pwd");
		
		HomeService service = new HomeService();
		
		if(service.validateUser(userName, password)) {
			
			request.setAttribute("userName", userName);
			
			RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
			
			rd.forward(request, response);
			
		}
		else {
			RequestDispatcher rd = request.getRequestDispatcher("failure.jsp");
			
			rd.forward(request, response);
		}
		
		
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Inside doPost....");
		doGet(request, response);
	}

}
