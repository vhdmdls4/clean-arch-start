package com.victorhugo.cleanarch.core.usecase;

import com.victorhugo.cleanarch.core.domain.Customer;

public interface FindCustomerByIdUseCase {
    Customer find(final Long id);
}
