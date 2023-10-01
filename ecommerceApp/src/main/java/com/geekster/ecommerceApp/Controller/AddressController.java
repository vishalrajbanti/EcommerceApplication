package com.geekster.ecommerceApp.Controller;

import com.geekster.ecommerceApp.Model.Address;
import com.geekster.ecommerceApp.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;

    @PostMapping("address")
    public String addAddress(@RequestBody Address address){
        return addressService.addAddress(address);

    }
    // get all address
    @GetMapping("address")
    public List<Address> getAddresses(){
        return addressService.getAddresses();
    }


}
