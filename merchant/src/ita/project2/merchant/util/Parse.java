package ita.project2.merchant.util;

import java.io.OutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.jdom.Document;
import org.jdom.Element;

import ita.project2.merchant.model.Merchant;

public class Parse {
	
	public static String ParseMerchantToXML(Merchant merchant){
		
//		Document doc = new Document();
//		Element root = new Element("Merchant");
//		doc.setRootElement(root);
//		
//		Element mPersonName = new Element("mPersonName");
//		mPersonName.setText(merchant.getmPersonName());
//		Element mTel = new Element("mTel");
//		mTel.setText(merchant.getmTel());
//		Element mIdCard = new Element("mIdCard");
//		mIdCard.setText(merchant.getmIdCard());
//		Element mCardPath = new Element("mCardPath");
//		mCardPath.setText(merchant.getmCardPath());
//		Element mLocation = new Element("mLocation");
//		mLocation.setText(merchant.getmLocation());
//		Element mBrand = new Element("mBrand");
//		mBrand.setText(merchant.getmBrand());
//		Element mLogoPath = new Element("mLogoPath");
//		mLogoPath.setText(merchant.getmLogoPath());
//		
//		root.addContent(mPersonName);
//		root.addContent(mTel);
//		root.addContent(mIdCard);
//		root.addContent(mCardPath);
//		root.addContent(mLocation);
//		root.addContent(mBrand);
//		root.addContent(mLogoPath);
//		
//		return doc.toString();
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("<Merchant><mPersonName>").append(merchant.getmPersonName()).append("</mPersonName><mTel>")
			.append(merchant.getmTel()).append("</mTel><mIdCard>").append(merchant.getmIdCard()).append("</mIdCard><mCardPath>").append(merchant.getmCardPath())
			.append("</mCardPath><mLocation>").append(merchant.getmLocation()).append("</mLocation><mBrand>").append(merchant.getmBrand())
			.append("</mBrand><mLogoPath>").append(merchant.getmLogoPath()).append("</mLogoPath></Merchant>");
		
		return sb.toString();
        
	}

}
