package com.victorhugo.cleanarch.entrypoint.controller;

import com.victorhugo.cleanarch.core.domain.Customer;
import com.victorhugo.cleanarch.core.usecase.FindCustomerByIdUseCase;
import com.victorhugo.cleanarch.core.usecase.InsertCustomerUseCase;
import com.victorhugo.cleanarch.entrypoint.controller.mapper.CustomerMapper;
import com.victorhugo.cleanarch.entrypoint.controller.request.InsertCustomerRequest;
import com.victorhugo.cleanarch.entrypoint.controller.response.CustomerResponse;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
    private final InsertCustomerUseCase insertCustomerUseCase;
    private final CustomerMapper customerMapper;
    private final FindCustomerByIdUseCase findCustomerByIdUseCase;
    public CustomerController(InsertCustomerUseCase insertCustomerUseCase, CustomerMapper customerMapper, FindCustomerByIdUseCase findCustomerByIdUseCase) {
        this.insertCustomerUseCase = insertCustomerUseCase;
        this.customerMapper = customerMapper;
        this.findCustomerByIdUseCase = findCustomerByIdUseCase;
    }

    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody InsertCustomerRequest insertCustomerRequest){
        var customer = customerMapper.toCustomer(insertCustomerRequest);
        insertCustomerUseCase.insert(customer, insertCustomerRequest.getZipCode());
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerResponse> findById(@PathVariable final Long id) {
        Customer customer = findCustomerByIdUseCase.find(id);
        CustomerResponse customerResponse = customerMapper.toCustomerResponse(customer);
        return ResponseEntity.ok(customerResponse);
    }
}
