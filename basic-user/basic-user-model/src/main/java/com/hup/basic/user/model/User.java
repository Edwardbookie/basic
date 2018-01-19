package com.hup.basic.user.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * @author to dapeng
 */
@Data
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "user_name")
    private String userName;
    @Column
    private String name;
    @Column
    private Integer age;
    @Column
    private BigDecimal balance;
}
