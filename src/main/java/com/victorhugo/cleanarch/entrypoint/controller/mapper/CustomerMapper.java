package com.victorhugo.cleanarch.entrypoint.controller.mapper;

import com.victorhugo.cleanarch.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "isValidCpf", ignore = true)
    @Mapping(target = "deleted", ignore = true)
    @Mapping(target = "lastSession", ignore = true)
    @Mapping(target = "address", ignore = true)
    Customer toCustomer(Customer customer);
}
