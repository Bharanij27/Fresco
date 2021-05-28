package com.fresco.marketplace.repository.custom;

import java.util.List;
import com.fresco.marketplace.model.Item;

public interface ItemRepositoryCustom {
    public Item findByName(String name);
    public List<Item> findAllByCategory(String category);
}
