package com.sample.jpa.demojpa;

import com.sample.jpa.demojpa.model.Customer;
import com.sample.jpa.demojpa.repository.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.List;
import java.util.Optional;
import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@DataJpaTest
public class CustomerRepositoryTests {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private CustomerRepository customers;


    @Test
    public void testFindByLastName() {
        Customer customer = new Customer("first", "last","3312265369");
       entityManager.persistAndFlush(customer);
//
        List<Customer> findByFirstName = customers.findByFirstName("first");

        assertThat(findByFirstName).extracting(Customer::getFirstName).containsOnly(customer.getFirstName());
        Optional<Customer> findByNationalCode = customers.findByNationalCode("3312265360");
//        assertThat(findByNationalCode).containsSame(customer.getNationalCode())
    }

}
