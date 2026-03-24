package com.practice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.dto.ProductDTO;
import com.practice.entity.Product;
import com.practice.repo.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepo repo;

	@Override
	public ProductDTO saveProduct(ProductDTO productdto) {
		
	   

		Product product=new Product();
		product.setProductName(productdto.getProductName());
		product.setProductDescription(productdto.getProductDescription());
	    product.setProductPrice(productdto.getProductPrice());
		product.setProductCode(productdto.getProductCode());
		
		Product save = repo.save(product);
		
		return new ProductDTO(
				save.getId(),
				save.getProductName(),
				save.getProductDescription(),
			    save.getProductPrice(),
				save.getProductCode()
				);
		
		
		
		
	}

	
		@Override
		public ProductDTO findProductByCode(String productCode) {

		    Product product = repo.findByProductCode(productCode);

		    if (product == null) {
		        throw new RuntimeException("Product not found with code: " + productCode);
		    }

		    return new ProductDTO(
		            product.getId(),
		            product.getProductName(),
		            product.getProductDescription(),
		            product.getProductPrice(),
		            product.getProductCode()
		    );
		}

		
		
		
	}


