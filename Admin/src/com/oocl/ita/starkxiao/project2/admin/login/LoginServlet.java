package com.oocl.ita.starkxiao.project2.admin.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oocl.ita.starkxiao.project2.admin.util.AuditPwdUtil;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AuditPwdUtil auditPwdUtil;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//query database to get the Merchant list
		request.getRequestDispatcher("view/login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		auditPwdUtil = new AuditPwdUtil();
		String pwd = request.getParameter("password");
		
		
		//if not be rejected, the page would redirect to the index of manager
		if(auditPwdUtil.checkPass(pwd)){
			response.getWriter().write("Redirect to the index, please wait.");
			request.getSession().setAttribute("pass", true);
			response.sendRedirect("Content/Index");
		}else{
			response.getWriter().write("Incorrect password!!");
			//if the request is not permitted, the page would display a tips
			//then reload the page
			response.setHeader("refresh", "2");
		}
		
	}

}
