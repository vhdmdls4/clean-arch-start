package com.victorhugo.cleanarch.dataprovider.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "FindAddressByZipCode", url = "${victorhugo.cliente.address.url}")
public interface FindAddressByZipCode {
    
}
