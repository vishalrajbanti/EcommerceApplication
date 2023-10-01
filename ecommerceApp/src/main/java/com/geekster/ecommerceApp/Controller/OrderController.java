package com.geekster.ecommerceApp.Controller;

import com.geekster.ecommerceApp.Model.Order_1;
import com.geekster.ecommerceApp.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {
@Autowired
    OrderService orderService;


// place an order
    @PostMapping("order/user/id/{id1}/address/id/{id2}/product/id/{id3}")
 public String placeOrder(@PathVariable Integer id1,@PathVariable Integer id2,@PathVariable Integer id3){
        return orderService.placeOrder(id1,id2,id3);
    }

    //add a order
@PostMapping("order")
public String addOrder(@RequestBody Order_1 myorder){
    return orderService.addOrder(myorder);
}




    //get order by id
    @GetMapping("order/{id}")
    public Order_1 getOrderById(@PathVariable Integer id){
        return orderService.getOrderById(id);
    }
}
