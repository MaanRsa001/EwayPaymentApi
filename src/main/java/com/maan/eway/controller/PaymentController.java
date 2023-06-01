package com.maan.eway.controller;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maan.eway.req.PaymentSaveReq;
import com.maan.eway.res.CommonRes;
import com.maan.eway.res.SuccessRes;
import com.maan.eway.service.PaymentService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/Payment")
public class PaymentController {
	
	@Autowired
	private PaymentService service;
	
	@PostMapping("/citylimit")
	@ApiOperation(value = "This method is to Payment Sava")
	public ResponseEntity<CommonRes> PaymentSave(@RequestBody PaymentSaveReq req) {
		CommonRes data = new CommonRes();

		SuccessRes res = service.PaymentSave(req);
		data.setCommonResponse(res);
		data.setIsError(false);
		data.setErrorMessage(Collections.emptyList());
		data.setMessage("Success");

		if (res != null) {
			return new ResponseEntity<CommonRes>(data, HttpStatus.CREATED);
		} else {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}

	}
}
