package Service;


import Dto.FakestoreDto;
import model.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class Fakestore implements  ProductService {
    private final RestTemplate rt;
    public Fakestore(RestTemplate rt){
        this.rt= rt ;
    }
    @Override
    public Product getProductbyid(Integer id) {
        ResponseEntity<FakestoreDto> response = rt.getForEntity("https://fakestoreapi.com/products/1"+ id,
                FakestoreDto.class);
        FakestoreDto convertedjson = response.getBody();
        return convertedjson.toProduct();
    }

    @Override
    public Product getAllProduct() {
        return null;
    }
}
