package com.vanhack.skip.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vanhack.skip.domain.Order2;
import com.vanhack.skip.service.OrderService;

@RestController
@RequestMapping("order")
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@GetMapping("/all")
	private List<Order2> findAllOrders() {
		return orderService.findAll();
	}
	
	@GetMapping("/{id}")
	public Order2 getChildProducts(@PathVariable("id") Long orderId) {
		return orderService.findById(orderId);
	}
	
}
