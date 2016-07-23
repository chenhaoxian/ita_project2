package ita.project2.merchant.model;

public class Merchant {
	
	private int mId;
	private String mPersonName;
	private String mTel;
	private String mIdCard;
	private String mCardPath;
	private String mLocation;
	private String mBrand;
	private String mLogoPath;
	private String mPassword;
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
	public String getmCardPath() {
		return mCardPath;
	}
	public void setmCardPath(String mCardPath) {
		this.mCardPath = mCardPath;
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
	@Override
	public String toString() {
		return "Merchant [mId=" + mId + ", mPersonName=" + mPersonName + ", mTel=" + mTel + ", mIdCard=" + mIdCard
				+ ", mCardPath=" + mCardPath + ", mLocation=" + mLocation + ", mBrand=" + mBrand + ", mLogoPath="
				+ mLogoPath + ", mPassword=" + mPassword + "]";
	}
	
	
	

}
