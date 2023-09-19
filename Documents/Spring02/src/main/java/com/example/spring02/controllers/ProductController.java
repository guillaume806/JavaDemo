package com.example.spring02.controllers;

import com.example.spring02.models.Product;
import com.example.spring02.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {


    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/listing")
    public String productList(Model model) {
        List<Product> products = productService.generateProducts();
        model.addAttribute("products", products);
        return "product/listing";
    }
    @GetMapping("/{id}")
    public String productDetails(@PathVariable Long id, Model model) {
        Product product = findProductById(id);
        if (product != null) {
            model.addAttribute("product", product);
            return "product/details";
        } else {
            return "error/404";
        }
    }

    private Product findProductById(Long id) {
        List<Product> products = productService.generateProducts();

        for (Product product : products) {
            if (product.getId().equals(id)) {
                return product;
            }
        }

        return null;
    }



}
