package com.liuchen.springbootjpa.services;

import com.liuchen.springbootjpa.pojo.Customer;
import org.springframework.stereotype.Service;

/**
 * Package: com.liuchen.springbootjpa.services
 * Description:
 *
 * @Author: Liu-Chen-CS
 * @Create: 3/28/2024 - 12:06 PM
 * @Version: v1.0
 */

public interface CustomerService {

    Iterable<Customer> get();

}
