package clientServlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import po.Food;
import service.FoodManager;
import service.impl.FoodManagerImpl;

/**
 * Servlet implementation class ShowAllMenu
 */
public class ShowAllMenuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowAllMenuServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		System.out.println("Menu is coming");
//		Food food=new Food(1, "Dumpling", 1, 100, "fViewPath");
//		request.setAttribute("food", food);
//		System.out.println(food.getfId());	
//		int id=Integer.parseInt(request.getParameter("mId"));
		FoodManager foodManager=new FoodManagerImpl();
		int id=Integer.parseInt(request.getParameter("id"));
		List<Food> foods=foodManager.showAllFood(id);
		request.setAttribute("foods", foods);
		request.getRequestDispatcher("Menu.jsp").forward(request, response);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
