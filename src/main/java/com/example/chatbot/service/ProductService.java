package com.example.chatbot.service;

import com.example.chatbot.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    public void addProduct(Product product);
    public List<Product> getAllProduct();
    public void deleteProduct(Integer id);
    public Optional<Product> getProduct(Integer id);
    public void modifyProduct(Product product);
}
