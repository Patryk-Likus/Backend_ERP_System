package com.Backend_ERP_System.controller;

import com.Backend_ERP_System.service.WarehouseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.Backend_ERP_System.dto.WarehouseModuleDto;
import com.Backend_ERP_System.entity.Warehouse;
import com.Backend_ERP_System.repository.WarehouseRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class WarehouseController {

    private final WarehouseRepository warehouseRepository;
    private final WarehouseService warehouseService;

    @PostMapping("/warehouses")
    Warehouse newWarehouse(@RequestBody Warehouse warehouse){
        return warehouseRepository.save(warehouse);
    }

    @GetMapping("/warehouses")
    List<Warehouse> listWarehouses(){
        return warehouseRepository.findAll();
    }

    @DeleteMapping("/warehouses")
    ResponseEntity deleteWarehouse(@RequestBody Long idWarehouse){
        warehouseRepository.deleteById(idWarehouse);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/warehouse_module_data")
    public WarehouseModuleDto getWarehouseModuleData(@RequestParam Optional<String> idWarehouse){
        if(idWarehouse.isPresent()){
            return warehouseService.getWarehouseModuleData(Long.parseLong(idWarehouse.get()));
        } else {
            return warehouseService.getWarehouseModuleData();
        }
    }

}
