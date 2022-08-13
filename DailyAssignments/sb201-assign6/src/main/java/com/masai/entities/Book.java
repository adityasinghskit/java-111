package com.masai.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Cascade;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Book {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Min(value=1,message="id should more than 0")
private Integer bookId;
private String name;
private String publication;
private String category;
@Min(value=1,message="pages should more than 0")
private Integer pages;
@Min(value=1,message="price should more than 0")
private Integer price;

@ManyToOne(cascade=CascadeType.ALL)
@JoinColumn(name="authorId")
@JsonIgnore
private Author author;


}
