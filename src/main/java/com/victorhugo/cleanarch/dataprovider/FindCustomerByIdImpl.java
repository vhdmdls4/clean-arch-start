package com.victorhugo.cleanarch.dataprovider;

import com.victorhugo.cleanarch.core.dataprovider.FindCustomerById;
import com.victorhugo.cleanarch.core.domain.Customer;
import com.victorhugo.cleanarch.dataprovider.repository.CustomerRepository;
import com.victorhugo.cleanarch.dataprovider.repository.entity.CustomerEntity;
import com.victorhugo.cleanarch.dataprovider.repository.mapper.CustomerEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@RequiredArgsConstructor
@Component
public class FindCustomerByIdImpl implements FindCustomerById {
    private final CustomerRepository customerRepository;
    private final CustomerEntityMapper customerEntityMapper;

    @Override
    public Optional<Customer> find(final Long id) {
        Optional<CustomerEntity> customerEntity = customerRepository.findById(id);
        return customerEntity.map(customerEntityMapper::toCustomer);
    }
}
