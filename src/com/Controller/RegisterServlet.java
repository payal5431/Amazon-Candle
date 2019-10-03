package com.Controller;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.UserDao.*;

import com.Utilities.ConnectionManager;


@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private Connection connection=null;
	 private RequestDispatcher rd=null;
	private HttpSession session=null;
	 private UserDao dao=new UserDaoImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		connection= ConnectionManager.getConnection();
		
		String un=request.getParameter("userid");
		String pw=request.getParameter("password");
		User user=new User(un,pw);
		 if(dao.addUser(user))
		    {
			 	session=request.getSession();
		    	session.setAttribute("user", user);
		    	
			  rd=request.getRequestDispatcher("categories.jsp");
			  rd.forward(request,response);
		    }
		 else
		    {
		    	response.getWriter().println("<h1>Registration failed</h1>");
		    	rd=request.getRequestDispatcher("index.jsp");
		    	rd.include(request,response);
		    }
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
