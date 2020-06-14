package com.dxc.ums.service;

import java.util.ArrayList;
import java.util.List;

import com.dxc.ums.dao.ApplyDAO;
import com.dxc.ums.dao.ApplyDAOimpl;
import com.dxc.ums.exception.ApplyException;
import com.dxc.ums.model.ApplyBean;

public class ApplyServiceImpl implements ApplyService {

	private ApplyDAO applyDAO;

	public ApplyServiceImpl() throws ApplyException {
		this.applyDAO = new ApplyDAOimpl();
	}

	/* Application Id can not be zero or negative 
	 * it should not be repetitive
	 */
	public boolean isValidApplyId(long applyId) throws ApplyException {
		return applyId > 0 && (applyDAO.getApplyDetails(applyId)== null);
	}

	/* First Name can not be Null 
	 * it should be more than 4 characters and less than 20 characters
	 */
	public boolean isValidFname(String fName)throws ApplyException {
		return fName !=null && fName.length()>4 && fName.length()<20;
	}

	/* Last Name can not be Null 
	 * it should be more than 3 characters and less than 10 characters
	 */
	public boolean isValidLname(String lName)throws ApplyException {
		return lName !=null && lName.length()>3 && lName.length()<10;
	}

	/* Contact Number can not be Null 
	 * it should be exactly 10 digits
	 */
	public boolean isValidContactNo(String contactNo)throws ApplyException {
		return contactNo !=null && contactNo.length()==10;
	}

	/* Stream can not be Null 
	 * it should be more than 1 characters and less than 10 characters
	 */
	public boolean isValidStream(String stream)throws ApplyException {
		return stream !=null && stream.length()>=2 && stream.length()<10;
	}
	/* Aggregate should be more than zero 
	 */
	public boolean isValidAggregate(double aggregate)throws ApplyException {
		return aggregate >0;
	}

	/* isValidApply checks all the parameters and if it is correct 
	 * then it'll add data in database otherwise it will throw ApplyException
	 */
	@Override
	public boolean isValidApply(ApplyBean apply) throws ApplyException {

		boolean isValid = true;

		if(apply == null) {
			isValid = false;
			throw new ApplyException("All Feilds are mandatory");
		}

		List<String> errMsgs = new ArrayList<String>();

		if(!isValidApplyId(apply.getApplyId())) {
			errMsgs.add("Err: Apply Id can not be zero or negative, it can not be repitative");
		}

		if(!isValidFname(apply.getfName())) {
			errMsgs.add("Err: First Name can not be blank, and must be 5 to 20 characters in length");
		}

		if(!isValidLname(apply.getlName())) {
			errMsgs.add("Err: Last name Can not be blank, and must be 3 to 10 characters in length");
		}

		if(!isValidContactNo(apply.getContactNo())) {
			errMsgs.add("Err: Contact number can not be blank, and must be 10 characters in length");
		}

		if(!isValidStream(apply.getStream())) {
			errMsgs.add("Err: Stream can not be blank");
		}

		if(!isValidAggregate(apply.getAggregate())) {
			errMsgs.add("Err: Agrregate can not blank");
		}

		if(errMsgs.size()>0) {
			isValid = false;
			throw new ApplyException(errMsgs.toString());
		}

		return isValid;
	}

	@Override
	public void addApply(ApplyBean enqry) throws ApplyException {

		if(isValidApply(enqry)) {
			applyDAO.addApply(enqry);
		}
	}

	@Override
	public ApplyBean getApplyDetails(long applyId) throws ApplyException {

		return applyDAO.getApplyDetails(applyId);
	}

}//end of ApplyServiceImpl
