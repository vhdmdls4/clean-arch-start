package com.victorhugo.cleanarch.config;

import com.victorhugo.cleanarch.core.usecase.impl.InsertCustomerUseCaseImpl;
import com.victorhugo.cleanarch.dataprovider.FindAddressByZipCodeImpl;
import com.victorhugo.cleanarch.dataprovider.InsertCustomerImpl;
import com.victorhugo.cleanarch.dataprovider.SendCpfForValidationImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {
    @Bean
    public InsertCustomerUseCaseImpl insertCustomerUseCase(FindAddressByZipCodeImpl findAddressByZipCode, InsertCustomerImpl insertCustomer, SendCpfForValidationImpl sendCpfForValidation){
        return new InsertCustomerUseCaseImpl(findAddressByZipCode, insertCustomer, sendCpfForValidation);
    }
}
