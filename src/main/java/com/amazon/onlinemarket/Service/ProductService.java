package com.amazon.onlinemarket.Service;

import com.amazon.onlinemarket.model.Product;

public interface ProductService {

    Product getProductbyid(Integer id );
    Product getAllProduct();

}
