package ita.project2.merchant.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import ita.project2.merchant.model.Food;
import ita.project2.merchant.model.Merchant;
import ita.project2.merchant.service.FoodManageService;
import ita.project2.merchant.service.impl.FoodManageServiceImpl;
import ita.project2.merchant.util.Parse;
import ita.project2.merchant.util.SendToJMS;

/**
 * Servlet implementation class AddFoodServlet
 */
public class AddFoodServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddFoodServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		FoodManageService foodManageService = new FoodManageServiceImpl();
		DiskFileItemFactory factory = new DiskFileItemFactory();
		String pathTemp = this.getServletContext().getRealPath("/temp");
		String path = this.getServletContext().getRealPath("res/images/upload");
		String myPath = "D://upload";
		factory.setSizeThreshold(1024 * 100);
		factory.setRepository(new File(pathTemp));

		HttpSession session = request.getSession();
		Merchant merchant = (Merchant) session.getAttribute("merchant");
		Food food = new Food();
		int  mId = foodManageService.findMTel(merchant.getmTel());
		food.setmId(mId);
		
	    String fViewPathHeader =this.getServletContext().getInitParameter("foodUploadPath");//config.getInitParameter("foodUploadPath");  

		try {
			ServletFileUpload fu = new ServletFileUpload(factory);
			List<FileItem> fis = fu.parseRequest(request);

			for (FileItem item : fis) {
				if (item.isFormField()) {
					if ("fName".equals(item.getFieldName())) {
						food.setfName(item.getString());
					} else if ("fPrice".equals(item.getFieldName())) {
						food.setfPrice(Integer.parseInt(item.getString()));
					}
				} else {
					String fileName = item.getName();
					System.out.println(path + "\\" + fileName);
					item.write(new File(myPath, merchant.getmTel() + food.getfName() + fileName));
					if ("foodImage".equals(item.getFieldName())) {
						food.setfViewPath("http://"+fViewPathHeader+(merchant.getmTel() + food.getfName() + fileName));
					}
				}
			}
		} catch (FileUploadException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		System.out.println(food.toString());
		int saveCount = foodManageService.saveFood(food);
		if(saveCount == 1){
			PrintWriter out = response.getWriter();
			out.println("<script>alert('add food success!')</script>");
//			request.getRequestDispatcher("view/addFoodPage.jsp").forward(request, response);
			out.println("<script>window.location.href='view/addFoodPage.jsp'</script>')</script>");
		}else{
			PrintWriter out = response.getWriter();
			out.println("<script>alert('add food fail!')</script>");
//			request.getRequestDispatcher("view/addFoodPage.jsp").forward(request, response);
			out.println("<script>window.location.href='view/addFoodPage.jsp'</script>')</script>");
		}

	}

}
