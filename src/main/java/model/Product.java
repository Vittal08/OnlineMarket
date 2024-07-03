package model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Product {
    private Integer id ;
    private  String title ;
    private String description ;
    private String imgurl;
    private  String price;
    private Category category;
    
}



