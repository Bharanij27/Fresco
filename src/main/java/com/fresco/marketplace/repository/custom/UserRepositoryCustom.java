package com.fresco.marketplace.repository.custom;

import com.fresco.marketplace.model.User;

public interface UserRepositoryCustom{
    public User findByUsername(String username);
}
