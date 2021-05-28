package com.fresco.marketplace.repository;

import com.fresco.marketplace.model.Order;

import org.springframework.data.repository.CrudRepository;
import com.fresco.marketplace.repository.custom.OrderRepositoryCustom;

public interface OrderHibernateRepository extends CrudRepository<Order,Long>,OrderRepositoryCustom {
    
}
