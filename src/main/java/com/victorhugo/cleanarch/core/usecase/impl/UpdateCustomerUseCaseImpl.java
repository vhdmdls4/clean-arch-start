package com.victorhugo.cleanarch.core.usecase.impl;

import com.victorhugo.cleanarch.core.dataprovider.FindAddressByZipCode;
import com.victorhugo.cleanarch.core.dataprovider.UpdateCustomer;
import com.victorhugo.cleanarch.core.domain.Address;
import com.victorhugo.cleanarch.core.domain.Customer;
import com.victorhugo.cleanarch.core.usecase.FindCustomerByIdUseCase;
import com.victorhugo.cleanarch.core.usecase.UpdateCustomerUseCase;

public class UpdateCustomerUseCaseImpl implements UpdateCustomerUseCase {

    private final FindCustomerByIdUseCase findCustomerByIdUseCase;
    private final FindAddressByZipCode findAddressByZipCode;
    private final UpdateCustomer updateCustomer;

    public UpdateCustomerUseCaseImpl(FindCustomerByIdUseCase findCustomerByIdUseCase, FindAddressByZipCode findAddressByZipCode, UpdateCustomer updateCustomer){
        this.findCustomerByIdUseCase = findCustomerByIdUseCase;
        this.findAddressByZipCode = findAddressByZipCode;
        this.updateCustomer = updateCustomer;
    }

    @Override
    public void update(Customer customer, String zipCode) {
        findCustomerByIdUseCase.find(customer.getId());
        Address address = findAddressByZipCode.find(zipCode);
        customer.setAddress(address);
        updateCustomer.update(customer);
    }
}
