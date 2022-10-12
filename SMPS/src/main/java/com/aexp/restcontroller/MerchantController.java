package com.aexp.restcontroller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aexp.model.ResponseBinding;
import com.aexp.service.MerchantService;

@RestController
public class MerchantController {
	
	@Autowired
	private MerchantService merchantService;
	private 
	@PostMapping("/merchantDetails")
	public ResponseBinding saveMerchantDetails(@PathVariable String merchantId,@PathVariable String smpsId,@PathVariable String subCurrency)
	{
		ResponseBinding merchantPricingDetail = merchantService.getMerchantPricingDetail();
		return merchantPricingDetail;
		
	}

}
