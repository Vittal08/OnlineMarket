package com.amazon.onlinemarket.Controller;

import com.amazon.onlinemarket.Dto.ProResDto;
import com.amazon.onlinemarket.Service.ProductService;
import com.amazon.onlinemarket.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/get")
public class ProductController  {
    public ProductService ps ;
    public ProductController(ProductService ps){
        this.ps = ps;
    }

    @GetMapping("/products/{id}")
    public ProResDto getProductsbyid(@PathVariable("id")Integer id  ){
        Product pro = ps.getProductbyid(id);
        //converting product -> ProductResponseDto
        return ConvertProductToProResDto(pro);

    }
    private ProResDto ConvertProductToProResDto(Product pro){
        ProResDto dto = new ProResDto();
        dto.setId(pro.getId());
        dto.setCategory(pro.getCategory());
        dto.setPrice(pro.getPrice());
        dto.setTitle(pro.getTitle());
        dto.setDescription(pro.getDescription());
        dto.setImgurl(pro.getImgurl());
        return dto;
    }
}
