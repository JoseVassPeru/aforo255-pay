package com.AFORO255.MS.TEST.Pay.service;

import com.AFORO255.MS.TEST.Pay.dao.OperationDao;
import com.AFORO255.MS.TEST.Pay.domain.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OperationServiceImpl implements IOperationService{

    @Autowired
    private OperationDao operationDao;

    @Override
    @Transactional(readOnly = true)
    public Operation finById(Integer id) {
        return operationDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Operation save(Operation operation) {
        return operationDao.save(operation);
    }
}
