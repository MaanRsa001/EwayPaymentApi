package com.maan.eway.service;

import com.maan.eway.req.PaymentSaveReq;
import com.maan.eway.res.SuccessRes;

public interface PaymentService {

	public SuccessRes PaymentSave(PaymentSaveReq req);
	

}
