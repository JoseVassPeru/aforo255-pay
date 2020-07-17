package com.AFORO255.MS.TEST.Pay.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "db_operation")
public class Operation implements Serializable {

    @Id
    @Column(name = "id_operation")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idOperation;
    @Column(name = "id_invoice")
    private Integer idInvoice;
    private double amount;
    private Date date;

    public Integer getIdOperation() {
        return idOperation;
    }

    public void setIdOperation(Integer idOperation) {
        this.idOperation = idOperation;
    }

    public Integer getIdInvoice() {
        return idInvoice;
    }

    public void setIdInvoice(Integer idInvoice) {
        this.idInvoice = idInvoice;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
