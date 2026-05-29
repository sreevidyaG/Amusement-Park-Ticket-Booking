package com.cg.mts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.mts.entities.Customer;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Long>{

	@Query(name = "SELECT u from customer u where u.username= :username and u.password= :password ", nativeQuery = true)
	Customer findByUsernameAndPassword(String username, String password);

}
