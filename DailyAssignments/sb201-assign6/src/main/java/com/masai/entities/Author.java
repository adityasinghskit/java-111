package com.masai.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Author {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@NotNull
@Min(value=1,message="id should more than 0")
private Integer authorId;
private String name;
@Min(value=1,message="age should more than 0")
private Integer age;
private String address;

@OneToMany(cascade=CascadeType.ALL)
private List<Book> books= new ArrayList<>();
}
