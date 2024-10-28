package com.victorhugo.cleanarch.dataprovider.repository;

import com.victorhugo.cleanarch.dataprovider.repository.entity.AddressEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends MongoRepository<AddressEntity, String> {
}
