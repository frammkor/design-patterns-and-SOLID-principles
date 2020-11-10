package com.company.intersegrega.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.company.intersegrega.entity.Order;

//Stores Order entities
public class OrderPersistenceService implements PersistenceService<Order> {
	
	private static final Map<Long, Order> ORDERS = new HashMap<>();
	
	@Override
	public void save(Order entity) {
		synchronized (ORDERS) {
			ORDERS.put(entity.getId(), entity);
		}
	}

	@Override
	public void delete(Order entity) {
		synchronized (ORDERS) {
			ORDERS.remove(entity.getId());
		}
	}

	@Override
	public Order findById(Long id) {
		synchronized (ORDERS) {
			return ORDERS.get(id);
		}
	}

	//? we do not need to override a class that did not have sense to have in the implemented interface

}
