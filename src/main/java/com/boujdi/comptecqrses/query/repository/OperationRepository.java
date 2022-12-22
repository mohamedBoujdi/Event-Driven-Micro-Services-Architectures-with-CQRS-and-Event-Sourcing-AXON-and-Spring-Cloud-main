package com.boujdi.comptecqrses.query.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boujdi.comptecqrses.query.entities.Operation;

public interface OperationRepository extends JpaRepository<Operation, Long> {

}
