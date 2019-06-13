package com.example.products.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.products.domain.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long>{
	
	public Product findProductById(Long id);

}
