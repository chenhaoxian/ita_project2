
package util.parse;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import po.Merchant;

public class Parse {
	public static String objectToXML(Object object) {
		 Merchant merchant = new Merchant("Sunvin","7626110","4413855647789576","http://usr.im/200x150","ZhuHai","SUN","http://usr.im/200x150","123465");
	      
	            StringWriter writer = new StringWriter();  
	            try {   
	            JAXBContext context = JAXBContext.newInstance(Merchant.class);  
	            Marshaller marshaller = context.createMarshaller();  
	            marshaller.marshal(merchant, writer);  
	            return writer.toString();
	        } catch (JAXBException e) {  
	            e.printStackTrace();  
	        }  
		return writer.toString();
		
	}
	
	public static Merchant xmlToObject(String xmlStr){
	 try {  
         JAXBContext context = JAXBContext.newInstance(Merchant.class);  
         Unmarshaller unmarshaller = context.createUnmarshaller(); 
         System.out.println("\n\nThe behind is result: ");
         Merchant merchant = (Merchant)unmarshaller.unmarshal(new StringReader(xmlStr));  
         return merchant;  
     } catch (JAXBException e) {
    	 System.out.println("The exception");
         e.printStackTrace();  
     }
	return null;

	}
	
}
