package com.liuchen.repositories;
import com.liuchen.pojo.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

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
