package com.amazon.onlinemarket.Dto;

import lombok.Getter;
import lombok.Setter;
import com.amazon.onlinemarket.model.Category;
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
