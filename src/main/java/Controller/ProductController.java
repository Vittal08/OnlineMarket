package Controller;

import Dto.ProResDto;
import Service.ProductService;
import model.Product;
import org.jetbrains.annotations.NotNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
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
    public ProResDto ConvertProductToProResDto(@NotNull Product pro){
        ProResDto dto = new ProResDto();
        dto.setId(pro.getId());
        dto.setCategory(pro.getCategory());
        dto.setPrice(pro.getPrice());
        dto.setTitle(pro.getTitle());
        dto.setDescription(pro.getDescription());
        return dto;
    }
}
