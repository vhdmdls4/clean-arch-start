package com.victorhugo.cleanarch.dataprovider.repository;

import com.victorhugo.cleanarch.dataprovider.repository.entity.AddressEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AddressRepository extends MongoRepository<AddressEntity, String> {
}
