package ita.project2.merchant.jms;

import java.util.HashMap;
import java.util.Map;

public class MQ_Sender {
	
	public static void main(String[] args) throws Exception {  
        // 循环调用，这里定义调用两次  
        for (int i = 0; i < 2; i++) {  
            MQ_Service sender = MQ_Service.getInstance();  
            Map<String, String> map = new HashMap<String, String>();  
            map.put("MESS_NUM", "112110119");  
            map.put("MESS_DEPT", "本部");  
            sender.sendMessage(map);  
            System.out.println("数据已经发送完毕！");  
        }  
    }  

}
