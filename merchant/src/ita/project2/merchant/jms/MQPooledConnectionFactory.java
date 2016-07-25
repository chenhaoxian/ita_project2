package ita.project2.merchant.jms;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.pool.PooledConnectionFactory;

public class MQPooledConnectionFactory {
	
	private static ActiveMQConnectionFactory connectionFactory;  

    public static ActiveMQConnectionFactory getMyActiveMQConnectionFactory() {  
        if (null == connectionFactory) {  
            connectionFactory = new ActiveMQConnectionFactory("failover://tcp://localhost:61616");  
        }  
        return connectionFactory;  
    }  
    private static PooledConnectionFactory pooledConnectionFactory;  
    static {  
        try {  

            ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory();  
            activeMQConnectionFactory.setUserName("admin");  
            activeMQConnectionFactory.setPassword("admin");  
            activeMQConnectionFactory.setBrokerURL("tcp://127.0.0.1:61616");  

            pooledConnectionFactory = new PooledConnectionFactory(activeMQConnectionFactory);  

            int maximumActive = 100;  
            pooledConnectionFactory.setMaximumActive(maximumActive);  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }  

    public static PooledConnectionFactory getPooledConnectionFactory() {  
        return pooledConnectionFactory;  
    }  

    @Override  
    protected void finalize() throws Throwable {  
        pooledConnectionFactory.stop();  
        super.finalize();  
    }  

}
