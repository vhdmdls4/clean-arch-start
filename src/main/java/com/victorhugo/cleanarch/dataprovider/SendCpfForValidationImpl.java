package com.victorhugo.cleanarch.dataprovider;

import com.victorhugo.cleanarch.core.dataprovider.SendCpfForValidation;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SendCpfForValidationImpl implements SendCpfForValidation {
    private final KafkaTemplate<String, String> kafkaTemplate;
    @Override
    public void send(String cpf) {
        kafkaTemplate.send("tp-cpf-validation", cpf);
    }
}
