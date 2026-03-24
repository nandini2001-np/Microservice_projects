package com.practice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class ApiResponseDTO {
	
	private ProductDTO productDTO;
	private OrderDTO orderDTO;

}
