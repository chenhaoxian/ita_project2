package ita.project2.merchant.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ita.project2.merchant.model.Merchant;
import ita.project2.merchant.service.LoginService;
import ita.project2.merchant.service.impl.LoginServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String mTel = request.getParameter("mTel");
		String mPassword = request.getParameter("mPassword");
		LoginService loginService = new LoginServiceImpl();
		
		if(loginService.login(mTel, mPassword)){
			Merchant merchant = new Merchant();
			merchant.setmTel(mTel);
			HttpSession session = request.getSession();
			session.setAttribute("merchant", merchant);
			request.getRequestDispatcher("view/auditPage.jsp").forward(request, response);
		}else{
			PrintWriter out = response.getWriter();
			out.write("<script>alert('login fail!')</script>");
//			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
		
	}

}
