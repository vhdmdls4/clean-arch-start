package com.victorhugo.cleanarch.core.dataprovider;

import com.victorhugo.cleanarch.core.domain.Address;

public interface FindAddressByZipCode {
    Address find(final String zipCode);
}
