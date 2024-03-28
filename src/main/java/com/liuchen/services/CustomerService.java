package com.liuchen.services;

import com.liuchen.pojo.Customer;

import java.util.Optional;

/**
 * Package: com.liuchen.springbootjpa.services
 * Description:
 *
 * @Author: Liu-Chen-CS
 * @Create: 3/28/2024 - 12:06 PM
 * @Version: v1.0
 */

public interface CustomerService {

    Optional<Customer> get();

}
