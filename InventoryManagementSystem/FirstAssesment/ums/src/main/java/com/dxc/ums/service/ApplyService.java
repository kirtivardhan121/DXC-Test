package com.dxc.ums.service;

import com.dxc.ums.exception.ApplyException;
import com.dxc.ums.model.ApplyBean;

public interface ApplyService {

	public void addApply(ApplyBean enqry) throws ApplyException;
	public ApplyBean getApplyDetails(long applyId) throws ApplyException;
	public boolean isValidApply(ApplyBean apply) throws ApplyException;
}//end of ApplyService
