package ita.project2.merchant.util;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MapMessage;
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

import ita.project2.merchant.jms.MQPooledConnectionFactory;

public class SendToJMS {

	public static void sendMerchant(String merchantXML) {
		
		ActiveMQConnectionFactory connectionFactory = null;  
        Connection connection = null;  
        Session session = null;  
        Queue queue = null;  
        MessageProducer producer = null;  
        MapMessage messagep = null;   
        // ====================================  
        try {  
            connectionFactory = MQPooledConnectionFactory.getMyActiveMQConnectionFactory();  
            connection = connectionFactory.createConnection();  
            connection.start(); 

            session = connection.createSession(false, session.AUTO_ACKNOWLEDGE);              
            queue = session.createQueue("hyman001");  
            producer = session.createProducer(queue);  
            Message message = session.createTextMessage(merchantXML);
            producer.send(message);
            
            connection.close();
                      
        } catch (Exception e) {  
            e.printStackTrace();  
        } 
        
		

		System.out.println("send message completed");
		
	}

}
