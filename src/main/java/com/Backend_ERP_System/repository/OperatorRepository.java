package com.Backend_ERP_System.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Backend_ERP_System.entity.Operator;

import java.util.Optional;

public interface OperatorRepository extends JpaRepository<Operator, Long> {

    public Optional<Operator> findByLogin(String login);
}
