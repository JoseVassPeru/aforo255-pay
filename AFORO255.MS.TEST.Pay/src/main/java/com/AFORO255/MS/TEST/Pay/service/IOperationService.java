package com.AFORO255.MS.TEST.Pay.service;

import com.AFORO255.MS.TEST.Pay.domain.Operation;

public interface IOperationService {
    public Operation finById(Integer id);
    public Operation save(Operation operation);
}
