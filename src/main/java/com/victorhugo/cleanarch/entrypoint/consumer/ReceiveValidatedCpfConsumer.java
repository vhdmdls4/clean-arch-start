package com.victorhugo.cleanarch.entrypoint.consumer;

import com.victorhugo.cleanarch.core.domain.Customer;
import com.victorhugo.cleanarch.core.usecase.UpdateCustomerUseCase;
import com.victorhugo.cleanarch.entrypoint.consumer.mapper.CustomerMessageMapper;
import com.victorhugo.cleanarch.entrypoint.consumer.message.CustomerMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ReceiveValidatedCpfConsumer {
    private final UpdateCustomerUseCase updateCustomerUseCase;
    private final CustomerMessageMapper customerMessageMapper;
    @KafkaListener(topics = "tp-cpf-validated", groupId = "victor.duarte")
    public void receive(CustomerMessage customerMessage) {
        Customer customer = customerMessageMapper.toCustomer(customerMessage);
        updateCustomerUseCase.update(customer, customerMessage.getZipCode());
    }
}
