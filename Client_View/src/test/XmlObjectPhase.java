package test;
import java.io.IOException;
import java.io.StringReader;  

import javax.xml.bind.JAXBContext;  
import javax.xml.bind.JAXBException;  
import javax.xml.bind.Marshaller;  
import javax.xml.bind.Unmarshaller;  
import org.junit.Test;

import parseExample.Classroom;
import parseExample.Student;
import po.Merchant;
import util.parse.Parse;

public class XmlObjectPhase {
	Parse parse=new Parse();
	 @Test  
	    public void beanToXML() throws IOException {  
		 Merchant merchant = new Merchant("Sunvin","7626110","4413855647789576","http://usr.im/200x150","ZhuHai","SUN","http://usr.im/200x150","123465");
	        	System.out.println("\n***"+parse.objectToXML(merchant));
	           Merchant merchant2=parse.xmlToObject(parse.objectToXML(merchant));
	           System.out.println(merchant2.getmBrand());
	      
	  
	    }    
	 @Test  
	    public void XMLStringToBean(){ 
		 
	        String xmlStr = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><Merchant><age>22</age><classroom><grade>4</grade><id>1</id><name>软件工程</name></classroom><id>101</id><name>张三</name></Merchant>";  
	        try {  
	            JAXBContext context = JAXBContext.newInstance(Student.class);  
	            Unmarshaller unmarshaller = context.createUnmarshaller(); 
	            System.out.println("\n The behind is result: ");
	            Student student = (Student)unmarshaller.unmarshal(new StringReader(xmlStr));  
	            System.out.println(student.getAge());  
	            System.out.println(student.getClassroom().getName());  
	        } catch (JAXBException e) {  
	            e.printStackTrace();  
	        }  
	          
	    }

	 @Test
	 public void myXMLtoObject(){
		 String xmlStr = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><student><age>22</age><classroom><grade>4</grade><id>1</id><name>软件工程</name></classroom><id>101</id><name>张三</name></student>";  
		 Parse xmlToObject = new Parse();
		 xmlToObject.xmlToObject(xmlStr);
	 }
}
