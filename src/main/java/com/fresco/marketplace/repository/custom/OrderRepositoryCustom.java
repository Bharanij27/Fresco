package com.fresco.marketplace.repository.custom;

import com.fresco.marketplace.model.Order;

import java.util.List;


public interface OrderRepositoryCustom {
    public List<Order> findOrdersByCustomerName(String name);
}
