package com.programming.tech.product_service.dto;

import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@ToString
public class ProductResponse {
    private String id;
    private String name;
    private String description;
    private BigDecimal price;
}
