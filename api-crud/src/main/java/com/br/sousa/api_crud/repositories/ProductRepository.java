package com.br.sousa.api_crud.repositories;

import com.br.sousa.api_crud.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
