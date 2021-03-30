package com.Backend_ERP_System.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Backend_ERP_System.entity.Warehouse;

public interface WarehouseRepository extends JpaRepository<Warehouse, Long> {
}
