package com.geekster.ecommerceApp.Service;

import com.geekster.ecommerceApp.Model.Address;
import com.geekster.ecommerceApp.Model.Order_1;
import com.geekster.ecommerceApp.Model.Product;
import com.geekster.ecommerceApp.Model.User;
import com.geekster.ecommerceApp.Repo.IAddressRepo;
import com.geekster.ecommerceApp.Repo.IOrderRepo;
import com.geekster.ecommerceApp.Repo.IProductRepo;
import com.geekster.ecommerceApp.Repo.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    IOrderRepo iOrderRepo;

    @Autowired
    IAddressRepo AddressRepo;
    @Autowired
    IProductRepo ProductRepo;

    @Autowired
    IUserRepo UserRepo;
    public Order_1 getOrderById(Integer id) {
        return iOrderRepo.findById(id).orElseThrow();
    }


    public String addOrder(Order_1 myorder) {
        iOrderRepo.save(myorder);
        return "order added";
    }

    public String placeOrder(Integer id1, Integer id2, Integer id3) {
        User user = UserRepo.findById(id1).orElseThrow();

     Address address = AddressRepo.findById(id2).orElseThrow();

        Product product = ProductRepo.findById(id3).orElseThrow();

        Order_1 order1 = new Order_1();
        order1.setUser(user);
        order1.setAddress(address);
        order1.setProduct(product);

        iOrderRepo.save(order1);
        return "order placed";
    }
}
