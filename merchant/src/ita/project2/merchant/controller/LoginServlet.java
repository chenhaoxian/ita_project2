package ita.project2.merchant.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ita.project2.merchant.model.Merchant;
import ita.project2.merchant.service.AuditService;
import ita.project2.merchant.service.LoginService;
import ita.project2.merchant.service.impl.AuditServiceImpl;
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
		request.setCharacterEncoding("utf-8");
		String mTel = request.getParameter("mTel");
		String mPassword = request.getParameter("mPassword");
		LoginService loginService = new LoginServiceImpl();
		AuditService auditService = new AuditServiceImpl();
		
		if(loginService.login(mTel, mPassword)){
			Merchant merchant = new Merchant();
			String name = loginService.getPersonName(mTel);
			merchant.setmTel(mTel);
			merchant.setmPersonName(name);
			HttpSession session = request.getSession();
			session.setAttribute("merchant", merchant);
//			request.getRequestDispatcher("view/auditPage.jsp").forward(request, response);
			int status = auditService.findMerchantStatus(mTel);
			if(status == 1){
				request.getRequestDispatcher("view/waitPage.jsp").forward(request, response);
			}else if(status == 2){
				request.getRequestDispatcher("view/addFoodPage.jsp").forward(request, response);
			}else if(status == 3){
				PrintWriter out = response.getWriter();
				out.write("<script>window.location.href='view/auditPage.jsp'</script>");
			}else if(status == 4){
				PrintWriter out = response.getWriter();
				out.write("<script>alert('Sorry !')</script>");
				out.write("<script>window.location.href='index.jsp'</script>");
			}
			
		}else{
			PrintWriter out = response.getWriter();
			out.write("<script>alert('login fail!')</script>");//out.write("<script>alert('fail!')</script>");
			out.write("<script>window.location.href='index.jsp'</script>");
//			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
		
	}

}
