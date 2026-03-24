package com.practice.controller;



	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.http.HttpStatus;
	import org.springframework.http.ResponseEntity;
	import org.springframework.web.bind.annotation.*;

	import com.practice.dto.ApiResponseDTO;
	import com.practice.dto.OrderDTO;
	import com.practice.service.OrderService;

	@RestController
	@RequestMapping("/api/order")
	public class OrderController {

	    @Autowired
	    private OrderService service;

	   
	    @PostMapping("/save")
	    public ResponseEntity<OrderDTO> saveOrder(@RequestBody OrderDTO orderDTO) {
	        OrderDTO savedOrder = service.saveOrder(orderDTO);
	        return new ResponseEntity<>(savedOrder, HttpStatus.CREATED);
	    }

	    
	    @GetMapping("/id/{id}")
	    public ResponseEntity<ApiResponseDTO> getOrderById(@PathVariable Long id) {
	        ApiResponseDTO response = service.getOrderNumberbyId(id);
	        return ResponseEntity.ok(response);
	    }
	}



