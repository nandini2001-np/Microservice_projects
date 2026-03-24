package com.practice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.entity.Order;

public interface OrderRepo extends JpaRepository<Order,Long>{

}
