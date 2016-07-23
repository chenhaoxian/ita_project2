package com.oocl.ita.starkxiao.project2.admin.login;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oocl.ita.starkxiao.project2.admin.dao.po.Merchant;
import com.oocl.ita.starkxiao.project2.admin.service.AdminService;
import com.oocl.ita.starkxiao.project2.admin.service.AdminServiceImpl;

/**
 * Servlet implementation class Index
 */
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AdminService adminService = new AdminServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IndexServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		List<Merchant> merchants = adminService.listAllMerchant();
		Merchant testMerchant = new Merchant();
		testMerchant.setmId(1);
		testMerchant.setmPName("Testing");
		testMerchant.setmIdCard("123456789012345678");
		testMerchant.setmLocation("where am i");
		testMerchant.setmLogoPath("http://usr.im/200x30");
		testMerchant.setmBrand("Testing's shop");
		testMerchant.setmTel("138000138000");
		testMerchant.setmCardPath("http://usr.im/200x30");
		List<Merchant> merchants = new ArrayList<>();
		merchants.add(testMerchant);
		
		request.setAttribute("merchants", merchants);
		request.getRequestDispatcher("/view/index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
