package ru.saubulprojects.searchapp.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import ru.saubulprojects.searchapp.model.Product;
import ru.saubulprojects.searchapp.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{

	private final ProductRepository productRepo;
	
	public ProductServiceImpl(ProductRepository productRepo) {
		this.productRepo = productRepo;
	}
	
	@Override
	public List<Product> searchProducts(String query) {
		return productRepo.searchProducts(query);
	}
	
}
