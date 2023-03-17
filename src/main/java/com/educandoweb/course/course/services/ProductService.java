package com.educandoweb.course.course.services;

import com.educandoweb.course.course.entities.Category;
import com.educandoweb.course.course.entities.Product;
import com.educandoweb.course.course.repository.CategoryRepository;
import com.educandoweb.course.course.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> obj = productRepository.findById(id);
        return obj.get();
    }
}
