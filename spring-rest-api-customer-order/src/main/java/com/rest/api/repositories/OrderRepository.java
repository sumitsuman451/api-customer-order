package com.rest.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.api.models.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer>{

}
