package com.victorhugo.cleanarch.core.usecase.impl;

import com.victorhugo.cleanarch.core.dataprovider.FindCustomerById;
import com.victorhugo.cleanarch.core.domain.Customer;
import com.victorhugo.cleanarch.core.usecase.FindCustomerByIdUseCase;
import org.springframework.stereotype.Component;

@Component
public class FindCustomerByIdUseCaseImpl implements FindCustomerByIdUseCase {
    private final FindCustomerById findCustomerById;

    public FindCustomerByIdUseCaseImpl(FindCustomerById findCustomerById) {
        this.findCustomerById = findCustomerById;
    }

    @Override
    public Customer find(final Long id) {
        return findCustomerById.find(id).orElseThrow(() -> new RuntimeException("Cliente não encontrado"));
    }
}
