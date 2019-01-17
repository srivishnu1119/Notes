package com.cg.controller;

import java.io.IOException;
import java.time.LocalDate;

import javax.security.auth.login.LoginException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				doPost(request, response);
			}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String user=request.getParameter("user");
		String pass=request.getParameter("pass");
		LocalDate date=LocalDate.now();
		try {
		if(user.equals("admin")&&pass.equals("admin")) {
			HttpSession session=request.getSession(true);
			request.setAttribute("name",user);
			request.setAttribute("date",date);
			request.getRequestDispatcher("Success.jsp").forward(request, response);;
		}else {
			request.setAttribute("err", "Please enter valid credentials");
			request.getRequestDispatcher("Login.jsp").forward(request,response);
			throw new LoginException();
		}
		}
		catch(LoginException lE) {
			System.out.println("caught");
		}
			
	}
}