package com.victorhugo.cleanarch.entrypoint.controller;

import com.victorhugo.cleanarch.entrypoint.controller.request.InsertCustomerRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
    @PostMapping
    public ResponseEntity<Void> insert(InsertCustomerRequest insertCustomerRequest){
        return ResponseEntity.ok().build();
    }
}