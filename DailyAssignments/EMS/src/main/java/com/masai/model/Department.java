package com.masai.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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
public class Department {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Min(value=1, message="deptId cannot be negetive")
private Integer deptId;

@NotNull
@Enumerated(EnumType.STRING)
private DeptName deptName;
@NotNull
@Size(min=3, max=16, message="Address should be between 3 & 16 in size")
private String address;
@OneToMany(cascade =CascadeType.ALL, mappedBy="department")
@JsonIgnore
List<Employee> employees= new ArrayList<>();
}
