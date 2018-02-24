package com.eroger.www.model;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class Product {

    private String name;
    private Date expirationDate;
}
