package com.victorhugo.cleanarch.core.usecase.impl;

import com.victorhugo.cleanarch.core.dataprovider.DeleteCustomerById;
import com.victorhugo.cleanarch.core.usecase.DeleteCustomerByIdUseCase;
import com.victorhugo.cleanarch.core.usecase.FindCustomerByIdUseCase;

public class DeleteCustomerByIdUseCaseImpl implements DeleteCustomerByIdUseCase {
    private final FindCustomerByIdUseCase findCustomerByIdUseCase;
    private final DeleteCustomerById deleteCustomerById;

    public DeleteCustomerByIdUseCaseImpl(FindCustomerByIdUseCase findCustomerByIdUseCase, DeleteCustomerById deleteCustomerById) {
        this.findCustomerByIdUseCase = findCustomerByIdUseCase;
        this.deleteCustomerById = deleteCustomerById;
    }

    @Override
    public void delete(Long id) {
        findCustomerByIdUseCase.find(id);
        deleteCustomerById.delete(id);
    }
}
