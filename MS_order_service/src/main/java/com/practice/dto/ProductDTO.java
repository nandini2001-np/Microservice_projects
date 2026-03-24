package com.practice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class ProductDTO {
	private Long id;
	private String productName;
	private String productDescription;
	private Double productPrice;

	private String productCode;
	
}
