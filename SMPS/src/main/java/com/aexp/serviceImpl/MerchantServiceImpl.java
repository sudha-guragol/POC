package com.aexp.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.aexp.model.ResponseBinding;
import com.aexp.repository.MerchantRepository;
import com.aexp.service.MerchantService;

public class MerchantServiceImpl implements MerchantService{
@Autowired
private MerchantRepository merchantRepository;
	@Override
	public ResponseBinding getMerchantPricingDetail() {
		return merchantRepository.getMerchantPricingDetail();
		
	}

}
