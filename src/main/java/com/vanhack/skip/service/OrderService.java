package com.vanhack.skip.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vanhack.skip.domain.Order2;
import com.vanhack.skip.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	OrderRepository orderRepository;
	
	public List<Order2> findAll() {
		return (List<Order2>) orderRepository.findAll();
	}
	
	public Order2 findById(Long id) {
		return orderRepository.findById(id).get();
	}
}
