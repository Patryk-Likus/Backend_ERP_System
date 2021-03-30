package com.Backend_ERP_System.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.Backend_ERP_System.dto.QuantityTypeDto;
import com.Backend_ERP_System.entity.QuantityType;
import com.Backend_ERP_System.repository.QuantityTypeRepository;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class QuantityTypeController {

    private final QuantityTypeRepository quantityTypeRepository;

    @PostMapping("/quantity_types")
    QuantityType newQuantityType(@RequestBody QuantityType quantityType){
        return quantityTypeRepository.save(quantityType);
    }

    @GetMapping("/quantity_types")
    List<QuantityTypeDto> listQuantityTypes(){
        return quantityTypeRepository.findAll().stream().map(QuantityTypeDto::of).collect(Collectors.toList());
    }

    @DeleteMapping("/quantity_types")
    ResponseEntity deleteQuantityType(@RequestBody Long idQuantityType){
        quantityTypeRepository.deleteById(idQuantityType);
        return ResponseEntity.ok().build();
    }

}
