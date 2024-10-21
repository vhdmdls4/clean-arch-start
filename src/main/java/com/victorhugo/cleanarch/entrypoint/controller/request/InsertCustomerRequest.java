package com.victorhugo.cleanarch.entrypoint.controller.request;

import jakarta.validation.constraints.NotBlank;

public class InsertCustomerRequest {
    @NotBlank
    private String name;
    @NotBlank private String email;
    @NotBlank private String cpf;
    @NotBlank private String password;
}
