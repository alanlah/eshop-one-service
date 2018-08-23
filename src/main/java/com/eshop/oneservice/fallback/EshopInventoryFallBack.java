package com.eshop.oneservice.fallback;

import org.springframework.stereotype.Component;

import com.eshop.oneservice.service.EshopInventoryService;

@Component
public class EshopInventoryFallBack implements EshopInventoryService {

	@Override
	public String findByProductId(Long productId) {
		return "获取库存失败";
	}

}
