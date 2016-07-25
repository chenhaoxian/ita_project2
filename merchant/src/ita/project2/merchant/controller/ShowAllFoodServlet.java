package ita.project2.merchant.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ita.project2.merchant.model.Food;
import ita.project2.merchant.model.Merchant;
import ita.project2.merchant.service.FoodManageService;
import ita.project2.merchant.service.impl.FoodManageServiceImpl;

/**
 * Servlet implementation class ShowAllFoodServlet
 */
public class ShowAllFoodServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowAllFoodServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		FoodManageService foodManageService = new FoodManageServiceImpl();
		HttpSession session = req.getSession();
		Merchant merchant = (Merchant) session.getAttribute("merchant");
		int mId = foodManageService.findMTel(merchant.getmTel());
		
		List<Food> foodList = foodManageService.findAllFood(mId);
//		System.out.println(foodList.size());
		
		req.setAttribute("foodList", foodList);
		req.getRequestDispatcher("view/foodManagePage.jsp").forward(req, resp);
		
		
	}

}
