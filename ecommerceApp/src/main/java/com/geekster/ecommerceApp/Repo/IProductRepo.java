package com.geekster.ecommerceApp.Repo;

import com.geekster.ecommerceApp.Model.Order_1;
import com.geekster.ecommerceApp.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductRepo extends JpaRepository<Product,Integer> {
    @Modifying
    @Query(value = "SELECT * FROM PRODUCT",nativeQuery = true)
    List<Product> getAllProducts();
}
