package com.geekster.ecommerceApp.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Order_1 {
//    id:integer
//    userID:integer (foreign key mapping)
//    productID:integer(foreign key mapping)
//    addressID:integer(foreign key mapping)
//    productQuantity:integer
//
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;
    private Integer orderedProductQuantity;


    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;

}
