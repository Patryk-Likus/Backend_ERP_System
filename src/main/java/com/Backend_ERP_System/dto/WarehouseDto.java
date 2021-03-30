package com.Backend_ERP_System.dto;

import lombok.Data;
import com.Backend_ERP_System.entity.Warehouse;

@Data
public class WarehouseDto {

    private Long idWarehouse;
    private String name;

    public static WarehouseDto of(Warehouse warehouse){
        WarehouseDto dto = new WarehouseDto();
        dto.setIdWarehouse(warehouse.getIdWarehouse());
        dto.setName(warehouse.getName());
        return dto;
    }

}
