package clientServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import po.Merchant;

/**
 * Servlet implementation class ShowAllMerchant
 */
public class ShowAllMerchantServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowAllMerchantServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Merchant merchant=new Merchant(1, "Sunvin", "13726259726", "441381155656565645", "D://", "ZHA", "SUN", "1.jpg", "123456");

		HttpSession session = request.getSession();
		session.setAttribute("merchant", merchant);
		System.out.println(merchant.getmBrand());
		request.getRequestDispatcher("Merchant.jsp").forward(request, response);
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
