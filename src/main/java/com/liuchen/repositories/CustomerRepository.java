package com.liuchen.springbootjpa.repositories;

import com.liuchen.springbootjpa.pojo.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

/**
 * Package: com.liuchen.springbootjpa.repositories
 * Description:
 *
 * @Author: Liu-Chen-CS
 * @Create: 3/28/2024 - 12:10 PM
 * @Version: v1.0
 */
@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
