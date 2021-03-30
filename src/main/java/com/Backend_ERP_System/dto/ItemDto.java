package com.Backend_ERP_System.dto;

import lombok.Data;
import com.Backend_ERP_System.entity.Item;

@Data
public class ItemDto {

    private Long idItem;
    private String name;
    private Double quantity;
    private String quantityType;

    public static ItemDto of(Item item){
        ItemDto dto = new ItemDto();
        dto.setIdItem(item.getIdItem());
        dto.setName(item.getName());
        dto.setQuantity(item.getQuantity());
        dto.setQuantityType(item.getQuantityType().getName());
        return dto;
    }

}
