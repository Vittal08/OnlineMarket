package Dto;

import lombok.Getter;
import lombok.Setter;
import model.Category;
@Getter
@Setter
public class ProResDto {
    private Integer id;
    private String price;
    private String title ;
    private String description;
    private String imgurl;
    private Category category;

}
