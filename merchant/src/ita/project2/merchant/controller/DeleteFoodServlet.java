package ita.project2.merchant.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ita.project2.merchant.service.FoodManageService;
import ita.project2.merchant.service.impl.FoodManageServiceImpl;

/**
 * Servlet implementation class DeleteFoodServlet
 */
public class DeleteFoodServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteFoodServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("======================");
		FoodManageService foodManageService = new FoodManageServiceImpl();
		int fId = Integer.parseInt(request.getParameter("fId"));
		int count = foodManageService.deleteFoodByFId(fId);
//		System.out.println(count);
		if(count == 1){
//			request.getRequestDispatcher("/showAllFoodServlet").forward(request, response);
			
			PrintWriter out = response.getWriter();
			out.write("<script>alert('success!')</script>");// window.location.href=""; 
			out.write("<script>window.location.href='showAllFoodServlet'</script>");
		}
	}

}
