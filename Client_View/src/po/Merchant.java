package po;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement  
public class Merchant {
	int mId; //Auto
	String mPersonName;
	String mTel;
	String mIdCard;
	String mCarfPath;
	String mLocation;
	String mBrand;
	String mLogoPath;
	String mPassword;
	public Merchant(){}
	public Merchant(int mId, String mPersonName, String mTel, String mIdCard, String mCarfPath, String mLocation,
			String mBrand, String mLogoPath, String mPassword) {
		super();
		this.mId = mId;
		this.mPersonName = mPersonName;
		this.mTel = mTel;
		this.mIdCard = mIdCard;
		this.mCarfPath = mCarfPath;
		this.mLocation = mLocation;
		this.mBrand = mBrand;
		this.mLogoPath = mLogoPath;
		this.mPassword = mPassword;
	}	public Merchant( String mPersonName, String mTel, String mIdCard, String mCarfPath, String mLocation,
			String mBrand, String mLogoPath, String mPassword) {
		super();
		this.mPersonName = mPersonName;
		this.mTel = mTel;
		this.mIdCard = mIdCard;
		this.mCarfPath = mCarfPath;
		this.mLocation = mLocation;
		this.mBrand = mBrand;
		this.mLogoPath = mLogoPath;
		this.mPassword = mPassword;
	}
	public Merchant(String mLocation2, String mBrand2, String mLogoPath2) {
		// TODO Auto-generated constructor stub
		this.mLocation = mLocation;
		this.mBrand = mBrand;
		this.mLogoPath = mLogoPath;
	}
	public int getmId() {
		return mId;
	}
	public void setmId(int mId) {
		this.mId = mId;
	}
	public String getmPersonName() {
		return mPersonName;
	}
	public void setmPersonName(String mPersonName) {
		this.mPersonName = mPersonName;
	}
	public String getmTel() {
		return mTel;
	}
	public void setmTel(String mTel) {
		this.mTel = mTel;
	}
	public String getmIdCard() {
		return mIdCard;
	}
	public void setmIdCard(String mIdCard) {
		this.mIdCard = mIdCard;
	}
	public String getmCarfPath() {
		return mCarfPath;
	}
	public void setmCarfPath(String mCarfPath) {
		this.mCarfPath = mCarfPath;
	}
	public String getmLocation() {
		return mLocation;
	}
	public void setmLocation(String mLocation) {
		this.mLocation = mLocation;
	}
	public String getmBrand() {
		return mBrand;
	}
	public void setmBrand(String mBrand) {
		this.mBrand = mBrand;
	}
	public String getmLogoPath() {
		return mLogoPath;
	}
	public void setmLogoPath(String mLogoPath) {
		this.mLogoPath = mLogoPath;
	}
	public String getmPassword() {
		return mPassword;
	}
	public void setmPassword(String mPassword) {
		this.mPassword = mPassword;
	}
}
