package com.eroger.www.service;

import com.eroger.www.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    public List<Product> getAllProducts(){
        return new ArrayList<>();
    }
}
