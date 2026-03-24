package com.practice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class OrderDTO {
	private Long orderId;

    private String orderNumber;
    private Integer quantity;

    private Double totalPrice;    
    private String productCode;   
     
}



