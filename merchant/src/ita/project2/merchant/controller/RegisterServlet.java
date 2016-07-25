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
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String mPersonName = request.getParameter("mPersonName");
		String mTel = request.getParameter("mTel");
		String mPassword = request.getParameter("mPassword");
//		System.out.println(mPassword+"..."+mTel+"..."+mPassword);
		
		LoginService registerService = new LoginServiceImpl();
		
		int count = registerService.register(mPersonName, mTel, mPassword);
		
		if(count ==1 ){
			Merchant merchant = new Merchant();
			merchant.setmTel(mTel);
			merchant.setmPersonName(mPersonName);
			HttpSession session = request.getSession();
			session.setAttribute("merchant", merchant);
			int num = registerService.saveMerchantInPermission(mTel);
			if(num == 1){
				request.getRequestDispatcher("view/auditPage.jsp").forward(request, response);
			}else{
				PrintWriter out = response.getWriter();
				out.write("<script>alert('fail!')</script>");// window.location.href=""; 
				out.write("<script>window.location.href='${pageContext.request.contextPath }/view/register.jsp'</script>");
			}
			
		}else {
			PrintWriter out = response.getWriter();
			out.write("<script>alert('fail!')</script>");// window.location.href=""; 
			out.write("<script>window.location.href='${pageContext.request.contextPath }/view/register.jsp'</script>");
		}
		
	}

}
