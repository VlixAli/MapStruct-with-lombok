package com.seinfeld.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Data
public class Transaction {
    private Long id;
    private String uuid = UUID.randomUUID().toString();
    private BigDecimal total;

}
