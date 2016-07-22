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
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DiskFileItemFactory factory = new DiskFileItemFactory();
		
		String pathTemp = this.getServletContext().getRealPath("/temp");
		String path = this.getServletContext().getRealPath("res/images/upload");
//		String path = "res/images/upload";
		
		factory.setSizeThreshold(1024*100);
		factory.setRepository(new File(pathTemp));
		
		HttpSession session = request.getSession();
		Merchant merchant = (Merchant) session.getAttribute("merchant");
		
		String mIdCard = request.getParameter("mIdCard");
		String mLocation = request.getParameter("mLocation");
		String mBrand = request.getParameter("mBrand");
		
		merchant.setmIdCard(mIdCard);
		merchant.setmLocation(mLocation);
		merchant.setmBrand(mBrand);
		
		try {
			ServletFileUpload fu = new ServletFileUpload(factory);
			List<FileItem> fis = fu.parseRequest(request);
			
			for(FileItem item:fis){
				if(item.isFormField()){
					System.out.println(item.getFieldName());
					System.out.println(item.getString());
				}else{
					String fileName = item.getName();
					System.out.println(path+"\\"+fileName);
					item.write(new File(path,merchant.getmTel()+item.getFieldName()+fileName));
					if("idCardImage".equals(item.getFieldName())){
						merchant.setmCardPath((merchant.getmTel()+item.getFieldName()+fileName));
					}else{
						merchant.setmLogoPath(merchant.getmTel()+item.getFieldName()+fileName);
					}
				}
			}
			System.out.println(merchant.toString());
		} catch (FileUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
