package com.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.dto.ProductDTO;
import com.practice.service.ProductService;

@RestController
@RequestMapping("/api/product")

public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@PostMapping("/save")
	public ResponseEntity<ProductDTO> saveProduct(@RequestBody ProductDTO productdto){
		ProductDTO saveProduct = service.saveProduct(productdto);
		return new ResponseEntity<>(saveProduct,HttpStatus.CREATED);
	}
	
	
	@GetMapping("/code/{code}")
	public ResponseEntity<ProductDTO> getProductByCode(@PathVariable("code") String code){
		ProductDTO productdto = service.findProductByCode(code);
		return ResponseEntity.ok(productdto);
	}

}
