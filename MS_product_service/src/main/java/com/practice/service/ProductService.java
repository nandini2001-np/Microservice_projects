package com.practice.service;

import com.practice.dto.ProductDTO;

public interface ProductService {
	
	public ProductDTO saveProduct(ProductDTO productdto);
	public ProductDTO findProductByCode(String ProductDTO);

}
