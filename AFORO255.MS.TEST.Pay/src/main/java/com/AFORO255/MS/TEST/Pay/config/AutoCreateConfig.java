package com.AFORO255.MS.TEST.Pay.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class AutoCreateConfig {

    //se crea el topico para que el framework lo cree automaticamente
    @Bean  //encapsulamiente
    public NewTopic payEvets(){
        return TopicBuilder.name("operation-events")
                .partitions(3)
                .replicas(1)
                .build();
    }
}
