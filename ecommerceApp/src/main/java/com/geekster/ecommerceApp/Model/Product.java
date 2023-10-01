package com.geekster.ecommerceApp.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {
//    id:integer
//    name:string
//    price:integer
//    description:string
//    category:string
//    brand:string

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Integer productId;
    private String productName;
    private Integer productPrice;
    private String productDescription;
    private String productCategory;
    private String productBrand;

}
