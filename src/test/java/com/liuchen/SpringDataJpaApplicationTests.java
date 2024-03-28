package com.liuchen;

import com.liuchen.pojo.Customer;
import com.liuchen.repositories.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class SpringDataJpaApplicationTests {

    @Autowired
    CustomerRepository customerRepository;

    @Test
    void contextLoads() {
        Customer customer = Customer.builder()
                .customerAge(89)
                .customerName("Chris Luno").build();

        customerRepository.save(customer);
    }


    @Test
    void test02(){
        Optional<Customer> byId = customerRepository.findById(3L);
        System.out.println(byId.get());
    }

    @Test
    void test_03(){
        Customer customer = Customer.builder()
                .customerID(3L)
                .customerName("John Wayne")
                .customerAge(45)
                .build();
        customerRepository.save(customer);
    }

    @Test
    void test_04(){
        customerRepository.deleteById(11L);
    }

}
