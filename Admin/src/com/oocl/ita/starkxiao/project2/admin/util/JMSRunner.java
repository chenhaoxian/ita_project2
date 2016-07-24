package com.oocl.ita.starkxiao.project2.admin.util;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;

public class JMSRunner {
	private ConnectionFactory factory;
	private Connection conn;
	private Destination queue;
	private Session session;
	private MessageConsumer consumer;
	private static JMSRunner jmsRunner = null;
	private int port;
	private String ip;

	private JMSRunner(int port, String ip) {
		this.port = port;
		this.ip = ip;
	}

	public static synchronized JMSRunner getInstance() {
		System.out.println("getting instance!");
		if (jmsRunner == null) {
			jmsRunner = new JMSRunner(61616, "10.222.232.155");
		}
		return jmsRunner;
	}

	public void init(int port, String ip) {
		this.port = port;
		this.ip = ip;
	}

	public void start() {
		try {
			String temp = "failover://tcp://" + ip + ":" + port;
			System.out.println(temp);
			factory = new ActiveMQConnectionFactory(temp);
			conn = factory.createConnection();
			queue = new ActiveMQQueue("hyman001");
			conn.start();
			session = conn.createSession(true, Session.CLIENT_ACKNOWLEDGE);
			consumer = session.createConsumer(queue);

			consumer.setMessageListener(new MessageListener() {
				@Override
				public void onMessage(Message message) {
					TextMessage msg = (TextMessage) message;
					try {
						System.out.println(msg.getText());
						
//						session.commit();
					} catch (JMSException e) {
						e.printStackTrace();
					}
				}
			});
		} catch (JMSException e) {
			try {
				consumer.close();
				conn.close();
			} catch (JMSException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
	}
}
