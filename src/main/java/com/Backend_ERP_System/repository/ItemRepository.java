package com.Backend_ERP_System.repository;

import com.Backend_ERP_System.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
