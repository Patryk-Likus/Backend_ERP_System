package com.Backend_ERP_System.service;

import com.Backend_ERP_System.dto.ItemSaveDto;
import com.Backend_ERP_System.entity.Item;
import com.Backend_ERP_System.entity.Warehouse;
import com.Backend_ERP_System.repository.ItemRepository;
import com.Backend_ERP_System.repository.QuantityTypeRepository;
import com.Backend_ERP_System.repository.WarehouseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.Backend_ERP_System.entity.QuantityType;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;
    private final WarehouseRepository warehouseRepository;
    private final QuantityTypeRepository quantityTypeRepository;


    public Item saveItem(ItemSaveDto dto){
        Optional<Warehouse> warehouseOptional = warehouseRepository.findById(dto.getIdWarehouse());
        Optional<QuantityType> quantityTypeOptional = quantityTypeRepository.findById(dto.getIdQuantityType());
        if(!warehouseOptional.isPresent() || !quantityTypeOptional.isPresent()){
            throw new RuntimeException("Incorrect identifiers: id:warehouse: "
                    + dto.getIdWarehouse() + ", idQuantityType:" + dto.getIdQuantityType());
        }

        Warehouse warehouse = warehouseOptional.get();
        QuantityType quantityType = quantityTypeOptional.get();
        Item item = Item.of(dto);
        item.setQuantityType(quantityType);
        item.setWarehouse(warehouse);
        return itemRepository.save(item);
    }


}
