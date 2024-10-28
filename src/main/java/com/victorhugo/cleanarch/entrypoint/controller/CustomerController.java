package com.victorhugo.cleanarch.entrypoint.controller;

import com.victorhugo.cleanarch.core.domain.Customer;
import com.victorhugo.cleanarch.core.usecase.DeleteCustomerByIdUseCase;
import com.victorhugo.cleanarch.core.usecase.FindCustomerByIdUseCase;
import com.victorhugo.cleanarch.core.usecase.InsertCustomerUseCase;
import com.victorhugo.cleanarch.core.usecase.UpdateCustomerUseCase;
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
    private final UpdateCustomerUseCase updateCustomerUseCase;
    private final DeleteCustomerByIdUseCase deleteCustomerByIdUseCase;
    public CustomerController(InsertCustomerUseCase insertCustomerUseCase, CustomerMapper customerMapper, FindCustomerByIdUseCase findCustomerByIdUseCase, UpdateCustomerUseCase updateCustomerUseCase, DeleteCustomerByIdUseCase deleteCustomerByIdUseCase) {
        this.insertCustomerUseCase = insertCustomerUseCase;
        this.customerMapper = customerMapper;
        this.findCustomerByIdUseCase = findCustomerByIdUseCase;
        this.updateCustomerUseCase = updateCustomerUseCase;
        this.deleteCustomerByIdUseCase = deleteCustomerByIdUseCase;
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
    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable final Long id, @Valid @RequestBody InsertCustomerRequest insertCustomerRequest){
        Customer customer = customerMapper.toCustomer(insertCustomerRequest);
        customer.setId(id);
        updateCustomerUseCase.update(customer, insertCustomerRequest.getZipCode());
        return ResponseEntity.noContent().build();
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable final Long id){
        deleteCustomerByIdUseCase.delete(id);
        return ResponseEntity.noContent().build();
    }
}
