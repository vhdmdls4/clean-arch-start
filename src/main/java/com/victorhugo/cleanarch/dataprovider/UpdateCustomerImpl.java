package com.victorhugo.cleanarch.dataprovider;

import com.victorhugo.cleanarch.core.dataprovider.UpdateCustomer;
import com.victorhugo.cleanarch.core.domain.Customer;
import com.victorhugo.cleanarch.dataprovider.repository.CustomerRepository;
import com.victorhugo.cleanarch.dataprovider.repository.entity.CustomerEntity;
import com.victorhugo.cleanarch.dataprovider.repository.mapper.CustomerEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class UpdateCustomerImpl implements UpdateCustomer {
    private final CustomerRepository customerRepository;
    private final CustomerEntityMapper customerEntityMapper;

    @Override
    public void update(Customer customer) {
        CustomerEntity customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }
}
