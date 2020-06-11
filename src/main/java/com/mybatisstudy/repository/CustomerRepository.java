package com.mybatisstudy.repository;

import com.mybatisstudy.entity.Customer;

public interface CustomerRepository {
    Customer findById(long id);
}
