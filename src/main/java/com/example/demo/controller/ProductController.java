package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) { this.productService = productService; }

    @GetMapping
    public String start(Model model){
        List<Product> products = productService.getAllProducts();
        model.addAttribute("products", products);
        return "start"; }

    @GetMapping("addProduct")
    public String getAddProduct(Model model){
        List<Product> products = productService.getAllProducts();
        model.addAttribute("products", products);
        return "addProduct";
    }
    @PostMapping("addProducts")
    public String addProducts(@RequestParam String name,
                              @RequestParam int price,
                              @RequestParam String description,
                              @RequestParam String manufacturer,
                              @RequestParam String category){
        Product product = new Product(name, price, description, manufacturer, category);
        productService.save(product);
        return "addProduct";
    }
}
