package com.geekster.ecommerceApp.Repo;


import com.geekster.ecommerceApp.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepo extends JpaRepository<Address,Integer> {
}
