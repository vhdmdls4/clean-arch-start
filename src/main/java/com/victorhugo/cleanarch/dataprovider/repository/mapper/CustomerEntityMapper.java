package com.victorhugo.cleanarch.dataprovider.repository.mapper;

import com.victorhugo.cleanarch.core.domain.Customer;
import com.victorhugo.cleanarch.dataprovider.repository.entity.CustomerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {
    CustomerEntity toCustomerEntity(Customer customer);
}
