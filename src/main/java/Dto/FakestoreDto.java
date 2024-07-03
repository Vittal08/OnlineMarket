package Dto;

import lombok.Getter;
import lombok.Setter;
import model.Category;
import model.Product;

@Getter
@Setter
public class FakestoreDto {
    private Integer id ;
    private String price;
    private String title ;
    private String description ;
    private String category;
    private String image;

    public Product toProduct(){
        Product p = new Product();
        p.setId(id);
        p.setDescription(description);
        p.setImgurl(image);
        p.setTitle(title);

        Category c = new Category();
        c.setName(category);
        p.setCategory(c);
        return p;
    }
}
