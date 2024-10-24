package com.victorhugo.cleanarch.core.usecase;

import com.victorhugo.cleanarch.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdUseCase {
    Customer find(final String id);
}
