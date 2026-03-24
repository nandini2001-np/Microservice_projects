package com.practice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.practice.dto.ApiResponseDTO;

import com.practice.dto.OrderDTO;
import com.practice.dto.ProductDTO;

import com.practice.entity.Order;
import com.practice.repo.OrderRepo;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	private OrderRepo repo;
	
//	@Autowired
//	private RestTemplate restTemplate;
	
//	@Autowired
//	private WebClient webclient;
	
	@Autowired
	private APIClient apiclient;

	@Override
	public OrderDTO saveOrder(OrderDTO orderdto) {
		Order order=new Order();
		order.setOrderId(orderdto.getOrderId());
		order.setOrderNumber(orderdto.getOrderNumber());
		order.setQuantity(orderdto.getQuantity());
		order.setTotalPrice(orderdto.getTotalPrice());
		order.setProductCode(orderdto.getProductCode());
		
		Order saved = repo.save(order);
		
		return new OrderDTO(
				saved.getOrderId(),
				saved.getOrderNumber(),
				saved.getQuantity(),
				saved.getTotalPrice(),
				saved.getProductCode()
				);
   
		
	}

	@Override
	public ApiResponseDTO getOrderNumberbyId(Long id) {

	    Order order = repo.findById(id).orElseThrow(() -> new RuntimeException("Order not found with id: " + id));
	    
	     //using Open Feign      
	    ProductDTO productDTO = apiclient.getProductByCode(order.getProductCode());
	    

	    OrderDTO orderDTO = new OrderDTO(
	            order.getOrderId(),
	            order.getOrderNumber(),
	            order.getQuantity(),
	            order.getTotalPrice(),
	            order.getProductCode()
	    );

	    ApiResponseDTO apiResponseDTO = new ApiResponseDTO();
	    apiResponseDTO.setProductDTO(productDTO);
	    apiResponseDTO.setOrderDTO(orderDTO);

	    return apiResponseDTO;
	}


}
