package com.dxc.ums.dao;

import com.dxc.ums.exception.ApplyException;
import com.dxc.ums.model.ApplyBean;

public interface ApplyDAO {

	public void addApply(ApplyBean enqry) throws ApplyException;
	public ApplyBean getApplyDetails(long applyId) throws ApplyException;

}//end of ApplyDAO
