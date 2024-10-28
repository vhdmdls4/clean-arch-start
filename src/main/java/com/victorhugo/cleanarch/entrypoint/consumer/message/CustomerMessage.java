package com.victorhugo.cleanarch.entrypoint.consumer.message;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerMessage {
    private Long id;
    private String name;
    private String email;
    private String cpf;
    private String zipCode;
    private LocalDate lastSession;
    private Boolean isValidCpf;
    private boolean deleted;
}
