package com.victorhugo.cleanarch.dataprovider;

import com.victorhugo.cleanarch.core.dataprovider.InsertCustomer;
import com.victorhugo.cleanarch.core.domain.Customer;
import com.victorhugo.cleanarch.dataprovider.repository.CustomerRepository;
import com.victorhugo.cleanarch.dataprovider.repository.entity.CustomerEntity;
import com.victorhugo.cleanarch.dataprovider.repository.mapper.CustomerEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class InsertCustomerImpl implements InsertCustomer {
    private final CustomerEntityMapper customerEntityMapper;
    private final CustomerRepository customerRepository;
    @Override
    public void insert(Customer customer) {
        CustomerEntity customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }
}
