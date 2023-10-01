package com.geekster.ecommerceApp.Service;

import com.geekster.ecommerceApp.Model.Product;
import com.geekster.ecommerceApp.Repo.IOrderRepo;
import com.geekster.ecommerceApp.Repo.IProductRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
   @Autowired
    IProductRepo iProductRepo;
@Autowired
   IOrderRepo iOrderRepo;

@Transactional
    public List<Product> getAllProducts() {
        return  iProductRepo.getAllProducts();
    }


    public String addProduct(Product myproduct) {
        iProductRepo.save(myproduct);
        return "added";
    }

    public String deleteProductById(Integer id) {
    iOrderRepo.deleteById(id);
    iProductRepo.deleteById(id);
    return "deleted";
    }
}
