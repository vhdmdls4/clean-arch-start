package com.victorhugo.cleanarch.dataprovider;

import com.victorhugo.cleanarch.core.dataprovider.DeleteCustomerById;
import com.victorhugo.cleanarch.dataprovider.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class DeleteCustomerByIdImpl implements DeleteCustomerById {
    private final CustomerRepository customerRepository;

    @Override
    public void delete(Long id) {
        customerRepository.deleteById(id);
    }
}
