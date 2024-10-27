package com.victorhugo.cleanarch.entrypoint.controller.response;

import com.victorhugo.cleanarch.dataprovider.client.response.AddressResponse;
import lombok.Data;

import java.time.LocalDate;

@Data
public class CustomerResponse {
    private String name;
    private String cpf;
    private String email;
    private AddressResponse addressResponse;
    private LocalDate lastSession;
    private Boolean isValidCpf;

}
