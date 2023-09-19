package com.example.spring02.services;

import com.example.spring02.models.Product;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Primary
public class ProductService {

    public List<Product> generateProducts() {
        List<Product> productList = new ArrayList<>();


        for (long i = 1; i <= 5; i++) {
            Product product = new Product();
            product.setId(i);
            product.setName("Product " + i);
            product.setPrice(10.0 * i);
            productList.add(product);
        }

        return productList;
    }



}
