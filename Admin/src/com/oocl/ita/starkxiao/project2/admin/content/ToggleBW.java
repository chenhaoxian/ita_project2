package com.oocl.ita.starkxiao.project2.admin.content;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oocl.ita.starkxiao.project2.admin.service.AdminService;
import com.oocl.ita.starkxiao.project2.admin.service.AdminServiceImpl;

/**
 * Servlet implementation class ToggleBW
 */
public class ToggleBW extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AdminService adminService = new AdminServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ToggleBW() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("id") != null){
			int target = Integer.parseInt(request.getParameter("id"));
			adminService.merchantBlockToggle(target);
		}
		response.sendRedirect("/Content/Index");
	}

}
