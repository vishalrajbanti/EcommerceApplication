package com.geekster.ecommerceApp.Repo;

import com.geekster.ecommerceApp.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends JpaRepository<User,Integer> {
}
