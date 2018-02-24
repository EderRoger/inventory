package com.eroger.www.controller;

import com.eroger.www.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class ProductController {

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public @ResponseBody
    Product product() {
        return Product.builder().name("chicken").expirationDate(new Date()).build();
    }
}
