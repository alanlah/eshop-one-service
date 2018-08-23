package com.eshop.oneservice.fallback;

import org.springframework.stereotype.Component;

import com.eshop.oneservice.service.EshopPriceService;

@Component
public class EshopPriceFallBack implements EshopPriceService {

	@Override
	public String findByProductId(Long productId) {
		return "huoqu jia ge shi bai";
	}

}
