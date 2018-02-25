package com.eroger.www.controller;

import com.eroger.www.model.Product;
import com.eroger.www.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ProductController {

    private final ProductService productService;

    public ProductController(final ProductService productService) {
        this.productService = productService ;
    }

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public @ResponseBody
    List<Product> all() {
        return productService.getAllProducts();
    }
}
