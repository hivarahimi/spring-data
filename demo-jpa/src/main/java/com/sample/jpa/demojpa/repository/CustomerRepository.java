package com.sample.jpa.demojpa.repository;

import com.sample.jpa.demojpa.model.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends CrudRepository<Customer,Long> {

    public Optional<Customer> findByNationalCode(String nationalCode);

    List<Customer> findByFirstName(String firstName);

    public Optional<Customer> findById(Long id);
}
