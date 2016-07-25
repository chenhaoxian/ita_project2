
package com.oocl.ita.starkxiao.project2.admin.util;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.oocl.ita.starkxiao.project2.admin.dao.po.Merchant;

public class Parse {
	public static String objectToXML(Merchant object) {
		// Merchant merchant = new
		// Merchant("Sunvin","7626110","4413855647789576","http://usr.im/200x150","ZhuHai","SUN","http://usr.im/200x150","123465");

		StringWriter writer = new StringWriter();
		try {
			JAXBContext context = JAXBContext.newInstance(Merchant.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.marshal(object, writer);
			
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		
		System.out.println(writer.toString());
		
		//add a exception
		return writer.toString();

	}

	public static Merchant xmlToObject(String xmlStr) {
		Merchant merchant = null;
		try {
			JAXBContext context = JAXBContext.newInstance(Merchant.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			merchant = (Merchant) unmarshaller.unmarshal(new StringReader(xmlStr));
		} catch (JAXBException e) {
			System.out.println("The exception");
			e.printStackTrace();
		}

		return merchant;
	}

	
	public static void main(String[] args) {
		Merchant test = new Merchant();
		test.setmId(10);
		test.setmLocation("test");
		test.setmBrand("ad");
		test.setmCardPath("ddd");
		test.setmIdCard("sdfasf");
		test.setmPassword("fsf");
		test.setmTel("1233213");
		test.setmPersonName("stark");
		test.setmStatus(1);
		objectToXML(test);
		String temp = "<merchant><mPersonName>hyman</mPersonName><mTel>10086</mTel><mIdCard>1</mIdCard><mCardPath>10086idCardImage1.png</mCardPath><mLocation>2</mLocation><mBrand>3</mBrand><mLogoPath>10086logoImage2.png</mLogoPath></merchant>";
		Merchant m = (Merchant)xmlToObject(temp);
		System.out.println(m.getmBrand());
	}
}
