package ita.project2.merchant.controller;

import java.io.IOException;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Session;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;

/**
 * Servlet implementation class SendToJMSServlet
 */
public class SendToJMSServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SendToJMSServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 创建工厂
		ConnectionFactory factory = new ActiveMQConnectionFactory("failover://tcp://localhost:61616");
		// 创建队列
		Destination queue = new ActiveMQQueue("hyman001");

		// 创建 并 开启连接
		Connection con;
		try {
			con = factory.createConnection();
			con.start();
			Session session = con.createSession(false, Session.CLIENT_ACKNOWLEDGE);
			
			
			
			con.close();
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
