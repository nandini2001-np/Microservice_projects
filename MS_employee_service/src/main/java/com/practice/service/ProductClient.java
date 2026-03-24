package com.practice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.practice.dto.ProductDTO;

//@FeignClient(url="http://localhost:6060",value="PRODUCT")
public interface ProductClient {


//	
//	@GetMapping("/api/product/code/{code}")
//	public ProductDTO getProductByCode(@PathVariable ("code") String code);
}
//
