package com.victorhugo.cleanarch.core.dataprovider;

import com.victorhugo.cleanarch.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerById {
    Optional<Customer> find(final Long id);
}
