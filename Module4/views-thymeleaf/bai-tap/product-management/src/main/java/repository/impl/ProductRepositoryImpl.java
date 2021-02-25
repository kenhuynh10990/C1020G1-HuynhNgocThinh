package repository.impl;

import bean.Product;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ProductRepositoryImpl implements ProductRepository {
    private static Map<Integer, Product> productMap = new TreeMap<>();

    static {
        productMap.put(1, new Product(1, "Toy", 21));
        productMap.put(2, new Product(2, "Car", 21));
        productMap.put(3, new Product(3, "Child Toy", 21));
        productMap.put(4, new Product(4, "Chair", 21));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public void save(Product product) {
        productMap.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return productMap.get(id);
    }

    @Override
    public void update(int id, Product product) {
        productMap.put(id, product);
    }

    @Override
    public void remove(int id) {
        productMap.remove(id);
    }
}
