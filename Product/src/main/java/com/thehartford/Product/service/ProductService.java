package com.thehartford.Product.service;

import com.thehartford.Product.Model.Product;
import com.thehartford.Product.repo.Productrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private Productrepo repo;
    
    public Product createProduct(Product product){
        return repo.save(product);
    }

    public List<Product> getAllProducts(){
        return repo.findAll();
    }

    public Optional<Product> getProductById(int id) {
        return repo.findById(id);
    }

    public Product updateProduct(Product product){
        return repo.save(product);
    }

    public void deleteProduct(int id){
        repo.deleteById(id);
    }



    /*

    public void deleteProduct(int id){
        repo.deleteById(id);
    }

    */

}
