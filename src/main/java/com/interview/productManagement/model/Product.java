package com.interview.productManagement.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product_tbl")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prod_id")
    private Integer id;
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "product_description")
    private String productDescription;
    @Column(name = "price")
    private String price;
    @Column(name = "date")
    private Date date;
}
