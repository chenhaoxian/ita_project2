package com.oocl.ita.starkxiao.project2.admin.dao.po;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Merchant {
	private int mId;
	private String mPersonName;
	private String mTel;
	private String mPassword;
	private String mIdCard;
	private String mCardPath;
	private String mLocation;
	private String mBrand;
	private String mLogoPath;
	private Integer mStatus;
	
	public int getmId() {
		return mId;
	}
	public void setmId(int mId) {
		this.mId = mId;
	}
	public String getmPersonName() {
		return mPersonName;
	}
	public void setmPersonName(String mPName) {
		this.mPersonName = mPName;
	}
	public String getmTel() {
		return mTel;
	}
	public void setmTel(String mTel) {
		this.mTel = mTel;
	}
	public String getmPassword() {
		return mPassword;
	}
	public void setmPassword(String mPassword) {
		this.mPassword = mPassword;
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
	public int getmStatus() {
		return mStatus;
	}
	public void setmStatus(Integer mStatus) {
		this.mStatus = mStatus;
	}
}
