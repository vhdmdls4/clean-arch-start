package com.victorhugo.cleanarch.core.usecase;

import com.victorhugo.cleanarch.core.domain.Customer;

public interface UpdateCustomerUseCase {
    void update(Customer customer, String zipCode);
}