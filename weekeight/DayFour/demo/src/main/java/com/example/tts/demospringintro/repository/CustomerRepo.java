package com.example.tts.demospringintro.repository;

import com.example.tts.demospringintro.model.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepo extends CrudRepository<Customer, Long> {
    List<Customer> findByLastName(String lastName);
}
