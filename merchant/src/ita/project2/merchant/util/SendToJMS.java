package ita.project2.merchant.util;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.memory.buffer.MessageQueue;

public class SendToJMS {

	public static void sendMerchant(String merchantXML) {
		// 创建工厂
		ConnectionFactory factory = new ActiveMQConnectionFactory("failover://tcp://localhost:61616");
		// 创建队列
		Destination queue = new ActiveMQQueue("hyman001");

		// 创建 并 开启连接
		Connection con;
		try {
			con = factory.createConnection();
			con.start();

			Session session = con.createSession(false, Session.AUTO_ACKNOWLEDGE); // true表是会话有事务
																					// 一个线程一个

			Message message = session.createTextMessage(merchantXML);
			MessageProducer producer = session.createProducer(queue);
			producer.send(message);;
			// session.commit();//true 时 需要
			System.out.println("send message completed");
			con.close();
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
