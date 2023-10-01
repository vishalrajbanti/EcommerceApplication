package com.geekster.ecommerceApp.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address {

  //  UserID : foreign key mapping


 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer adressId;
     private String addressName;
     private String landmark;
     private String phoneNumber;
     private String zipcode;
     private String state;

 @OneToOne
 @JoinColumn(name = "user_id")
     private User user;
}
