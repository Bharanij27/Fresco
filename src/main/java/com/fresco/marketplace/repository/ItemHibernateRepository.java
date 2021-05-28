package com.fresco.marketplace.repository;

import com.fresco.marketplace.model.Item;
import com.fresco.marketplace.repository.custom.ItemRepositoryCustom;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface ItemHibernateRepository extends CrudRepository<Item,Long>,ItemRepositoryCustom {

}
