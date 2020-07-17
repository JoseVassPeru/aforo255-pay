package com.AFORO255.MS.TEST.Pay.dao;

import com.AFORO255.MS.TEST.Pay.domain.Operation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperationDao extends CrudRepository<Operation,Integer> {

}
