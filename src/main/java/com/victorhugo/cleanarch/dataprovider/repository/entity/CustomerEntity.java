package com.victorhugo.cleanarch.dataprovider.repository.entity;

import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDate;

@Document(collation = "customers")
@Data
public class CustomerEntity {
    @Id
    private Long id;
    private String name;
    private String email;
    private String cpf;
    private AddressEntity addressEntity;
    private LocalDate lastSession;
    private Boolean isValidCpf;
    private boolean deleted = Boolean.FALSE;
}
