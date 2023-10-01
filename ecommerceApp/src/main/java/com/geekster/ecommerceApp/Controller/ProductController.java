package com.geekster.ecommerceApp.Controller;

import com.geekster.ecommerceApp.Model.Product;
import com.geekster.ecommerceApp.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    // add products
    @PostMapping("product")
    public String addProduct(@RequestBody Product myproduct){
        return productService.addProduct(myproduct);
    }

    // get all products
    @GetMapping("products")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }
    @DeleteMapping("product/id/{id}")
    public String deleteProductById(@PathVariable Integer id){
        return productService.deleteProductById(id);
    }


}







