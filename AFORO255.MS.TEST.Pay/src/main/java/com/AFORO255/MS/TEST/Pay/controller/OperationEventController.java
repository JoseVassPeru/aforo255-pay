package com.AFORO255.MS.TEST.Pay.controller;

import com.AFORO255.MS.TEST.Pay.domain.Operation;
import com.AFORO255.MS.TEST.Pay.producer.OperationEventProducer;
import com.AFORO255.MS.TEST.Pay.service.IOperationService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.apache.coyote.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OperationEventController {
    private Logger log = LoggerFactory.getLogger(OperationEventProducer.class);
    @Autowired
    private IOperationService operationService;

    @Autowired
    private OperationEventProducer operationEventProducer;

    @PostMapping("/v1/operationevent")
    public ResponseEntity<Operation> postOperationEvent(@RequestBody Operation operationEvent) throws JsonProcessingException {
        log.info("antes sql");
        Operation operation1Sql = operationService.save(operationEvent);
        log.info("despues sql");
        log.info("anntes sendDeopistEvent");
        operationEventProducer.sendOperationEvent(operation1Sql);
        return ResponseEntity.status(HttpStatus.CREATED).body(operation1Sql);
    };
}
