package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface Customerrepo extends JpaRepository<Customers,Integer>{

}
