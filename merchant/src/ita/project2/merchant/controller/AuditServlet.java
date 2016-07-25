package ita.project2.merchant.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import ita.project2.merchant.model.Merchant;
import ita.project2.merchant.util.Parse;
import ita.project2.merchant.util.SendToJMS;

/**
 * Servlet implementation class AuditServlet
 */
public class AuditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AuditServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		DiskFileItemFactory factory = new DiskFileItemFactory();
		String pathTemp = this.getServletContext().getRealPath("/temp");
		String path = this.getServletContext().getRealPath("res/images/upload");
		String myPath = "D://upload";

		factory.setSizeThreshold(1024 * 100);
		factory.setRepository(new File(pathTemp));

		HttpSession session = request.getSession();
		Merchant merchant = (Merchant) session.getAttribute("merchant");

		try {
			ServletFileUpload fu = new ServletFileUpload(factory);
			List<FileItem> fis = fu.parseRequest(request);

			for (FileItem item : fis) {
				if (item.isFormField()) {

					if ("mIdCard".equals(item.getFieldName())) {
						merchant.setmIdCard(item.getString());
					} else if ("mLocation".equals(item.getFieldName())) {
						merchant.setmLocation(item.getString());
					} else if ("mBrand".equals(item.getFieldName())) {
						merchant.setmBrand(item.getString());
					}
				} else {
					String fileName = item.getName();
					System.out.println(path + "\\" + fileName);
					item.write(new File(myPath, merchant.getmTel() + item.getFieldName() + fileName));
					if ("idCardImage".equals(item.getFieldName())) {
						merchant.setmCardPath((merchant.getmTel() + item.getFieldName() + fileName));
					} else {
						merchant.setmLogoPath(merchant.getmTel() + item.getFieldName() + fileName);
					}
				}
			}
			// System.out.println(merchant.toString());
		} catch (FileUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String merchantXML = Parse.ParseMerchantToXML(merchant);

		SendToJMS.sendMerchant(merchantXML);

		request.getRequestDispatcher("view/waitPage.jsp").forward(request, response);

	}

}
