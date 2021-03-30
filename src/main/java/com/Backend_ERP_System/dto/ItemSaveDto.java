package com.Backend_ERP_System.dto;

import lombok.Data;

@Data
public class ItemSaveDto {

    private Long idItem;
    private String name;
    private Double quantity;
    private Long idQuantityType;
    private Long idWarehouse;
}
