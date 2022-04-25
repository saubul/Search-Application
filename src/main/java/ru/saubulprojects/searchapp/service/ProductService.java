package ru.saubulprojects.searchapp.service;

import java.util.List;

import ru.saubulprojects.searchapp.model.Product;

public interface ProductService {
	List<Product> searchProducts(String query);
}
