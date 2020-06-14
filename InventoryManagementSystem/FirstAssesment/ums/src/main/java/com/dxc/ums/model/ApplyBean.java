package com.dxc.ums.model;

public class ApplyBean {

	private long applyId;
	private String fName;
	private String lName;
	private String contactNo;
	private String stream;
	private double aggregate;
	
	public ApplyBean() {
		// left unimplemented
	}

	public ApplyBean(long applyId, String fName, String lName, String contactNo, String stream, double aggregate) {
		super();
		this.applyId = applyId;
		this.fName = fName;
		this.lName = lName;
		this.contactNo = contactNo;
		this.stream = stream;
		this.aggregate = aggregate;
	}

	public long getApplyId() {
		return applyId;
	}

	public void setApplyId(long applyId) {
		this.applyId = applyId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public double getAggregate() {
		return aggregate;
	}

	public void setAggregate(double aggregate) {
		this.aggregate = aggregate;
	}

	@Override
	public String toString() {
		return "ApplyBean [applyId=" + applyId + ", fName=" + fName + ", lName=" + lName + ", contactNo=" + contactNo
				+ ", stream=" + stream + ", aggregate=" + aggregate + "]";
	}	
	
}//end of ApplyBean
