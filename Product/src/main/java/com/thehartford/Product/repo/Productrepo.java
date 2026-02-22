package com.thehartford.Product.repo;

import com.thehartford.Product.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Productrepo extends JpaRepository<Product, Integer> {


}
