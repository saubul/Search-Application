package ru.saubulprojects.searchapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ru.saubulprojects.searchapp.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
