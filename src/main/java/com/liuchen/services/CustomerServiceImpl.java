package com.liuchen.springbootjpa.services;

import com.liuchen.springbootjpa.pojo.Customer;
import com.liuchen.springbootjpa.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Package: com.liuchen.springbootjpa.services
 * Description:
 *
 * @Author: Liu-Chen-CS
 * @Create: 3/28/2024 - 12:06 PM
 * @Version: v1.0
 */

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Iterable<Customer> get() {
        return customerRepository.findAll();
    }

}
