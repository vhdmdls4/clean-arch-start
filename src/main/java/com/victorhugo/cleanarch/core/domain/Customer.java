package com.victorhugo.cleanarch.core.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
public class Customer {
    private Long id;
    private String name;
    private String email;
    private String cpf;
    private Address address;
    private LocalDate lastSession;
    private Boolean isValidCpf;
    private boolean deleted = Boolean.FALSE;

    public Customer(){
        this.isValidCpf = false;
    }

    public Customer(Long id, String name, String email, String cpf, Address address, LocalDate lastSession, Boolean isValidCpf, boolean deleted) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.cpf = cpf;
        this.address = address;
        this.isValidCpf = isValidCpf;
    }
}
