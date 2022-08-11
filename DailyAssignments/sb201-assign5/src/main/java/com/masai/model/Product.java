package com.masai.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product {
@NotNull
@Min(value=1, message="{id.invaid}")
private Integer id;
@Size(min=3, max=16, message="{name.invalid}")
private String name;
@Min(value=1, message="{id.invaid}")
private Integer price;
@Size(min=3, max=16, message="{name.invalid}")
private String brand;
@Size(min=3, max=16, message="{name.invalid}")
private String category;
@Min(value=1, message="{id.invaid}")
private Integer registration_number;
@Min(value=1, message="{id.invaid}")
private Integer manufacturing_id;


}
