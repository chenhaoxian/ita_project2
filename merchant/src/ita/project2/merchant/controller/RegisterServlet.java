package ita.project2.merchant.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		String mPersonName = request.getParameter("mPersonName");
		String mTel = request.getParameter("mTel");
		String mPassword = request.getParameter("mPassword");
//		System.out.println(mPassword+"..."+mTel+"..."+mPassword);
		
		LoginService registerService = new LoginServiceImpl();
		
		int count = registerService.register(mPersonName, mTel, mPassword);
		
		if(count ==1 ){
			System.out.println("success");
		}
		
	}

}
