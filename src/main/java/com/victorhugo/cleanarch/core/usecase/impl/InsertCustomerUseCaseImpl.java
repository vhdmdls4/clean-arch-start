package com.victorhugo.cleanarch.core.usecase.impl;

import com.victorhugo.cleanarch.core.dataprovider.FindAddressByZipCode;
import com.victorhugo.cleanarch.core.domain.Address;
import com.victorhugo.cleanarch.core.domain.Customer;
import com.victorhugo.cleanarch.core.usecase.InsertCustomerUseCase;

public class InsertCustomerUseCaseImpl implements InsertCustomerUseCase {

    private final FindAddressByZipCode findAddressByZipCode;

    @Override
    public void insert(Customer customer, String zipCode) {
        Address address = findAddressByZipCode.find(zipCode);
    }
}
