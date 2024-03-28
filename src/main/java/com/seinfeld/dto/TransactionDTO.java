package com.seinfeld.dto;

import lombok.Data;

@Data
public class TransactionDTO {
    private String uuid;
    private Long totalInCents;
}
