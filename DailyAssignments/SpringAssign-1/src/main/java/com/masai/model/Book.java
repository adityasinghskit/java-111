package com.masai.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
public class Book {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@NotNull
private int bookId;
@NotNull
private String name;
@NotNull
private String author;
@NotNull
private String publication;
@NotNull
private String category;
@NotNull
private int pages;
@NotNull
private int price;
}
