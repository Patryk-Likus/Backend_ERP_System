package com.Backend_ERP_System.controller;

import com.Backend_ERP_System.entity.QuantityType;
import com.Backend_ERP_System.repository.QuantityTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class QuantityTypeController {

    private QuantityTypeRepository quantityTypeRepository;

    @PostMapping("/quantity_types")
    public QuantityType newQuantityType(@RequestBody QuantityType newQuantityType){
        return quantityTypeRepository.save(newQuantityType);
    }

    @GetMapping("/quantity_types")
    public List<QuantityType> listQuantityTypes(){
        return quantityTypeRepository.findAll();
    }

    @DeleteMapping("/quantity_types")
    public ResponseEntity deleteQuantityType(@RequestBody Long idQuantityType){
        quantityTypeRepository.deleteById(idQuantityType);
        return ResponseEntity.ok().build();
    }
}
