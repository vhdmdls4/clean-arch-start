package com.victorhugo.cleanarch.entrypoint.controller;

import com.victorhugo.cleanarch.core.usecase.InsertCustomerUseCase;
import com.victorhugo.cleanarch.entrypoint.controller.mapper.CustomerMapper;
import com.victorhugo.cleanarch.entrypoint.controller.request.InsertCustomerRequest;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
    private final InsertCustomerUseCase insertCustomerUseCase;
    private final CustomerMapper customerMapper;
    public CustomerController(InsertCustomerUseCase insertCustomerUseCase, CustomerMapper customerMapper) {
        this.insertCustomerUseCase = insertCustomerUseCase;
        this.customerMapper = customerMapper;
    }

    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody InsertCustomerRequest insertCustomerRequest){
        var customer = customerMapper.toCustomer(insertCustomerRequest);
        insertCustomerUseCase.insert(customer, insertCustomerRequest.getZipCode());
        return ResponseEntity.ok().build();
    }
}
