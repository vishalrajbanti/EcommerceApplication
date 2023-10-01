package com.geekster.ecommerceApp.Service;

import com.geekster.ecommerceApp.Model.Address;
import com.geekster.ecommerceApp.Repo.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    IAddressRepo iAddressRepo;

    public String addAddress(Address address) {
        iAddressRepo.save(address);
        return "added";
    }

    public List<Address> getAddresses() {
        return (List<Address>) iAddressRepo.findAll();
    }
}
