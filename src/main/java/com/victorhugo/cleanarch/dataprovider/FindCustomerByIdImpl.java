package com.victorhugo.cleanarch.dataprovider;

import com.victorhugo.cleanarch.core.dataprovider.FindCustomerById;
import com.victorhugo.cleanarch.core.domain.Customer;
import com.victorhugo.cleanarch.dataprovider.repository.CustomerRepository;
import com.victorhugo.cleanarch.dataprovider.repository.entity.CustomerEntity;
import com.victorhugo.cleanarch.dataprovider.repository.mapper.CustomerEntityMapper;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FindCustomerByIdImpl implements FindCustomerById {
    private final CustomerRepository customerRepository;
    private final CustomerEntityMapper customerEntityMapper;

    public FindCustomerByIdImpl(CustomerRepository customerRepository, CustomerEntityMapper customerEntityMapper) {
        this.customerRepository = customerRepository;
        this.customerEntityMapper = customerEntityMapper;
    }

    @Override
    public Optional<Customer> find(final String id) {
        var customerEntity = customerRepository.findById(id).orElse(null);
        return customerEntity.map
    }
}
