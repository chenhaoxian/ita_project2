package com.oocl.ita.starkxiao.project2.admin.actions;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import com.oocl.ita.starkxiao.project2.admin.util.JMSRunner;

/**
 * Servlet implementation class Runner
 */
public class Runner extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private JMSRunner jms;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Runner() {
        super();
		jms = JMSRunner.getInstance();
		if(jms!=null){
			jms.start();
		}
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("the runner down.");
	}

}
