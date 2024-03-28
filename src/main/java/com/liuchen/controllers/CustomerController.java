package com.liuchen.springbootjpa.controllers;

import com.liuchen.springbootjpa.pojo.Customer;
import com.liuchen.springbootjpa.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Package: com.liuchen.springbootjpa.controllers
 * Description:
 *
 * @Author: Liu-Chen-CS
 * @Create: 3/28/2024 - 12:03 PM
 * @Version: v1.0
 */

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;
    @GetMapping("/find")
    public Iterable<Customer> get(){
        return customerService.get();
    }
}
