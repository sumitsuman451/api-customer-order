package com.rest.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.api.models.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
