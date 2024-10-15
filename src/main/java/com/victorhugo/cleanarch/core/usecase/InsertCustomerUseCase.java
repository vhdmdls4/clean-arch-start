package com.victorhugo.cleanarch.core.usecase;

import com.victorhugo.cleanarch.core.domain.Customer;

public interface InsertCustomerUseCase {
    void insert(Customer customer, String zipCode);
}
