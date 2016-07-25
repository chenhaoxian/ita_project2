package com.oocl.ita.starkxiao.project2.admin.actions;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oocl.ita.starkxiao.project2.admin.service.AdminService;
import com.oocl.ita.starkxiao.project2.admin.service.AdminServiceImpl;

/**
 * Servlet implementation class ConfirmAudition
 */
public class ConfirmAudition extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AdminService adminService = new AdminServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConfirmAudition() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String target = request.getParameter("tel");
		if(target != null){
			System.out.println("I'm in ConfirmSevlet, "+target);
			adminService.confirmMerchant(target);
		}
		response.sendRedirect(request.getContextPath()+"/Content/Audit");
	}

}
