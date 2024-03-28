package com.liuchen.springbootjpa.pojo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Package: com.liuchen.pojo
 * Description:
 *
 * @Author: Liu-Chen-CS
 * @Create: 3/28/2024 - 10:39 AM
 * @Version: v1.0
 */

@Entity
@Table(name = "tb_customer")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Long customerID;

    @Column(name = "customer_name")
    private String customerName;

    @Column(name = "customer_age")
    private Integer customerAge;

}
