package com.boujdi.comptecqrses.query.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boujdi.comptecqrses.query.entities.Account;

public interface AccountRepository extends JpaRepository<Account, String>{
	

}
