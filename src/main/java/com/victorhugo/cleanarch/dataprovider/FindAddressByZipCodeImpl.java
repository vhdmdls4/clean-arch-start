package com.victorhugo.cleanarch.dataprovider;

import com.victorhugo.cleanarch.core.dataprovider.FindAddressByZipCode;
import com.victorhugo.cleanarch.core.domain.Address;
import com.victorhugo.cleanarch.dataprovider.client.FindAddressByZipCodeClient;
import com.victorhugo.cleanarch.dataprovider.client.mapper.AddressResponseMapper;
import com.victorhugo.cleanarch.dataprovider.client.response.AddressResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class FindAddressByZipCodeImpl implements FindAddressByZipCode {

    private final FindAddressByZipCodeClient findAddressByZipCodeClient;
    private final AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
        AddressResponse addressResponse = findAddressByZipCodeClient.find(zipCode);
        return addressResponseMapper.toAddress(addressResponse);
    }
}
