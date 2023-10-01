package com.geekster.ecommerceApp.Controller;

import com.geekster.ecommerceApp.Model.User;
import com.geekster.ecommerceApp.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    // add a list of users

    @PostMapping("users")
    public String addUsers(@RequestBody List<User> myusers){
        return userService.addUsers(myusers);
    }
    // get all users
    @GetMapping("users")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    // get user by user id
    @GetMapping("user/id/{id}")
    public User getUserById(@RequestBody Integer id){
        return userService.getuserById(id);
    }

}
