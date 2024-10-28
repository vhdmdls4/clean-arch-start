package com.victorhugo.cleanarch.dataprovider.repository;

import com.victorhugo.cleanarch.dataprovider.repository.entity.CustomerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends MongoRepository<CustomerEntity, Long> {
}
