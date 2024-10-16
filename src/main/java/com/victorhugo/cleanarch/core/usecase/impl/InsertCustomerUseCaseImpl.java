package com.victorhugo.cleanarch.core.usecase.impl;

import com.victorhugo.cleanarch.core.dataprovider.FindAddressByZipCode;
import com.victorhugo.cleanarch.core.dataprovider.InsertCustomer;
import com.victorhugo.cleanarch.core.domain.Address;
import com.victorhugo.cleanarch.core.domain.Customer;
import com.victorhugo.cleanarch.core.usecase.InsertCustomerUseCase;

public class InsertCustomerUseCaseImpl implements InsertCustomerUseCase {

    private final FindAddressByZipCode findAddressByZipCode;
    private final InsertCustomer insertCustomer;

    public InsertCustomerUseCaseImpl(FindAddressByZipCode findAddressByZipCode, InsertCustomer insertCustomer) {
        this.findAddressByZipCode = findAddressByZipCode;
        this.insertCustomer = insertCustomer;
    }

    @Override
    public void insert(Customer customer, String zipCode) {
        Address address = findAddressByZipCode.find(zipCode);
        customer.setAddress(address);
        insertCustomer.insert(customer);
    }
}
