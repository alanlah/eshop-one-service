package com.eshop.oneservice.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.eshop.oneservice.fallback.EshopPriceFallBack;

@FeignClient(value = "eshop-price-service",fallback = EshopPriceFallBack.class)
public interface EshopPriceService {

	@RequestMapping(value = "/product-price/findByProductId", method = RequestMethod.GET)
	String findByProductId(@RequestParam(value = "productId") Long productId);

}
