package com.amazon.onlinemarket.Service;


import com.amazon.onlinemarket.Dto.FakeStoreDto;
import com.amazon.onlinemarket.model.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class Fakestore implements  ProductService {
    private RestTemplate rt;
    public Fakestore(RestTemplate rt){
        this.rt= rt;
    }
    @Override
    public Product getProductbyid(Integer id) {
        ResponseEntity<FakeStoreDto> response =
                rt.getForEntity("https://fakestoreapi.com/products/"+ id,
                FakeStoreDto.class);
        FakeStoreDto convertedjson = response.getBody();
        return convertedjson.toProduct();
    }

    @Override
    public Product getAllProduct() {
        return null;
    }
}