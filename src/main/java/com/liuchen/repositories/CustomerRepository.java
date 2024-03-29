package com.liuchen.repositories;
import com.liuchen.pojo.Customer;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


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

    @Query("from Customer where customerName = :hello")
    Customer findCustomerByCustomerName(@Param("hello") String customerName);

    @Transactional
    @Modifying
    int deleteByCustomerID(Long id);


    List<Customer> findCustomerByCustomerNameLike(String str);

}
