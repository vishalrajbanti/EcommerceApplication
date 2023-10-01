package com.geekster.ecommerceApp.Service;

import com.geekster.ecommerceApp.Model.User;
import com.geekster.ecommerceApp.Repo.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    IUserRepo iUserRepo;

    public String addUsers(List<User> myusers) {
        iUserRepo.saveAll(myusers);
        return "user's added";
    }

    public List<User> getUsers() {
        return iUserRepo.findAll();
    }

    public User getuserById(Integer id) {
        return iUserRepo.findById(id).orElseThrow();
    }
}
