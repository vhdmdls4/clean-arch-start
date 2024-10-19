package com.victorhugo.cleanarch.dataprovider.client;

import com.victorhugo.cleanarch.dataprovider.client.response.AddressResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "FindAddressByZipCode", url = "${victorhugo.cliente.address.url}")
public interface FindAddressByZipCodeClient {
    @GetMapping("/zipCode")
    AddressResponse find(String zipCode);
}
