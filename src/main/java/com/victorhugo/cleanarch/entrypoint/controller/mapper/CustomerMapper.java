package com.victorhugo.cleanarch.entrypoint.controller.mapper;

import com.victorhugo.cleanarch.core.domain.Customer;
import com.victorhugo.cleanarch.entrypoint.controller.request.InsertCustomerRequest;
import com.victorhugo.cleanarch.entrypoint.controller.response.CustomerResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "isValidCpf", ignore = true)
    @Mapping(target = "deleted", ignore = true)
    @Mapping(target = "lastSession", ignore = true)
    @Mapping(target = "address", ignore = true)
    Customer toCustomer(InsertCustomerRequest insertCustomerRequest);
    CustomerResponse toCustomerResponse(Customer customer);
}
