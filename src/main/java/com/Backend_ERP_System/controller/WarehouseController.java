package com.Backend_ERP_System.controller;


import com.Backend_ERP_System.entity.Warehouse;
import com.Backend_ERP_System.repository.WarehouseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class WarehouseController {

    private WarehouseRepository warehouseRepository;

    @PostMapping("/warehouses")
    public Warehouse newWarehouse(@RequestBody Warehouse newWarehouse){
        return warehouseRepository.save(newWarehouse);
    }

    @GetMapping("/warehouses")
    public List<Warehouse> listWarehouses(){
        return warehouseRepository.findAll();
    }

    @DeleteMapping("/warehouses")
    public ResponseEntity deleteWarehouse(@RequestBody Long idWarehouse){
        warehouseRepository.deleteById(idWarehouse);
        return ResponseEntity.ok().build();
    }
}
