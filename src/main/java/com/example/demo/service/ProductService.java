package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) { this.productRepository = productRepository; }

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public void save(Product product){
        productRepository.save(product);
    }

    public void deleteById(String id){
        productRepository.deleteById(id);
    }

    public Product getById(String id){
        return  productRepository.findById(id).orElseThrow(()-> new ResponseStatusException(
                HttpStatus.NOT_FOUND,
                String.format("Товар с id %s не найден", id)
        ));
    }
}
