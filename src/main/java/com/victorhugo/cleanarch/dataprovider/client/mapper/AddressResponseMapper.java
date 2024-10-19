package com.victorhugo.cleanarch.dataprovider.client.mapper;

import com.victorhugo.cleanarch.core.domain.Address;
import com.victorhugo.cleanarch.dataprovider.client.response.AddressResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {
    Address toAddress(AddressResponse addressResponse);
}
