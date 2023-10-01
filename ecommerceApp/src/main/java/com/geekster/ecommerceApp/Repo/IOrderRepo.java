package com.geekster.ecommerceApp.Repo;

import com.geekster.ecommerceApp.Model.Order_1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderRepo extends JpaRepository<Order_1,Integer> {

}
