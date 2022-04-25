package ru.saubulprojects.searchapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ru.saubulprojects.searchapp.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
	
	@Query("SELECT p FROM Product p "
		 + "WHERE p.name LIKE CONCAT('%', :query, '%')"
		 + "OR p.description LIKE CONCAT('%', :query, '%')")
	public List<Product> searchProducts(String query);
	
}

