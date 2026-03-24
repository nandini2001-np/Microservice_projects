package com.practice.service;

import com.practice.dto.ApiResponseDTO;
import com.practice.dto.OrderDTO;

public interface OrderService {
	
	OrderDTO saveOrder(OrderDTO orderdto);
	ApiResponseDTO getOrderNumberbyId(Long id);

}
